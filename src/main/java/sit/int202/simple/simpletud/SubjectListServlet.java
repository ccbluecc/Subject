package sit.int202.simple.simpletud;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.simple.simpletud.Repository.SubjectRepository;
import sit.int202.simple.simpletud.entities.Subject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/subjects")
public class SubjectListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SubjectRepository sr = new SubjectRepository();
        List<Subject> subjectList = sr.findAll();
        request.setAttribute("subject",subjectList);
        request.getRequestDispatcher("/subjects_list.jsp").forward(request,response);
        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>Subject List::</h1><hr>");
//        out.println("<table>");
//        out.println("<tr>");
//        out.println("<td>Subject Id</td><td>Subject Title</td><td>Credit</td>");
//        out.println("<tr>");
//        for (Subject subject : sr.findAll()){
//            out.println("<tr>");
//            out.println("<td>" + subject.getId() +"</td>");
//            out.println("<td>" + subject.getTitle() +"</td>");
//            out.println("<td>" + subject.getCredit() +"</td>");
//            out.println("</tr>");
//        }
//        out.println("</table>");
//        out.println("</body></html>");

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}