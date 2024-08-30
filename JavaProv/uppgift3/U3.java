
public class U3 {

    public static void main(String args[]) {
        
        for (int i = 0; i < 5; i++) { // int i = 0; i <= 5; i+ är fel man måste have två plus i sluten
            System.out.println(i); // System.out.println(Number: " + i); är innefektiv och man behöver inte en variabel nämnd "Number", man kan bara printa "i" och he fungerar
        }
    }
}

// Originella koden

//  public class Main {
//    public static void main(String[] args) {
        
//        for (int i = 0; i <= 5; i+); {
//            System.out.println(Number: " + i);
//        }
//    }
//}