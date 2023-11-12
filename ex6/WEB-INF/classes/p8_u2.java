import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class p8_u2 extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
 PrintWriter out = response.getWriter();
 out.println("<html><head>");
 out.println("<link rel='stylesheet' href='stylebook.css' /><title>fav book</title></head>");
 out.println("<body class='flex-col'><h1>Rfavourite book</h1>");
 out.println("<h2>name: " + request.getParameter("name") + "</h2>");
 out.println("<h2>fav book: " + request.getParameter("fav") +"</h2>");
 out.println("</body></html>");
 }
}