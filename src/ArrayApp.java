public class ArrayApp {
    //Задача
    //Вставка, поиск, удаление.
    public static void main(String[] args) {
        long[] arr;
        arr = new long[10];
        long searchKey;
        int nElems = 0;

        arr[0] = 77;
        arr[1] = 55;
        arr[2] = 66;
        arr[3] = 44;
        arr[4] = 33;
        arr[5] = 22;
        arr[6] = 11;
        arr[7] = 10;
        arr[8] = 11;
        arr[9] = 43;

        nElems = 10;
    //Вывести элементы (1 вариант)
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //Вывод элементов (2 вариант)
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) ;
            System.out.print(",");
        }
        System.out.println("]");

        //Поиск элемента
        searchKey = 15;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == searchKey)
                break;
            if(i==arr.length)
                System.out.println("Can't find " + searchKey);
            else
                System.out.println("Search key is " + searchKey);
        }
        //У нас есть searchKey
        //1. ищем элемент
        //2.Мы используем break искомого элемента
        //3. Сдвинуть элементы, чтобы после удаления не было пустого элемента.

        //Удаление элемента
        searchKey = 66; // Удаление элемента с ключом 55
        for(i=0; i<arr.length; i++) // Поиск удаляемого элемента
            if(arr[i] == searchKey)
                break;
        for(int k=i; k<arr.length-1; k++) // Сдвиг последующих элементов
            arr[k] = arr[k+1];


        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}

