package filter;

import java.io.IOException;
import javax.servlet.*;

public class InputFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String username = request.getParameter("username");

        if (username == null || username.trim().isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp?error=true");
            rd.forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig fConfig) throws ServletException {}
    public void destroy() {}
}
