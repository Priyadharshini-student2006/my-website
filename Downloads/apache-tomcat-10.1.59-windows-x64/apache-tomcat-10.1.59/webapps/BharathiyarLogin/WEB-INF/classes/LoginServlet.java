import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String msg;
        if("bharathiyar".equals(user) && "12345".equals(pass)){
            msg = "Login Success - Welcome Bharathiyar!";
        } else {
            msg = "Login Failed - Invalid Credentials";
        }
        request.setAttribute("message", msg);
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}
