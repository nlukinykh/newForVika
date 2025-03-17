public class App {
    public static void main( String[] args ) {
        int x = 100;
        findMaxElement(x, 10);
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

    public static int maxNumber(int number1, int number2, int number3) {
        int max = number1;
        if (number1 > number2) {
            if (number1 > number3){
                max = number1;
            } else {
                max = number3;
            }
        } else {
            if (number2 > number3) {
                max = number2;
            } else {
                max = number3;
            }
        }
        System.out.printf("Самое большое число - %d\n", max);
        return max;
    }

    public static int maxNumber2(int number1, int number2, int number3) {
        int max = number1;

        max = (number1 > number2) ? number1 : number2;

        max = (max < number3) ? number3 : max;

        System.out.printf("Самое большое число - %d\n", max);
        return max;
    }

    public static int maxNumber3(int number1, int number2, int number3) {
        int max = number1;

        max = Math.max(number1, number2);

        max = Math.max(max, number3);

        System.out.printf("Самое большое число - %d\n", max);
        return max;
    }
}
