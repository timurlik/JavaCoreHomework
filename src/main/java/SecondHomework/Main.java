package SecondHomework;

import com.sun.deploy.util.ArrayUtil;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class Main {
    public static void main (String[]args) throws MyArraySizeException, MyArrayDataException {

    MyArray array = new MyArray();
    array.checkAndSumArray(array.ARR);
    }

    /* Сначала реализовал код в методе main, потом перенес все в отдельный класс, а код здесь не стал удалять.

    public int checkAndSumArray (String[][]array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4) throw new MyArraySizeException("Размер массива не соответствует условию метода!");
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i].length != 4) throw new MyArraySizeException("Размер массива не соответствует условию метода!");
                    try {
                        count = count + Integer.parseInt(array[i][j]);
                    }   catch (NumberFormatException e) {
                        throw new MyArrayDataException("Некорректный формат данных в ячейка с индексами", i , j);
                    }
            }
        }
        System.out.println(count);
        return count;
    }
    //Здесь создается заранее заполненный массив строковыми переменными.
    public String[][] createArray () {
        final String [][] ARR = new String[4][4];

        arr[0][0] = "0";
        arr[0][1] = "1";
        arr[0][2] = "2";
        arr[0][3] = "3";

        arr[1][0] = "4";
        arr[1][1] = "5";
        arr[1][2] = "6";
        arr[1][3] = "7";

        arr[2][0] = "8";
        arr[2][1] = "9";
        arr[2][2] = "10";
        arr[2][3] = "11";

        arr[3][0] = "12";
        arr[3][1] = "13";
        arr[3][2] = "14";
        arr[3][3] = "15";
        return arr;
    }
*/
}
