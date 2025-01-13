import java.util.*;

public class maincl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 words");
        String ar[] = new String[5];
        for (int i = 0; i < 5; i++)
            ar[i] = sc.next();
        System.out.println("Now enter the word to be searched");
        String str = sc.next();
        chararr ob = new chararr(ar, str);
        ob.check();
    }
}
