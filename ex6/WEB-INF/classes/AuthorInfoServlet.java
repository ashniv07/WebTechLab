import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthorInfoServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String authorName = request.getParameter("authorName");

            HttpSession session = request.getSession();
            session.setAttribute("favoriteAuthor", authorName);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style>");
            out.println("  body {");
            out.println("    background-color: #f0f0f0;");
            out.println("    display: flex;");
            out.println("    justify-content: center;");
            out.println("    align-items: center;");
            out.println("    height: 100vh;");
            out.println("    margin: 0;");
            out.println("    text-align: center;");
            out.println("    font-family: Arial, sans-serif;");
            out.println("  }");
            out.println("  .content {");
            out.println("    background: #fff;");
            out.println("    padding: 20px;");
            out.println("    border-radius: 10px;");
            out.println("  }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='content'>");
            out.println("<h1>Favorite Author Information</h1>");
            out.println("<p>Your favorite author is: " + authorName + "</p>");
            out.println("<a href='AuthorInfoDisplayServlet'>Visit Author Info</a>");
            out.println("</div>");
            out.println("</body></html>");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
