package uml;

public class School {
    private String name;

    public void info() {
        // 학교 정보
    }
}

class ElementarySchool  extends School {
    @Override
    public void info() {
        // 초등학교 정보
    }
}

class MiddleSchool extends School {
    @Override
    public void info() {
        // 중학교 정보
    }
}

