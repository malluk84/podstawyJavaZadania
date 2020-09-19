package sda.basic.java.day1;

public class Ex1 {

    public static void main(String[] args) {
        displayWordInHexFormat();
        displayWordInBinFormat();
        displayWordInDecFormat();

        // dorobić że przez scanner sami decydujemy czy hex bin dec
        // zobaczymy czy działa
    }

    private static void displayWordInDecFormat() {

        char s = 83;
        char d = 68;
        char a = 65;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
        System.out.println();
    }

    private static void displayWordInBinFormat() {
        char s = 0b01010011;
        char d =0b01000100;
        char a = 0b01000001;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
        System.out.println();

    }

    private static void displayWordInHexFormat() {
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
        System.out.println();
    }

}
