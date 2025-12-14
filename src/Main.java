import Labs.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException {
        Menu();
        System.out.println("Завершение программы...");
    }

    public static void Menu() throws IOException {
        int choice = -1;

        do {
            System.out.print("""
                --------Главное меню--------
                2. Сортировки
                3. Сортировки 2
                4. Поиск минимумов
                0. Выход
                """);

            switch (InputRequest()) {
                case 2 -> {
                    System.out.print("""
                        --------Сортировки--------
                        3. Сортировка структур
                        0. В главное меню
                        """);
                    switch (InputRequest()) {
                        case 3 -> {
                            System.out.println("--------Сортировка структур--------");
                            Lab_2_3.start();
                        }
                        case 0 -> {}
                        default -> System.out.println("Неверный ввод");
                    }
                }

                case 3 -> {
                    System.out.print("""
                        --------Сортировки 2--------
                        2. Цифровая сортировка
                        3. Сохранение обобщения
                        0. В главное меню
                        """);
                    switch (InputRequest()) {
                        case 2 -> {
                            System.out.println("--------Цифровая сортировка--------");
                            Lab_3_2.start();
                        }
                        case 3 -> {
                            System.out.println("--------Сохранение обобщения--------");
                            Lab_3_3.start();
                        }
                        case 0 -> {}
                        default -> System.out.println("Неверный ввод");
                    }
                }

                case 4 -> {
                    System.out.print("""
                            --------Поиск минимумов--------
                            1. Стек минимумов
                            2. Очередь с приоритетом на основе Кучи
                            0. В главное меню
                            """);
                    switch (InputRequest()) {
                        case 1 -> {
                            System.out.println("--------Стек минимумов--------");
                            Lab_4_1.start();
                        }
                        case 2 -> {
                            System.out.println("--------Очередь с приоритетом на основе Кучи--------");
                            // Lab_4_2.start();
                        }
                        case 0 -> {}
                        default -> System.out.println("Неверный ввод");
                    }
                }

                case 0 -> choice = 0;
                default -> System.out.println("Неверный ввод");
            }
        } while (choice!=0);
    }

    public static int InputRequest() {
        System.out.print("Выберите пункт: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}