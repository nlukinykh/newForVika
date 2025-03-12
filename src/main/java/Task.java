public class Task {
    private static Object Math;

    //сравнить два числа и вывести большее
    public static void findMaxElement() {
        int elem1 = 10;
        int elem2 = 50;
        int max = elem2;
        //если elem1 меньше elem2
        if (elem1 > elem2) {
            //то elem2 - max
            max = elem1;
        }
        //иначе elem1 - max

        System.out.println( "Max = " + max );
    }

    public static void maxNumber(){
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        int max  = number1;

        if (number1 > number2) {
            max = number1;
        }
        else  {
            max = number2;
        }
    }
}
