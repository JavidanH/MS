package Task3.Observer;

public class Main {
    public static void main(String[] args) {


        LinkedInUser javidanHajiyev = new LinkedInUser("Javidan Hajiyev");
        LinkedInUser mahmudFatullayev = new LinkedInUser("Mahmud Fatullayev");

        FollowerConnection sabzalliAbdulrahmanli = new FollowerConnection("Sabzali Abdulrahmanli");
        FollowerConnection huseynHuseynzadeh = new FollowerConnection("Huseyn Huseynzadeh");

        javidanHajiyev.connect(sabzalliAbdulrahmanli);
        javidanHajiyev.connect(huseynHuseynzadeh);

        mahmudFatullayev.connect(sabzalliAbdulrahmanli);

        // Users post updates
        javidanHajiyev.postUpdate("    Start new job");
        mahmudFatullayev.postUpdate("    Earn new certificate ");
    }

}
