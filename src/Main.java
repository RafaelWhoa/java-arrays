import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.addToBack(1);
        arrayList.addToBack(2);
        arrayList.addToBack(2);
        arrayList.addToBack(2);
        arrayList.addToBack(2);
        arrayList.addToBack(2);
        arrayList.addToBack(2);
        arrayList.addToBack(2);
        arrayList.addToBack(2);
        arrayList.addToBack(2);
        arrayList.addToBack(2);
        arrayList.addToFront(2);
        //Integer[] backingArray = arrayList.getBackingArray();
        for (Object num : arrayList.getBackingArray()) {
            System.out.println(num);
        }
    }
}
