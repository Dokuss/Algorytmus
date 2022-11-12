public class MainTest {
    public static void main(String[] args) {
        int a = 18;
        int [] arr = {1,2,3,4,5,6,7,8,9,12,13,14,15};

        int i = 0;
        int j = arr.length-1;

        boolean runner = true;

        while (runner) {
//            if (i == j) {
//                System.out.println("Sum not found");
//            }
            if (arr[i] + arr[j] < a) {
                i++;
            }
            if (arr[i] + arr[j] > a) {
                j--;
            }
            if (arr[i] + arr[j] == a) {
                System.out.println(arr[i] + " + " + arr[j] + " = " + a);
                runner = false;
            }
        }

    }
}
