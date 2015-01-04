package exercise1;

/**
 * Created by adrian on 03.01.2015.
 */
public class Server {
    public enum ServerStatus{
        STOPPED, RUNNING,UNKNOWN
    }
    public String name;
    public int id;
    public ServerStatus status;
    
    public void getParams(String params){
        String[] tmp = params.split("&");
        this.name = tmp[1].split("=")[1];
        this.id = Integer.parseInt(tmp[0].split("=")[1]);
        this.status = ServerStatus.valueOf(tmp[2].split("=")[1].toUpperCase());
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Server: ");
        output.append(this.name);
        output.append(" with Id of: ");
        output.append(this.id);
        output.append(" has a status of: ");
        output.append(this.status);
        return output.toString();
    }
}
