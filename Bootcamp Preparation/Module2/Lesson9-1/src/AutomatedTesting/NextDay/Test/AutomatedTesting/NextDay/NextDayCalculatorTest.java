package AutomatedTesting.NextDay;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import AutomatedTesting.NextDay.NextDayCalculator;

class NextDayCalculatorTest {
    @Test
    void testNextDay0(){
        int day = 1;
        int month = 1;
        int year = 2018;

        NextDayCalculator.findNextDay(day,month,year);
    }

    @Test
    void testNextDay1(){
        int day = 31;
        int month = 1;
        int year = 2018;

        NextDayCalculator.findNextDay(day,month,year);
    }

    @Test
    void testNextDay2(){
        int day = 30;
        int month = 4;
        int year = 2018;

        NextDayCalculator.findNextDay(day,month,year);
    }

    @Test
    void testNextDay3(){
        int day = 28;
        int month = 2;
        int year = 2018;

        NextDayCalculator.findNextDay(day,month,year);
    }

    @Test
    void testNextDay4(){
        int day = 29;
        int month = 2;
        int year = 2020;

        NextDayCalculator.findNextDay(day,month,year);
    }

    @Test
    void testNextDay5(){
        int day = 31;
        int month = 12;
        int year = 2018;

        NextDayCalculator.findNextDay(day,month,year);
    }

    public static void main(String[] args) {
        System.out.println(NextDayCalculator.findNextDay(1,1,2018));
        System.out.println(NextDayCalculator.findNextDay(31,1,2018));
        System.out.println(NextDayCalculator.findNextDay(30,4,2018));
        System.out.println(NextDayCalculator.findNextDay(28,2,2018));
        System.out.println(NextDayCalculator.findNextDay(29,2,2020));
        System.out.println(NextDayCalculator.findNextDay(31,12,2018));
    }
}