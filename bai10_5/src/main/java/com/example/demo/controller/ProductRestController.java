package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class ProductRestController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products")
    public RedirectView saveProduct(
            @RequestParam("name") String name,
            @RequestParam("price") double price,
            @RequestParam("description") String description,
            @RequestParam("image") MultipartFile imageFile) {

        String imagePath = null;

        if (!imageFile.isEmpty()) {
            try {
                String originalFilename = imageFile.getOriginalFilename();
                String lowerCaseFilename = originalFilename.toLowerCase();

                // Kiểm tra đuôi file hợp lệ
                if (!lowerCaseFilename.endsWith(".jpg") &&
                    !lowerCaseFilename.endsWith(".jpeg") &&
                    !lowerCaseFilename.endsWith(".png") &&
                    !lowerCaseFilename.endsWith(".gif") &&
                    !lowerCaseFilename.endsWith(".webp")) {
                    throw new IllegalArgumentException("Chỉ cho phép upload file ảnh (.jpg, .png, .gif, .webp)");
                }

                // Thư mục đích trong static/images
                String uploadDir = "src/main/resources/static/images";
                File uploadDirFile = new File(uploadDir);
                if (!uploadDirFile.exists()) {
                    uploadDirFile.mkdirs();
                }

                // Lưu file vào thư mục images
                Path filePath = Paths.get(uploadDir, originalFilename);
                Files.write(filePath, imageFile.getBytes());

                // Đường dẫn tương đối để hiển thị trên web
                imagePath = "/images/" + originalFilename;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Lưu vào DB
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setImagePath(imagePath);

        productRepository.save(product);

        return new RedirectView("/product-list");
    }
}
