import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxValue = 0;
        int mostFrequent = arr[0];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Phần tử xuất hiện nhiều nhất là: " + mostFrequent + " (xuất hiện " + maxValue + " lần)");
    }
}
