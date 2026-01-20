package NextDayCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {
    @Test
    public void testNextDay01() {
        int day = 1;
        int month = 1;
        int year = 2020;
        String expected = "2/1/2020";
        String result = NextDayCalculator.getNextDay(day, month, year);
    }
    @Test
    public void testNextDay02() {
        int day = 31;
        int month = 1;
        int year = 2020;
        String expected = "1/2/2020";
        String result = NextDayCalculator.getNextDay(day, month, year);
    }
    @Test
    public void testNextDay03() {
        int day = 28;
        int month = 2;
        int year = 2020;
        String expected = "29/2/2020";
        String result = NextDayCalculator.getNextDay(day, month, year);
    }
    @Test
    public void testNextDay04() {
        int day = 28;
        int month = 2;
        int year = 2019;
        String expected = "1/3/2019";
        String result = NextDayCalculator.getNextDay(day, month, year);
    }
    @Test
    public void testNextDay05() {
        int day = 30;
        int month = 4;
        int year = 2020;
        String expected = "1/5/2020";
        String result = NextDayCalculator.getNextDay(day, month, year);
    }
}
