import java.util.InputMismatchException;
import java.util.Scanner;

public class player {
    int pno;
    int symbol;

    player(int num) {
        this.pno = num;
        if (pno == 1)
            this.symbol = 1;
        else
            this.symbol = 2;
    }

    void playMove(board ob) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Player " + this.pno + ", enter your indices (row and column): ");
                int m = sc.nextInt();
                int n = sc.nextInt();
                int result = ob.placeSymbol(this.symbol, m, n);

                if (result == 0) {
                    break; // Move successfully made
                } else if (result == 1) {
                    System.out.println("Spot has been taken, please try again.\n");
                } else if (result == 2) {
                    System.out.println("Invalid index, please try again.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Integer hi enter kar sakte ho maharaj, firse prayas karo!\n");
                sc.nextLine();
            }
        }
    }

}
