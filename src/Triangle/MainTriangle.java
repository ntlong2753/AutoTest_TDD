package Triangle;


import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh tam giác a, b, c");

        System.out.print("Nhập cạnh a = ");
        double sideA = input.nextDouble();
        System.out.print("Nhập cạnh b = ");
        double sideB = input.nextDouble();
        System.out.print("Nhập cạnh c = ");
        double sideC = input.nextDouble();

        String result = TriangleClassifier.getTriangleType(sideA, sideB, sideC);
        System.out.println(result);
    }
}
