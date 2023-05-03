package uml;

public class MemberServiceImpl implements MemberService {
    @Override
    public void save(String name) {

    }
}

interface MemberService {
    void save(String name);
}

class Member {
}