package Task3.Observer;

import java.util.ArrayList;
import java.util.List;

public class LinkedInUser {

    private String username;
    private List<Connection> followers = new ArrayList<>();

    public LinkedInUser(String username) {
        this.username = username;
    }

    public void connect(Connection connection) {
        followers.add(connection);
    }

    public void disconnect(Connection connection) {
        followers.remove(connection);
    }

    public void postUpdate(String update) {
        notifyFollowers(update);
    }

    private void notifyFollowers(String update) {
        for (Connection follower : followers) {
            follower.update(username + " share new post " + update);
        }
    }
}
