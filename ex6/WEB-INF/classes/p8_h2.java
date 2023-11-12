import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class p8_h2 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String bookGenre = request.getParameter("genre");

            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<style>");
            out.print("  body {");
            out.print("    background-image: url('back1.jpg');"); // Replace with your background image path
            out.print("    background-size: cover;");
            out.print("    background-repeat: no-repeat;");
            out.print("    background-attachment: fixed;");
            out.print("    display: flex;");
            out.print("    justify-content: center;");
            out.print("    align-items: center;");
            out.print("    height: 100vh;");
            out.print("    margin: 0;");
            out.print("  }");
            out.print("  .content {");
            out.print("    text-align: center;");
            out.print("    font-family: Arial, sans-serif;");
            out.print("    color: white;");
            out.print("  }");
            out.print("</style>");
            out.print("</head>");
            out.print("<body>");
            out.print("<div class='content'>");
            out.print("<h1>Book Recommendation</h1>");
            out.print("<p>You entered the genre: " + bookGenre + "</p>");
            out.print("<p>Here's a book recommendation for the " + bookGenre + " genre:</p>");

            String recommendation = getBookRecommendation(bookGenre);

            out.print("<p>" + recommendation + "</p>");
            out.print("</div>");
            out.print("</body></html>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private String getBookRecommendation(String genre) {
        if (genre.equalsIgnoreCase("Mystery")) {
            return "We recommend 'The Da Vinci Code' by Dan Brown.";
        } else if (genre.equalsIgnoreCase("horror")) {
            return "We recommend 'IT' by Stephen King.";
        } else if (genre.equalsIgnoreCase("FairyTale")) {
            return "We recommend 'Harry Potter and the Sorcerer's Stone' by J.K. Rowling.";
        } else {
            return "Sorry, we don't have a specific recommendation for this genre.";
        }
    }
}
