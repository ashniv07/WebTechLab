import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class page2 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        // Get the username parameter from the form
        String username = request.getParameter("username");

        // Set the content type and get the PrintWriter
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display a welcome message on the response page
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome Page</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Welcome, " + username + "!</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
