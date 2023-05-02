
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". Eleman: ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}