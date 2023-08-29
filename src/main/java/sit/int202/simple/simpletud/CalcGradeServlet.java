package sit.int202.simple.simpletud;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalcGradeServlet",value = "/grade")
public  class CalcGradeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int score = Integer.valueOf(request.getParameter("score"));
        CalcGrade cg = new CalcGrade(score);
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Calculate Grade </h1>");
        out.println("<br>");
        out.println("<h3> Your score is " + score + "</h3>");
        String color = "darkblue";
        if (cg.getGrade().equalsIgnoreCase("F")){
            color = "red";
        }
        out.println("<h3 style='color:"+ color+ ";' > Your grade is " + cg.getGrade() + "</h3>");
        out.println("</body></html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

