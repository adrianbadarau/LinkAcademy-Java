package examples;

import java.io.*;

/**
 * Created by adrian on 04.01.2015.
 */
public class Main {
    public static void main(String[] args) {
        String myText = "Hello World !";

        try (FileOutputStream fs = new FileOutputStream("myFile.txt")) {
            fs.write(myText.getBytes());
        } catch (IOException exc) {
            System.out.println(exc);
        }
        
        try (FileInputStream fs = new FileInputStream("myFile.txt")){
            int content = fs.read();
            while (content!=-1){
                System.out.print((char) content);
                content = fs.read();
            }
        }catch (IOException e){
            System.out.print(e);
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader("myFile.txt"))){
            String l;
            while ((l=br.readLine())!=null){
                System.out.println(l);
            }
        }catch (IOException e){
            System.out.print(e);
        }
        
        System.out.println("Enter some text:");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            String s = bufferedReader.readLine();
            System.out.println("you entered:"+s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
