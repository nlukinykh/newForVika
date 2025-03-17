public class App {
    public static void main( String[] args ) {
        int x = 100;
        maxNumber(40, x, 60);
    }

    public static int findMaxElement(int elem1, int elem2) {
        int max = 0;
        //если elem1 меньше elem2
        if (elem1 < elem2) {
            //то elem2 - max
            max = elem2;
        } else {
            max = elem1;
            //иначе elem1 - max
        }

        return max;
    }

    public static int maxNumber(int number1, int number2, int number3) {
        int max = Math.max(number1, number2);
        max = Math.max(max, number3);
        System.out.printf("The largest number is %d%n", max);
        return max;
    }
}
