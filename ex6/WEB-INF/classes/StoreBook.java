import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StoreBook extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie bookCookie = new Cookie(request.getParameter("book"), request.getParameter("author"));
        bookCookie.setMaxAge(60 * 60 * 24);
        response.addCookie(bookCookie);
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='stylefav.css' />");
        out.println("<title>Book Cookie</title></head>");
        out.println("<body class='flex-col'><h1>Book Cookie</h1>");
        out.println("<a href='restorebookcookie'>Click here to see the stored books</a>");
        out.println("</body></html>");
    }
}
