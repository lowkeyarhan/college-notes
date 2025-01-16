import java.util.HashSet;

public class subarray_sum_zero {
    public static boolean sum(int ar[]) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for (int i : ar) {
            sum += i;
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String args[]) {
        int ar[] = { 2, 5, 3, 6, 0, 7, 5, 2 };
        System.out.println(sum(ar));
    }
}
