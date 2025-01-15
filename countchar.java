public class countchar {
    private String str;
    private char ch;
    private int c;

    public countchar(String str, char ch) {
        this.str = str;
        this.ch = ch;
        this.c = 0;
    }

    public int counter() {
        c = 0; // Reset count to ensure accurate results on multiple calls
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                c++;
        }
        return c;
    }
}
