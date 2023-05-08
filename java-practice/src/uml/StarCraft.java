package uml;

import java.util.ArrayList;
import java.util.List;

public class StarCraft {
}

class Vulture {
    List<Mine> mines = new ArrayList<>();
}

class Mine {
    void plant() {}
}

class Carrier {
    List<Intercepter> intercepters;
}

class Intercepter {
    void attack() {}
}

