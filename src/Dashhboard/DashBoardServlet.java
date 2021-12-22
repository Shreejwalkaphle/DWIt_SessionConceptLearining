package Dashhboard;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pc on 12/22/2021.
 */
@WebServlet(name = "DashBoardServlet")
public class DashBoardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        HttpSession session = request.getSession(false);

        String name = (String)session.getAttribute("SessionName");

        PrintWriter  printWriter = response.getWriter();
        printWriter.print("hello your session is " + name);
        printWriter.close();
    }
}
