package listener;

import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebListener
public class SessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session được tạo: " + se.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session bị hủy: " + se.getSession().getId());
    }
}
