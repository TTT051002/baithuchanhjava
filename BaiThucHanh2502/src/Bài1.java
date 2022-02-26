import java.util.Scanner;

public class Bài1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen duong b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN cua " + a + " va " + b
                + " la: " + USCLN(a, b));

    }

    public static int USCLN(int a, int b) {
        if (b == 0)
            return a;
        return USCLN(b, a % b);
    }
}
