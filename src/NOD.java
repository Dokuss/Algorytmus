public class NOD {

    public static void main(String[] args) {
//        System.out.println(qcd(30,18));

//        System.out.println(fibNaiv(2));

//        System.out.println(fibEfective(100));

        /*int [] arr = new int[]{1,2,3,6,9,4};
        System.out.println(searchLinear(arr, 6));*/

        int [] array = {1,2,3,4,5,6,7,8,9,11,45,67,78,89,99,104,125,187,200,345};
        System.out.println(binSearch(array, 89));



    }
/*
//  Алгоритм
    public static int qcd(int a, int b){
        while (b!=0){
            int temp = a%b;
            a = b;
            b=temp;
        }
        return a;
    }
*/

    // Число Фибоначчи

    /*
    public static long fibNaiv(int n){
        if(n<=1) {
            return n;
        } else{
            return fibNaiv(n-1)+ fibNaiv(n-2);
        }
    }
    */

/*    public static long fibEfective(int n){
        long [] arr = new long[n+1];
        arr[0]= 0;
        arr[1] = 1;
        for (int i = 2; i <=n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];


        }
        return  arr[n];
    }*/

    /*public static int searchLinear(int [] arr, int elementToFind){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == elementToFind){
                return 1;
            }
        }
        return -1;
    }*/

    //  Бинарный поиск

    public static int binSearch(int array[], int key){
        int mid = array.length / 2;
        if(key == array[mid]){
            return mid;
        }
        int start = 0;
        int end = array.length - 1;

        while(start <= end){
            mid = (end-start) / 2 + start;
            if(key<array[mid]){
                end = mid -1;
            } else if (key>array[mid]) {
                start = mid +1;

            }else
                return mid;

        }
        return -1;
    }
}
