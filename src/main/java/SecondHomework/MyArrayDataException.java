package SecondHomework;

public class MyArrayDataException extends Exception{
    public int a;
    public int b;
    public String message;

    public MyArrayDataException (String message, int a, int b) {
        this.a = a;
        this.b = b;
        this.message = message;
    }

}
