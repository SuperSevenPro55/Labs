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
                1. База
                2. Сортировки
                3. Сортировки 2
                0. Выход
                """);

            switch (InputRequest()) {
                case 1:
                    System.out.print("""
                        --------База--------
                        1. Проверка скобок
                        2. Удалить на месте
                        0. В главное меню
                        """);
                    switch (InputRequest()) {
                        case 1:
                            System.out.println("--------Проверка скобок--------");
                            Lab_1_1.start();
                            break;
                        case 2:
                            System.out.println("--------Удалить на месте--------");
                            Lab_1_2.start();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Неверный ввод");
                    }
                    break;

                case 2:
                    System.out.print("""
                        --------Сортировки--------
                        1. Сортировка вставками
                        2. Сортировка слиянием
                        3. Сортировка структур
                        0. В главное меню
                        """);
                    switch (InputRequest()) {
                        case 1:
                            System.out.println("--------Сортировка вставками--------");
                            Lab_2_1.start();
                            break;
                        case 2:
                            System.out.println("--------Сортировка слиянием--------");
                            Lab_2_2.start();
                            break;
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
                        1. Сортировка подсчетом
                        2. Цифровая сортировка
                        3. Сохранение обобщения
                        0. В главное меню
                        """);
                    switch (InputRequest()) {
                        case 1:
                            System.out.println("--------Сортировка подсчетом--------");
                            Lab_3_1.start();
                            break;
                        case 2:
                            System.out.println("--------Цифровая сортировка--------");
                            Lab_3_2.start();
                            break;
                        case 3:
                            System.out.println("--------Сохранение обобщения--------");
                            Lab_3_3.start();
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

    public static int InputRequest() {
        System.out.print("Выберите пункт: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}