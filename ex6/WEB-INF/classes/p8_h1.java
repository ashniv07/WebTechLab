import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class p8_h1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("genre");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style>");
            out.println("  body {");
            out.println("    background-image: url('back1.jpg');");
            out.println("    justify-content: center;");
            out.println("    align-items: center;");
            out.println("    height: 100vh;");
            out.println("    margin: 0;");
            out.println("    text-align: center;");
            out.println("    font-family: Arial, sans-serif;");
            out.println("  }");
            // out.println("  .content {");
            // out.println("    background: rgba(0, 0, 0, 0.7);");
            // out.println("    padding: 20px;");
            // out.println("    border-radius: 10px;");
            // out.println("    color: white;");
            // out.println("  }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='content'>");
            out.println("<h1>WOW!<br> " + n + " is a very good genre choice!</h1>");
            out.println("<p>Click below to see recommendations on it</p>");
            out.println("<form action='hidden2' method='POST'>");
            out.println("<input type='hidden' name='genre' value='" + n + "'>");
            out.println("<input type='submit' value='GO'>");
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html");

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
