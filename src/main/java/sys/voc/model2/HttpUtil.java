package sys.voc.model2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HttpUtil {
    public static void forward(HttpServletRequest request, HttpServletResponse response, String path){
        try{
            RequestDispatcher dispatcher = request.getRequestDispatcher(path);
            dispatcher.forward(request,response);
        } catch (ServletException | IOException exception) {
            System.out.println("exception = " + exception);
        }
    }
}
