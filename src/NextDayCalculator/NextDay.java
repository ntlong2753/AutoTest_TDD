package NextDayCalculator;

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = sc.nextInt();
        System.out.print("Nhập tháng: ");
        int month = sc.nextInt();
        System.out.print("Nhập năm: ");
        int year = sc.nextInt();

        String result = NextDayCalculator.getNextDay(day, month, year);
        
        System.out.println("Ngày tiếp theo là: " + result);
    }
}
