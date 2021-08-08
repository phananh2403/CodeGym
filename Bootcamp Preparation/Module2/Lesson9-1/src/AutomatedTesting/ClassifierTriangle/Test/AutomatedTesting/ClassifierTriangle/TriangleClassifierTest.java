package AutomatedTesting.ClassifierTriangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import AutomatedTesting.ClassifierTriangle.TriangleClassifier;
class TriangleClassifierTest {
    @Test
    void test0(){
        double first = 2;
        double second = 2;
        double third = 2;

        TriangleClassifier test = new TriangleClassifier(2,2,2);
    }

    @Test
    void test1(){
        double first = 2;
        double second = 2;
        double third = 2;

        TriangleClassifier test = new TriangleClassifier(2,2,3);
    }

    @Test
    void test2(){
        double first = 2;
        double second = 2;
        double third = 2;

        TriangleClassifier test = new TriangleClassifier(3,4,5);
    }

    @Test
    void test3(){
        double first = 2;
        double second = 2;
        double third = 2;

        TriangleClassifier test = new TriangleClassifier(8,2,3);
    }

    @Test
    void test4(){
        double first = 2;
        double second = 2;
        double third = 2;

        TriangleClassifier test = new TriangleClassifier(-1,2,1);
    }

    @Test
    void test5(){
        double first = 2;
        double second = 2;
        double third = 2;

        TriangleClassifier test = new TriangleClassifier(0,1,1);
    }
}