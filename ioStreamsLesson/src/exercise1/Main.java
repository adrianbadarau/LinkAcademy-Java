package exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by adrian on 04.01.2015.
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedReader users = new BufferedReader(new FileReader("users.txt"))){
            String line;
            while ((line=users.readLine())!=null){
                String[] userDetails = line.split("[|]");
                System.out.print("User name is: "+userDetails[1].split(":")[1]+userDetails[2].split(":")[1]+" he has a CNP of: "+userDetails[3].split(":")[1]+" and a ID of: "+userDetails[0].split(":")[1]);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
