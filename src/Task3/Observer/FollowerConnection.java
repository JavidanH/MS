package Task3.Observer;

public class FollowerConnection implements  Connection{

    private String username;

    public FollowerConnection(String username) {
        this.username = username;
    }

    @Override
    public void update(String update) {
        System.out.println(username + " received notification: " + update);
    }
}
