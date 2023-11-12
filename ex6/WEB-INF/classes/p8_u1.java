import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class p8_u1 extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
 PrintWriter out = response.getWriter();
 out.println("<html><head>");
 out.println("<link rel='stylesheet' href='stylebook.css'/><title>fav book</title></head>");
 out.println("<body class='flex-col'><h1>favourite book</h1>");
 out.println("<a href='p2?name=" +
request.getParameter("name") + "&fav=" +
request.getParameter("fav") + "'>Click here to see the URL</a>");
 out.println("</body></html>");
 }
}
