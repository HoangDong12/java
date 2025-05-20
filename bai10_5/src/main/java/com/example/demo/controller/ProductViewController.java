package com.example.demo.controller;

import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductViewController {

    @Autowired
    private ProductRepository productRepository;

    // Hiển thị form thêm sản phẩm
    @GetMapping("/product-form")
    public String showProductForm() {
        return "product-form"; // trả về product-form.jsp
    }

    // Hiển thị danh sách sản phẩm
    @GetMapping("/product-list")
    public String viewProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "product-list"; // trả về product-list.jsp
    }
}
