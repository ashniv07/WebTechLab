
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class page1 extends HttpServlet {
   private String message;
   public void init() throws ServletException {
      // Do required initialization
      message = "Love to read?<br>\r\n" + //
              "        You are at the right place...<br>\r\n" + //
              "        Enjoy!!!";
   }
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
   }
   public void destroy() {
      // do nothing.
   }
}