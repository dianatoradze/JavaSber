package Task3.Task5;

import java.util.ArrayList;
import java.util.List;

class Gamer {

    private String username;
    private List<Gamer> statistics;

    public Gamer(String username) {
        this.username = username;
        this.statistics = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
}

