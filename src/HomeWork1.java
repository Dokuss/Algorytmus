import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

//    guessTheNumber();

//    guessTheNumber2();

//    cycle();

//        int [] queue = new int[]{13, 9, 21, 15, 39, 19, 27};
//        System.out.println(searchNumber(queue, 39));

    }


        /*        First level: Вспоминаем Java Syntax
        Условный оператор if


        if (условие)
            оператор;
        else if (условие)
            оператор;
        else if (условие)
            оператор;
        else
            оператор;



// Игра в угадывание числа (if-else)
        Попроси пользователя ввести любое число от 1 до 5 . Если он ввел, к примеру 1, то выведи слово "Один". Если 2, то выведи слово "Два".
        В ином случае выведи "Неверный формат".

            Решение:

public static void guessTheNumber(){
    Scanner scanner = new Scanner((System.in));
    System.out.println("Write number 1-5");
    int num = scanner.nextInt();
    if (num == 1){
        System.out.println("Один");
    }
    else if (num == 2){
        System.out.println("Два");
    }
    else if (num == 3){
        System.out.println("Три");
    }
    else if (num == 4){
        System.out.println("Четыре");
    }
    else if (num == 5){
        System.out.println("Пять");
    }
    else
        System.out.println("Неверный формат");

}
*/


 /*               Оператор switch


        switch(выражение) {
            case константа1:
                последовательность операторов
                break;
            case константа2:
                последовательность операторов
                break;
            case константаЗ:
                последовательность операторов
                break;
            default:
                последовательность операторов
        }


        2.// Игра в угадывание числа (switch)
        Выполни всё то же самое, как с if-else, только теперь используй switch.

        Решение:

    public static void guessTheNumber2(){
        Scanner scanner = new Scanner((System.in));
        System.out.println("Write number 1-5");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            default:
                System.out.println("Неверный формат");
        }
    }
*/



/*        Цикл for


        fог (инициализа ция; условие; итера ция)
        {
            последовательность операторов;
        }



        Выведи цикл for, который выводит на экран значения квадратного корня чисел в пределах от 1 до 99.




    public static void cycle() {
        for (int i = 1; i < 99; i++) {

            if (Math.sqrt(i) % 1 == 0) {
                System.out.println(i);
            }

        }
    }


 */


/*

        Second level: В очереди в банке стоят 7 клиентов. У каждого клиента есть свой номер. Сейчас на табло мы видим такие номера:
        13, 9, 21, 15, 39, 19, и 27. Клиент под номер 39 заплатил деньги за экстренную кассу (чтоб его взяли без очереди).


                Напиши программу, которая найдет этого клиента и выведет : Клиент под номером 39, подойдите к кассе.


        (Используем линейный поиск, который мы изучали на уроке)

            Решение:

    public static int searchNumber(int [] queue, int elementToFind){
        for (int i = 0; i < queue.length; i++) {
            if(queue[i] == elementToFind){
                System.out.println("Клиент под номером 39, подойдите к кассе.");
            }
        }

        return elementToFind;   //  Совсем забыл как избавится от ретурна(
    }

  */

//    Остальные темы будем вспоминать в процессе ;)
//  Студенты, которые пишут на JavaScript также могут выполнить данный алгоритм с помощью языка JS. Либо же попробовать на Java.

}