import java.util.Scanner;
public class bai6 {
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int x = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int y = sc.nextInt();
        System.out.println("UCLN của " + x + " và " + y + " là: " + UCLN(x, y));
        System.out.println("BCNN của " + x + " và " + y + " là: " + BCNN(x, y));
    }
}
