import java.util.*;

public class chararr {
    String ar[];
    String str;
    char ch;

    chararr(String ar[], String str) {
        this.ar = ar;
        this.str = str;
    }

    void check() { // checks if str is present in the array, if present asks for a word to search
        // and call the other class fucntion
        Scanner sc = new Scanner(System.in);
        for (String i : ar) {
            if (i.equals(str)) {
                System.out.println("Word found, Now enter the letter to be searched");
                this.ch = sc.next().charAt(0);
                countchar obj = new countchar(str, ch); // creates the other class object
                int res = obj.counter(); // calls the other class method to get the digit count
                if (res == 0)
                    System.out.println("Character is not present");
                else
                    System.out.println("It's present " + res + " times.");
            }
        }
    }
}
