package FirstHomework;
//Превое домашне задание
public class Main {

    public static void main(String[] args) {


        Cat catCompetitor1 = new Cat("Морис", "red", 10);
        catCompetitor1.setSwimmingSpeed(10);
        catCompetitor1.setMaxRun(5);
        Wolf wolfCompetitor1 = new Wolf("Волк", "серый", 12);
        wolfCompetitor1.setSwimmingSpeed(12);
        wolfCompetitor1.setMaxRun(6);
        Turtle turtleCompetitor = new Turtle("Черепаха", "зеленая", 100);
        turtleCompetitor.setSwimmingSpeed(15);
        turtleCompetitor.setMaxRun(1);

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};
        Course[] c = {new Course(15), new Course(20)};

        for (Course course : c) {
            course.getLongRun(catCompetitor1);
            course.getLongRun(wolfCompetitor1);
            course.getLongRun(turtleCompetitor);


        }
    }
}
