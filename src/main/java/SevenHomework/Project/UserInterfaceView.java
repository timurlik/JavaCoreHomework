package SevenHomework.Project;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите название города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения прогноза на один день: \n" +
                    "Введите 2 для получения прогноза из базы данных \n" +
                    "Введите 5 для получения проноза на пяь дней: \n" +
                    "Введите 0 для завершения: ");
            String command = scanner.nextLine();

            if("0".equals(command)) break;

            else if (("1").equals(command) || ("5").equals(command)) {
                try {
                    controller.getWeather(command, city);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }   else System.out.println("Вы ввели невалидные данные!");
            break;
        }

    }
}
