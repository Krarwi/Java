import java.util.Scanner;
public class FirstJavaTest {
    
    public static void main(String args[]) {
       // Frågar för ditt namn
       Scanner myFile = new Scanner(System.in);
       System.out.println("Vad är ditt namn?");
       
       String namn = myFile.nextLine();
       System.out.println("Min namn är" + namn);
       // Variabler
       int nummer = 3;
       System.out.println(nummer + 3);
       // Printar "Det här är 3 + 3"
       System.out.println("Det här är 3 + 3");
       // Printar 6
       System.out.println(3 + 3);
    }
}
