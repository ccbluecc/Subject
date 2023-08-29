package sit.int202.simple.simpletud;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


@WebServlet(name = "favoriteSubject", value = "/favoriteSubject")
public class favorite_subject extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String subjects[] = request.getParameterValues("subject");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Your Favorate Subject ::</h1><hr>");
        out.println("Your Student id:" + id + "<br>");
        out.println("Your Student name:" + name + "<br>");
        out.println("Favorate Subject: <br>");
        for (String subject : subjects){
            out.println("&nbsp; &nbsp; -" + subject + "<br>");
        }
        out.println("<hr>");
        out.println("<h3>Request parameter using getParameterMap() :: </h3><hr>");
        Map<String,String[]> map = request.getParameterMap();
        out.println("Your Student id: " + map.get("id")[0] + "<br>");
        out.println("Your Student name: " + map.get("name")[0] + "<br>");
        out.println("Favorate Subject: <br>");
        for (String subject : map.get("subject")){
            out.println("&nbsp; &nbsp; -" + subject + "<br>");
        }
        out.println("<hr>");
        out.println("<a href = 'favorite_subject.html'>[ Back ]</a>");
        out.println("</body></html>");
    }
}
