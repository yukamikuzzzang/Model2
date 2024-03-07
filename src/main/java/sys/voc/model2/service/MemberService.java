package sys.voc.model2.service;

import sys.voc.model2.dao.MemberDAO;
import sys.voc.model2.vo.MemberVO;

public class MemberService {
    private static MemberService service = new MemberService();
    public MemberDAO dao = MemberDAO.getInstance();

    private MemberService() {
    }

    public static MemberService getInstance() {
        return service;
    }

    public void memberInsert(MemberVO memberVO) {
        dao.memberInsert(memberVO);
    }
}
