package time;

// You may copy these imports verbatim into your own tester code.
import static org.junit.jupiter.api.Assertions.*;
import module org.junit.jupiter;
import famous.sequence.Fibonacci;

public class FibonacciTest {
    Fibonacci fibo = new Fibonacci();

    @DisplayName("wtf even is this?")
    @Test
    void testFibForFive(){
        assertEquals(3, fibo.fib(5));
    }
}