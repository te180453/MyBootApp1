package jp.te4a.spring.boot.myapp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        HelloController hc = new HelloController();
        String expect = hc.index();
        String actual = "Hello Spring World";
        assertEquals(expect, actual);
    }
}
