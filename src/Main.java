public class Main {

    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = myArray(correctMatrix);
            System.out.println("Сумма равна: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива!");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве!");
        }

        try {
            int[] smallArray = {10, 20};
            int errorElement = smallArray[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива!");
        }
    }

    public static int myArray(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        if (matrix.length != 4) {
            throw new MyArraySizeException("Не 4 строки");
        }

        for (int i = 0; i < 4; i++) {
            if (matrix[i].length != 4) {
                throw new MyArraySizeException("Не 4 столбца");
            }
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    String s = matrix[i][j];
                    int num = Integer.parseInt(s);
                    sum = sum + num;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в строке " + i + " и столбце " + j);
                }
            }
        }

        return sum;
    }
}
