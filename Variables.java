public class Variables {
    public static void main(String[] args) {
        short varShort = 32000;
        long varLong = 640000000;

        double varDouble = 640000000.12345; // 64 bit
        float varFloat = 640000000.3f; // 32 bit

        char varChar = 'a'; // '' - important

        boolean varBoolean = true;

        byte varByte = 100; // -128-127

        System.out.println(varShort);
        System.out.println(varLong);
        System.out.println(varDouble);
        System.out.println(varFloat);
        System.out.println(varChar);
        System.out.println(varBoolean);
        System.out.println(varByte);
    }
}
