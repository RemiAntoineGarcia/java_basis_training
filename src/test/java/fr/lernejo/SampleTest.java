package fr.lernejo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    Sample sample = new Sample();

    @Test
    void TestOp()
    {
        assertEquals(11,sample.op(Sample.Operation.ADD,1,10));
        assertEquals(5,sample.op(Sample.Operation.MULT,1,5));
    }

    @Test
    void TestFact()
    {
        assertThrowsExactly(IllegalArgumentException.class, () -> sample.fact(-1));
        assertEquals(1,sample.fact(0));
        assertEquals(1,sample.fact(1));
        assertEquals(2,sample.fact(2));
        assertEquals(6,sample.fact(3));
        assertEquals(3628800,sample.fact(10));
    }


}
