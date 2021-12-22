package Login;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pc on 12/22/2021.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        String user = request.getParameter("username");
        HttpSession session = request.getSession();
        session.setAttribute("SessionName",user);

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<a href='dashboard'>gotodashboard</a>");
        printWriter.close();
    }
}
