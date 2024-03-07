package sys.voc.model2.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sys.voc.model2.controller.member.MemberInsertController;

import java.io.IOException;
import java.util.HashMap;

public class FrontController extends HttpServlet {
    String charset = null;
    HashMap<String, Controller> list = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        charset = config.getInitParameter("charset");
        list = new HashMap<String, Controller>();
        list.put("/memberInsert.do", new MemberInsertController());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding(charset);

        String url = req.getRequestURI();
        String contextPath = req.getContextPath();
        String path = url.substring(contextPath.length());

        Controller subController = list.get(path);
        subController.execute(req, resp);
    }
}
