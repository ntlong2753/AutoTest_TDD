package Triangle;

public class TriangleClassifier {
    public static String getTriangleType(double sideA, double sideB, double sideC) {
        boolean inValidTriangle = sideA > 0 && sideB > 0 && sideC > 0;
        if (inValidTriangle) {
            boolean EquilateralTriangle = (sideA == sideB && sideA == sideC);
            if (EquilateralTriangle) {
                return "Tam giác đều";
            }

            boolean IsoscelesTriangle = (sideA == sideB || sideA == sideC || sideB == sideC);
            if (IsoscelesTriangle) {
                return "Tam giác cân";
            }

            boolean scaleneTriangle = (sideA + sideB > sideC)
                    && (sideB + sideC > sideA)
                    && (sideA + sideC > sideB);
            if (scaleneTriangle) {
                return "Tam giác thường";
            }
        }
        return "Tam giác không hợp lệ";
    }

}
