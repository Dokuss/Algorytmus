import java.util.Scanner;

public class TasksResult {
/*        Задание 1
    Пример: Рассмотрим пример, чтобы сложить три числа и вывести сумму.
    Шаг 1: Выполнение предварительных условий
    Шаг 2: Разработка алгоритма
    Алгоритм сложения 3 чисел и вывода их суммы:
    НАЧАЛО
    Объявите 3 целочисленные переменные num1, num2 и num3.
    Возьмите три добавляемых числа в качестве входных данных для переменных num1, num2 и num3 соответственно.
    Объявите целочисленную переменную sum для хранения результирующей суммы трех чисел.
    Добавьте 3 числа и сохраните результат в переменной sum.
    Вывести значение переменной sum
    КОНЕЦ
    Шаг 3: Проверка алгоритма путем его реализации.




    Задание 2
    Создать массив и заполнить его путем цикла ( при этом необходимо увеличить предыдущий элемент на три )
    Пример: [1,4,7,10,13]

    Попросить пользователя ввести число и провести поиск этого числа.*/

/*public static void main(String[] args) {
    int sum = 0;

    Scanner scaner = new Scanner((System.in));
    System.out.println("Write number 1");
    int num1 = scaner.nextInt();
    System.out.println(" " + num1);
    System.out.println("Write number 2");
    int num2 = scaner.nextInt();
    System.out.println(" " + num2);
    System.out.println("Write number 3");
    int num3 = scaner.nextInt();
    System.out.println(" " + num3);

    sum = num1+num2+num3;
    System.out.println("Sum of the numbeer = " + sum);

}*/
public static void main(String[] args) {
    int [] arrays = new int[10];
    arrays[1] = 1;
    for (int i = 1; i < arrays.length; i++) {
        arrays[i] = arrays[i-1] +3;
        System.out.println(arrays[i]);
    }

    Scanner scaner = new Scanner((System.in));
    System.out.println("Write number: ");
    int num = scaner.nextInt();

    for (int k = num; k < arrays.length; k++) {

    }
}
}
