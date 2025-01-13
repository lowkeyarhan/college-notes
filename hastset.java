import java.util.*;

public class hastset {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ar1[] = { 2, 5, 3, 6, 7, 5, 2 };
        int ar2[] = { 7, 8, 9, 0, 3, 4, 1, 5 };
        HashSet<Integer> array1 = new HashSet<Integer>();
        for (int i : ar1) {
            array1.add(i);
        }
        HashSet<Integer> intersection = new HashSet<Integer>();
        for (int i : ar2) {
            if (array1.contains(i) && intersection.contains(i) == false)
                intersection.add(i);
        }
        System.out.println(intersection);
    }
}
