package Triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TriangleClassifierTest {
    @Test
    @DisplayName("Kiểm tra tam giác đều")
    public void test01() {
        double sideA = 2.0;
        double sideB = 2.0;
        double sideC = 2.0;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.getTriangleType(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Kiểm tra tam giác cân")
    public void test02() {
        double sideA = 2.0;
        double sideB = 2.0;
        double sideC = 3.0;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.getTriangleType(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Kiểm tra tam giác thường")
    public void test03() {
        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 5.0;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.getTriangleType(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Kiểm tra tam giác hợp lệ")
    public void test04() {
        double sideA = 8.0;
        double sideB = 2.0;
        double sideC = 3.0;
        String expected = "Tam giác không hợp lệ";
        String result = TriangleClassifier.getTriangleType(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Kiểm tra tam giác hợp lệ")
    public void test05() {
        double sideA = -1.0;
        double sideB = 2.0;
        double sideC = 1.0;
        String expected = "Tam giác không hợp lệ";
        String result = TriangleClassifier.getTriangleType(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Kiểm tra tam giác hợp lệ")
    public void test06() {
        double sideA = 0;
        double sideB = 1.0;
        double sideC = 1.0;
        String expected = "Tam giác không hợp lệ";
        String result = TriangleClassifier.getTriangleType(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
}
