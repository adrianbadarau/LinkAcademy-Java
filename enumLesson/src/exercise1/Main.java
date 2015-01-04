package exercise1;

/**
 * Created by adrian on 03.01.2015.
 */
public class Main {
    public static void main(String[] args) {
        Server x = new Server();
        x.getParams("serverId=25&serverName=my name&serverStatus=Running");
        System.out.println(x);
    }
}
