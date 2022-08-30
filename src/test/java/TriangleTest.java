import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {

        private static Logger logger =
                LoggerFactory.getLogger(TriangleTest.class);



        @Order(1)
        @DisplayName("Test 1")
        @ParameterizedTest
        @CsvSource({"3,4,5"})
        void testOne(int a, int b, int c) throws MyException {
                Triangle triangle = new Triangle();
                Assertions.assertEquals(6,triangle.triangleArea(a,b,c));

        }

        @Order(2)
        @DisplayName("Test 2")
        @ParameterizedTest
        @CsvSource({"3,4,0"})
        void testTwo(int a, int b, int c) throws MyException {
                Triangle triangle = new Triangle();
                Assertions.assertThrows(MyException.class,()-> triangle.triangleArea(a,b,c));

        }

        @Order(4)
        @DisplayName("Test 3")
        @ParameterizedTest
        @CsvSource({"3,0,5"})
        void testThree(int a, int b, int c) throws MyException {
                Triangle triangle = new Triangle();
                Assertions.assertThrows(MyException.class,()-> triangle.triangleArea(a,b,c));

        }
        @Order(5)
        @DisplayName("Test 4")
        @ParameterizedTest
        @CsvSource({"0,4,5"})
        void testFour(int a, int b, int c) throws MyException {
                Triangle triangle = new Triangle();
                Assertions.assertThrows(MyException.class,()-> triangle.triangleArea(a,b,c));

        }

        @Order(6)
        @DisplayName("Test 5")
        @ParameterizedTest
        @CsvSource({"-1,4,5"})
        void testFive(int a, int b, int c) throws MyException {
                Triangle triangle = new Triangle();
                Assertions.assertThrows(MyException.class,()-> triangle.triangleArea(a,b,c));

        }

        @Order(7)
        @DisplayName("Test 6")
        @ParameterizedTest
        @CsvSource({"3,-1,5"})
        void testSix(int a, int b, int c) throws MyException {
                Triangle triangle = new Triangle();
                Assertions.assertThrows(MyException.class,()-> triangle.triangleArea(a,b,c));

        }
}
