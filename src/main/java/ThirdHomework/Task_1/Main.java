package ThirdHomework.Task_1;

public class Main {
    public static void main(String[] args) {

        Apple apple1 = new Apple(1.2f);
        Apple apple2 = new Apple(1.5f);
        Apple apple3 = new Apple(1.6f);
        Box <Apple> boxWithApples = new Box<>(apple1, apple2, apple3);
        System.out.println(boxWithApples.getWeight());

        Orange orange1 = new Orange(2.0f);
        Orange orange2 = new Orange(2.2f);
        Orange orange3 = new Orange(2.3f);
        Box <Orange> boxWithOranges = new Box<>(orange1, orange2, orange3);
        System.out.println(boxWithOranges.getWeight());

        System.out.println(boxWithOranges.compareBox(boxWithApples));
    }

    static void changeObj(Object[] array, int indexOne, int indexTwo) {
        Object val = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = val;
    }
}
