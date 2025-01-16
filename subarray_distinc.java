import java.util.HashSet;

public class subarray_distinc {
    public static int[] calc(int ar[], int k) {
        HashSet<Integer> temp = new HashSet<Integer>();
        int count[] = new int[ar.length - k + 1];
        int freq = 0, index = 0;
        for (int i = 0; i <= ar.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                if (temp.contains(ar[i]) == false) {
                    temp.add(ar[i]);
                    freq++;
                }
            }
            count[index++] = freq;
            freq = 0;
            temp.clear();
        }
        return count;
    }

    public static void main(String args[]) {
        int ar[] = { 2, 5, 3, 6, 7, 5, 2, 2, 7 };
        int k = 4;
        int count[] = calc(ar, k);  
        for (int i : count) {
            System.out.print(i + " ");
        }
    }
}
