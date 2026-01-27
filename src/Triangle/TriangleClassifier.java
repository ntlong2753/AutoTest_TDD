package Triangle;

public class TriangleClassifier {
    public static String getTriangleType(double sideA, double sideB, double sideC) {
        boolean positiveSides = sideA > 0 && sideB > 0 && sideC > 0;
        boolean triangleInequality = (sideA + sideB > sideC)
                && (sideB + sideC > sideA)
                && (sideA + sideC > sideB);

        if (positiveSides && triangleInequality) {
            if (sideA == sideB && sideB == sideC) {
                return "Tam giác đều";
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                return "Tam giác cân";
            } else {
                return "Tam giác thường";
            }
        }
        return "Tam giác không hợp lệ";
    }
}
