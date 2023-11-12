import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class page1 extends HttpServlet {
   private String message;
   
   public void init() throws ServletException {
      message = "Love to read?<br>\r\n" + //
              "You are at the right place...<br>\r\n" + //
              "Enjoy!!!";
   }
   
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<style>");
      out.println("  body {");
      out.println("    background-color: purple;");
      out.println("    display: flex;");
      out.println("    justify-content: center;");
      out.println("    align-items: center;");
      out.println("    height: 100vh;");
      out.println("    margin: 0;");
      out.println("    text-align: center;");
      out.println("    font-family: Arial, sans-serif;");
      out.println("    color: white;");
      out.println("  }");
      out.println("</style>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>" + message + "</h1>");
      out.println("</body>");
      out.println("</html>");
   }
   
   public void destroy() {
      // do nothing.
   }
}
