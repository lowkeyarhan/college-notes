import java.util.*;

public class hastset {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ar1[] = { 2, 5, 3, 6, 7, 5, 2 };
        int ar2[] = { 7, 8, 9, 0, 3, 4, 1, 5 };
        int k = 10; // Example value for k

        HashSet<Integer> array1 = new HashSet<Integer>();
        for (int i : ar1) {
            array1.add(i);
        }
        HashSet<Integer> intersection = new HashSet<Integer>();
        for (int i : ar2) {
            if (array1.contains(i)) {
                intersection.add(i);
            }
        }
        System.out.println(intersection);

        // Count and display pairs
        HashSet<Integer> seen = new HashSet<Integer>();
        int count = 0;
        for (int i : ar1) {
            int complement = k - i;
            if (array1.contains(complement) && !seen.contains(i) && !seen.contains(complement) && i != complement) {
                System.out.println("Pair: (" + i + ", " + complement + ")");
                count++;
                seen.add(i);
                seen.add(complement);
            }
        }
        System.out.println("Number of pairs: " + count);
    }
}
