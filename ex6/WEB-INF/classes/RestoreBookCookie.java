import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RestoreBookCookie extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='stylefav.css' />");
        out.println("<title>Restore Book Cookies</title></head>");
        out.println("<body class='flex-col'><h1>Restore Book Cookies</h1>");
        for (Cookie cookie : cookies) {
            out.println("<h2>Book: " + cookie.getName() + "</h2>");
            out.println("<h3>Author: " + cookie.getValue() + "</h3>");
        }
        out.println("</body></html>");
    }
}
