import Labs.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu();
        System.out.println("Завершение программы...");
    }

    public static void Menu() {
        int choice = -1;

        do {
            System.out.print("""
                --------Главное меню--------
                2. Сортировки
                3. Сортировки 2
                0. Выход
                """);

            switch (InputRequest(choice)) {
                case 2:
                    System.out.print("""
                        --------Сортировки--------
                        3. Сортировка структур
                        0. В главное меню
                        """);
                    switch (InputRequest(choice)) {
                        case 3:
                            System.out.println("--------Сортировка структур--------");
                            Lab_2_3.start();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Неверный ввод");
                    }
                    break;

                case 3:
                    System.out.print("""
                        --------Сортировки 2--------
                        2. Цифровая сортировка
                        0. В главное меню
                        """);
                    switch (InputRequest(choice)) {
                        case 2:
                            System.out.println("--------Цифровая сортировка--------");
                            Lab_3_2.start();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Неверный ввод");
                    }
                    break;

                case 0:
                    choice = 0;
                    break;

                default:
                    System.out.println("Неверный ввод");
            }
        } while (choice!=0);
    }

    public static int InputRequest(int choice) {
        System.out.print("Выберите пункт: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        return choice;
    }
}