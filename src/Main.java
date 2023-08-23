import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.addToBack(1);
        arrayList.addToBack(2);
        arrayList.addToBack(4);
        arrayList.addToBack(4);
        arrayList.addToBack(4);
        arrayList.addToBack(4);
        arrayList.addToBack(4);
        arrayList.addToBack(4);
        arrayList.addToBack(4);
        arrayList.addToFront(3);
        for (Object num : arrayList.getBackingArray()) {
            System.out.println(num);
        }
    }
}
