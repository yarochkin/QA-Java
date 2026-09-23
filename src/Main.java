import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkNumbers(5,6));
        checkNumber(4);
        System.out.println(number(7));
        printString("Hello", 5);
        System.out.println(yearCheck(2026));
        System.out.println(Arrays.toString(array()));
        System.out.println(Arrays.toString(array100()));
        arrayTwo();
        arrayTable();
        System.out.println(Arrays.toString(newArray(5, 10)));
    }
    public static void printThreeWords(){                    //Задание 1
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(){                      //Задание 2
        int a = 10;
        int b = 20;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {                       //Задание 3
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {                   //Задание 4
        int a = 10, b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static boolean checkNumbers(int a, int b) {      //Задание 5
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void checkNumber(int a) {                 //Задание 6
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    public static boolean number(int a) {                   //Задание 7
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printString(String str, int a) {     //Задание 8
        System.out.println(str.repeat(a));
    }
    public static boolean yearCheck(int year) {                             //Задание 9
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static int[] array(){                            //Задание 10
        int[] nums = {0, 1, 1, 1, 1, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i] = 0;
            }
            else {
                nums[i] = 1;
            }
        }
        return nums;
    }
    public static int[] array100(){                         //Задание 11
        int[] numsSto = new int[100];
        for (int i = 0; i < numsSto.length; i++) {
            numsSto[i] = i + 1;
        }
        return numsSto;
    }
    public static void arrayTwo(){                                  //Задание 12
        int [] numstwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0; i < numstwo.length; i++){
            if (numstwo[i] < 6){
                numstwo[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(numstwo));
    }
    public static void arrayTable(){                                //Задание 13
        int[][] table = new int[5][5];
        for(int i = 0; i < 5; i++){
            table[i][i]=1;
        }
        for(int i = 0; i < table.length; i++){
            System.out.println(Arrays.toString(table[i]));
        }
    }
    public static int[] newArray(int len, int initialValue) {       //Задание 14
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
