public class LoopBreak {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i);

            if (i == 11) {
                System.out.println("Loop terminated early due to break statement");
                break;
            }
        }
    }
}
