public class If {
    public static void main(String[] args) {
        byte a = 4;
        byte b = 5;
        if (a < b) {
            System.out.println(a + " < " + b);
        }
        a += b;
        if (a > b) {
            System.out.println(a + " > " + b);
        }
    }
}
