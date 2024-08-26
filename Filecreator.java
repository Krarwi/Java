import java.util.Scanner;
import java.io.File;
import java.io.IOException; 
public class Filecreator {

    public static void main(String[] args) {
       Scanner myFile = new Scanner(System.in);
       System.out.println("What kindoff file do you want to create?");
       
       String fil = myFile.nextLine();
    try {
      File mynewfile = new File(String(fil));
      if (mynewfile.createNewFile()) {
        System.out.println("File created: " + mynewfile.getName());
      } else {
        System.out.println("File exists already");
      }
    } catch (IOException e) {
      System.out.println("ERROR");
      e.printStackTrace();
    }
    }

    private static String String(String fil) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
