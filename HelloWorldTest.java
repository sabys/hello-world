import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    public void greetReturnsGreetingWithName() {
        assertEquals("Hello, Sebastian!", HelloWorld.greet("Sebastian"));
    }
}
