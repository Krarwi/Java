public class Arraylooper {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        int intSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            intSum += numbers[i];
        }
        System.out.println(intSum);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[0]);
            System.out.println(numbers[4]);
        }
    }
}