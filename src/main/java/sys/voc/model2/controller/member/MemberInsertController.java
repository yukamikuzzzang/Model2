package sys.voc.model2.controller.member;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sys.voc.model2.HttpUtil;
import sys.voc.model2.controller.Controller;
import sys.voc.model2.service.MemberService;
import sys.voc.model2.vo.MemberVO;

import java.io.IOException;

public class MemberInsertController implements Controller {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //extract parameter
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String name = request.getParameter("nickname");
        String mail = request.getParameter("email");

        //validation check
        if (id.isEmpty() || password.isEmpty() || name.isEmpty() || mail.isEmpty()) {
            request.setAttribute("error", "모든 항목을 입력해주세요.");
            HttpUtil.forward(request, response, "/error/error.jsp");
        }

        //bind some data to VO
        MemberVO memberVO = new MemberVO();
        memberVO.setId(id);
        memberVO.setPassword(password);
        memberVO.setName(name);
        memberVO.setMail(mail);

        //call method on Service Object
        MemberService service = MemberService.getInstance();
        service.memberInsert(memberVO);

        //move to result page
        request.setAttribute("id", id);
        HttpUtil.forward(request, response, "/result/result.jsp");
    }
}
