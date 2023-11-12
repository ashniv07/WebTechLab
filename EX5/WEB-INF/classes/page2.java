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

        // Display a welcome message on the response page with CSS styling
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome Page</title>");
        out.println("<style>");
        out.println("  body {");
        out.println("    background-color: #f0f0f0;");
        out.println("    text-align: center;");
        out.println("    font-family: Arial, sans-serif;");
        out.println("  }");
        out.println("  h2 {");
        out.println("    background-color: #337ab7;");
        out.println("    color: #fff;");
        out.println("    padding: 10px;");
        out.println("    border-radius: 5px;");
        out.println("  }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Welcome, " + username + "!<br>Have an Awesome Reading!!!</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}

