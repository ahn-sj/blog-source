package firstclasscollection;

import java.util.ArrayList;
import java.util.List;

public class Ducks {
    List<Duck> ducks = new ArrayList<>();

    public List<Duck> createMaDuck() {
        // logic
        return null;
    }

    public List<Duck> createJungDuck() {
        // logic
        return null;
    }

    public List<Duck> createJeonDuck() {
        // logic
        return null;
    }
}

interface Duck {
    void quack();
}

class MaDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("마마~");
    }
}

class JungDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("정정~");
    }
}

class JeonDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("전전~");
    }
}


