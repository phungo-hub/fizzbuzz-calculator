import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class FizzBuzzTest {

    @Test
    void testFizzBuzzClassify0() {
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzzClassify(15);

        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzClassify1() {
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzzClassify(21);

        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzClassify2() {
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzzClassify(25);

        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzClassify3() {
        int num = 54;

        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzzClassify(num);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Khong chia het cho 3 & 5, chua so 3")
    void testFizzBuzzClassify4() {
        int num = 31;

        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzzClassify(num);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Khong chia het cho 3 & 5, chua so 5")
    void testFizzBuzzClassify5() {
        int num = 58;

        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzzClassify(num);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Khong thoa tieu chi")
    void testFizzBuzzClassify6() {
        int num = 88;

        String expected = "88";
        String result = FizzBuzz.fizzBuzzClassify(num);

        assertEquals(expected, result);
    }
}