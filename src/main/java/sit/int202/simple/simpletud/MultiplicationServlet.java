package sit.int202.simple.simpletud;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mutipication", value = "/multipication")
public class MultiplicationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number = req.getParameter("number");
        if(number == null || number.length() == 0 || !isNumber(number)){
            req.setAttribute("message", "Invalid number or null parameter");
        }
        req.setAttribute("number", number);
        req.getRequestDispatcher("/multipication.jsp").forward(req, resp);
    }
    private boolean isNumber(String parameterStr){
        for (int i = 0; i < parameterStr.length() ; i++) {
            if(!Character.isDigit(parameterStr.charAt(i))){
                return false;
            }
        }
        return true;

    }
}

