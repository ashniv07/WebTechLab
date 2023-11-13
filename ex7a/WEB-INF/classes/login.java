import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class login extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html");
        Connection conn=null;
        Statement stmt=null;
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        out.println("<html><head><style>");
        out.println("body { text-align: center; }");
        out.println("h3 { font-size: 35px; }");
        out.println("p { font-size: 25px; }"); 
        out.println("</style></head><body>");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/BookLog","root", "");
            stmt = conn.createStatement();
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO details (name, password) VALUES (?, ?)"); 
            pstmt.setString(1, name);
            pstmt.setString(2, password);
          
            pstmt.executeUpdate();
            out.println("<br /> <h3>Signup Successful!</h3>");
            String sql = "SELECT * FROM details WHERE Name = ? AND password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            out.println("<html><body><p>Data Inserted:</p>");
            while(rs.next())
            {
            String uname = rs.getString("name");
            out.println("<p> username: " + uname + "<br>");      
            }
            out.println("</body></html>");
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            System.out.print("Do not connect to DB - Error:"+e);
        }
    }
}