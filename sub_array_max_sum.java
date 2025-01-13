import java.util.*;

public class sub_array_max_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n, and then array");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println("Now enter k");
        int k = sc.nextInt();
        System.out.println(maxsum(ar, k));
    }

    static int maxsum(int ar[], int k) {
        int max = ar[0], sum = 0;
        int prefix[] = new int[ar.length];
        for (int i = 0; i < prefix.length; i++) {
            sum += ar[i];
            prefix[i] = sum;
        }
        sum = 0;
        for (int i = 0; i <= ar.length - k; i++) {
            if (i == 0)
                sum = prefix[i + k - 1];
            else
                sum = prefix[i + k - 1] - prefix[i - 1];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}