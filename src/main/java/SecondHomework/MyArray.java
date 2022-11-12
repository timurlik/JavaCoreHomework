package SecondHomework;

public class MyArray {
     //Здесь создается заранее заполненный массив строковыми переменными.
     public final String [][] ARR = {{"1","2","3","4"},{"5","6","7","8",},{"9","10","11","12"},{"13","14","15","16"}};

     //Здесь мы должны проверить что массив размером [4][4] и заполнен строковыми данными,
     //в противном случае бросить два исключения MyArrayDataException и MyArraySizeException.
     public void checkAndSumArray(String[][]array) throws MyArraySizeException, MyArrayDataException {
          int count = 0;
          for (int i = 0; i < array.length; i++) {
               if (array.length != 4) throw new MyArraySizeException("Размер массива не соответствует условию метода!");
               for (int j = 0; j < array[i].length; j++) {
                    if (array[i].length != 4) throw new MyArraySizeException("Размер массива не соответствует условию метода!");
                    try {
                         count = count + Integer.parseInt(array[i][j]);
                    }   catch (NumberFormatException e) {
                         throw new MyArrayDataException("Некорректный тип данных: ", i , j);
                    }
               }
          }
          System.out.println(count);
     }
}
