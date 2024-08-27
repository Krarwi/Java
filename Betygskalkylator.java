
public class Betygskalkylator {


    public static void main(String args[]) {
        int poang = 78;
        
        if (-1 < poang && poang < 24) {
            System.out.println("Vitsord 0");
        }
        else if (25 < poang && poang < 59) {
            System.out.println("Vitsord 1");
        }
        else if (60 < poang && poang < 69) {
            System.out.println("Vitsord 2");
        }
        else if (70 < poang && poang < 79) {
            System.out.println("Vitsord 3");
        }
        else if (80 < poang && poang < 89) {
            System.out.println("Vitsord 4");
        }
        else if (90 < poang && poang < 101) {
            System.out.println("Vitsord 5");
        }
    }
}
