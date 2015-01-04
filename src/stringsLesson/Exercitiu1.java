package stringsLesson;

/**
 * Created by adrian on 03.01.2015.
 */
public class Exercitiu1 {
    public static void main(String[] args){
        String[] texts ={ 
                "Optimum pH of your water is between 6.0 and 7.0.  However Oscars are okay in a pH up to 8.0.",
                "The Oscar fish is not a difficult fish to look after if you give it a suitable environment to live in. You may start having problems such as health issues if you keep your Oscar in an unsuitably small tank or feed it on a poor diet",
                "The Oscar has the potential to reach 18 inches. However in captivity Oscars normally grow to between 8 and 12 inches" };
        for (int i=0; i<texts.length;i++){
            if (texts[i].length()>25){
                String tmpStr = texts[i].substring(0,22);
                tmpStr=tmpStr.concat("...");
                System.out.println(tmpStr);
            }else {
                System.out.println(texts[i]);
            }
        }
        System.out.println("============EXERCITIUL 2================");

        String[] files = { "picture1.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif" };
        String[] permitedExtensions = {"jpg","png","gif"};
        for(String file : files){
            if(file.endsWith(".jpg")||file.endsWith(".png")||file.endsWith(".gif")) System.out.println(file);
        }
        System.out.println("Varianta 2>>>>");
        for(String file : files){
            String fileExt = file.split("\\.")[1];
            for(String ext :permitedExtensions){
                if(fileExt.equals(ext)) System.out.println(file);
            }
        }
        System.out.println("============EXERCITIUL 3================");
        String users = "firstName: Vladimir|lastName: Vladimirovic|firstName: Jovan|lastName: Jovanovicc|firstName: Petar|lastName: Petrovic";
        String[] tmp = users.split("\\|");
        for(int i=0;i<tmp.length;i+=2){
            String fName = tmp[i].split(" ")[1];
            String lName = tmp[i+1].split(" ")[1];
            System.out.println("User is :"+fName+", "+lName);
        }
        System.out.println("============EXERCITIUL 3================");
        String[] forbidenChars = { "<",">","'" };
        String input = "<div>my 'div' tag</div>";
        String output = input;
        for (int i=0;i<forbidenChars.length;i++){
            output = output.replace(forbidenChars[i],"");
        }
        System.out.println(output);

    }
}
