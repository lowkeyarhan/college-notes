import java.util.Scanner;

public class muehehehehe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length followed by elements");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println("Printing");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++)
                    System.out.print(ar[k] + ", ");
                System.out.println();
            }
        }
        System.out.println("Sum");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                System.out.println(sum += ar[j]);
            }
        }
    }

}