package NinthHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();

        students.add(new Student("Ivan", Arrays.asList(new Course("Math"), new Course("Paint"))));
        students.add(new Student("Igor", Arrays.asList(new Course("Physics"), new Course("Math"), new Course("Paint"))));
        students.add(new Student("Oleg", Arrays.asList(new Course("Math"), new Course("Literature"), new Course("Music"))));
        students.add(new Student("Maria", Arrays.asList(new Course("Paint"), new Course("Literature"), new Course("Music"))));

        System.out.println(students.stream()
                .map(c -> c.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toList()));

        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toSet()));

        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains("Math"))
                .collect(Collectors.toList()));

    }
}
