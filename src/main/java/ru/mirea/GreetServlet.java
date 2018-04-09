package ru.mirea;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GreetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        String yourname = req.getParameter("yourname");
        resp.getWriter().write("<!DOCTYPE html>\n" +
                               "<html lang=\"en\">\n" +
                               "<head>\n" +
                               "    <meta charset=\"UTF-8\">\n" +
                               "    <title>Привет</title>\n" +
                               "</head>\n" +
                               "<body>\n" +
                               "<a href=\"/\">Назад</a>\n" +
                               "<H2>Привет, " + yourname + "!!!</H2>\n" +
                               "</body>\n" +
                               "</html>\n");
    }
}
