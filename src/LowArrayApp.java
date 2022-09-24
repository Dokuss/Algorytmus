import java.util.Scanner;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        arr.setElem(0, 77);
        arr.setElem(1, 76);
        arr.setElem(2, 75);
        arr.setElem(3, 74);
        arr.setElem(4, 73);
        arr.setElem(5, 72);
        arr.setElem(6, 71);
        arr.setElem(7, 78);
        arr.setElem(8, 79);

    }

}
class LowArray {
    long [] LowArray;
    int i;
    private long[] a;

    public LowArray(int size){
        a = new long[size];
    }

    public void setElem(int index, long value){
        a[index] = value;
    }

    public long getElem(int index){
        return a[index];
    }




}
