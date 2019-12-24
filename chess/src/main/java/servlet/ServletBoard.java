package servlet;

import main.Figure;
import main.Main;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("http://localhost:8080/")
public class ServletBoard extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        String value = request.getParameter("value");
        String width = request.getParameter("width");
        String height = request.getParameter("height");
        System.out.println(type+value+width+height);
        Main.methodForBoard.backlight(new Figure(type,Integer.valueOf(width),Integer.valueOf(height),value.charAt(0)));
    }

}
