public class countchar {
    String str;
    char ch;
    int c = 0;

    countchar(String str, char ch) {
        this.str = str;
        this.ch = ch;
        this.c = 0;
    }

    public int counter() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                c++;
        }
        return c;
    }
}
