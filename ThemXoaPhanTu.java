import java.util.ArrayList;
import java.util.Scanner;

public class ThemXoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Nhập số lượng phần tử ban đầu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int value = scanner.nextInt();
            list.add(value);
        }
        System.out.println("Danh sách ban đầu: " + list);
        System.out.print("Nhập phần tử cần thêm: ");
        int them = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm (0 đến " + list.size() + "): ");
        int viTriThem = scanner.nextInt();

        if (viTriThem >= 0 && viTriThem <= list.size()) {
            list.add(viTriThem, them);
            System.out.println("Danh sách sau khi thêm: " + list);
        } else {
            System.out.println("Vị trí thêm không hợp lệ!");
        }
        System.out.print("Nhập
