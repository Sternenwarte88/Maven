import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.*;

public class TestClass {

    @Test
    public void testMethod(){
        final int expected = 4;
        final int actual = Math.addExact(2,2);
        assertEquals( expected, actual, "Should be 2+2 is 4 but it was: " + actual);
    }

}