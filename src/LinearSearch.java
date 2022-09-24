public class LinearSearch {
    public static void main(String[] args) {
        int [] array = new int[]{3,5,6,8,0,1,4,7,2};
        System.out.println(searchLinear(array, 4));
    }

    public static int searchLinear(int [] array, int elementToFind){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == elementToFind){
                return i;
            }
        }

        return -1;
    }
}
