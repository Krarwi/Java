public class LoopBreak {

    public static void main(String args[]) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] == 11) {
                System.out.println("Loop terminated early due to break statement.");
                break;
            }
        }
    }
}
