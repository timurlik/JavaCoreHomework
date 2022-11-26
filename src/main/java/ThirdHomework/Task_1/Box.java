package ThirdHomework.Task_1;
import java.util.Arrays;


public class Box <T extends Fruit>{

    private T[] fruits;

    public float getWeight() {
        float weight = 0.0f;
        for(T fruit : fruits) {
            weight = fruit.getWeight() + weight;
        }
        return weight;
    }
    public boolean compareBox(Box<?>comparable) {
        return Math.abs(this.getWeight() - comparable.getWeight()) < 0.0001;
    }

    public Box (T...fruits) {
        this.fruits = fruits;
    }
    public T[] getFruits() {
        return fruits;
    }

    public void setFruits(T... fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + Arrays.toString(fruits) +
                '}';
    }
}
