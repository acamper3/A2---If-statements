import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class A02Test {

    @Test
    void testSum1() {
        assertEquals(21, a02.sum1());
    }

    @Test
    void testSum2() {
        assertEquals(1, a02.sum2(1));
        assertEquals(30, a02.sum2(6));
    }

    @Test
    void testSum3() {
        assertEquals(-1, a02.sum3(4, 5));
        assertEquals(3, a02.sum3(0, 5));
    }

    @Test
    void testSum4() {
        assertEquals(17, a02.sum4(4, 5));
        assertEquals(16, a02.sum4(4, 2));
    }

    @Test
    void testConditional() {
        assertEquals(5, a02.conditional(4, 5));
        assertEquals(8, a02.conditional(4, 4));
        assertEquals(14, a02.conditional(7, 2));
    }

    @Test
    void testP() {
        System.out.println("Test of p(0). Should print 1:");
        a02.p(0);
        System.out.println("Test of p(2). Should print 4:");
        a02.p(2);
        System.out.println("Test of p(-10). Should print -20:");
        a02.p(-10);
    }

    @Test
    void testLocal1() {
        assertEquals(10, a02.local1(2, 4));
        assertEquals(6, a02.local1(2, 2));
        assertEquals(5, a02.local1(2, 1));
    }

    @Test
    void testLoop1() {
        assertEquals(18, a02.loop1(3, 6));
        assertEquals(2, a02.loop1(2, 2));
        assertEquals(0, a02.loop1(2, 1));
    }

    @Test
    void testLoop2() {
        assertEquals(10, a02.loop2(3, 6));
        assertEquals(12, a02.loop2(2, 6));
        assertEquals(10, a02.loop2(3, 7));
        assertEquals(18, a02.loop2(3, 8));
    }

    @Test
    void testLoop3() {
        assertEquals(5, a02.loop3(3, 6));
        assertEquals(25, a02.loop3(26, 28));
        assertEquals(25, a02.loop3(25, 28));
        assertEquals(25, a02.loop3(26, 28));
        assertEquals(26, a02.loop3(27, 28));
        assertEquals(30, a02.loop3(30, 30));
        assertEquals(28, a02.loop3(29, 29));

    }

    @Test
    void testLoop4() {
        assertEquals(10, a02.loop4(3, 6));
        assertEquals(12, a02.loop4(2, 6));
        assertEquals(10, a02.loop4(3, 7));
        assertEquals(18, a02.loop4(3, 8));
    }

    @Test
    void testLoop5() {
        assertEquals(1, a02.loop5(1));
        assertEquals(1, a02.loop5(2));
        assertEquals(3, a02.loop5(3));
        assertEquals(1, a02.loop5(4));
        assertEquals(5, a02.loop5(5));
        assertEquals(3, a02.loop5(6));
        assertEquals(7, a02.loop5(7));
        assertEquals(1, a02.loop5(8));
        assertEquals(9, a02.loop5(9));
        assertEquals(5, a02.loop5(10));
        assertEquals(11, a02.loop5(11));
        assertEquals(3, a02.loop5(12));
        assertEquals(13, a02.loop5(13));
        assertEquals(7, a02.loop5(14));
        assertEquals(15, a02.loop5(15));
        assertEquals(1, a02.loop5(16));
        assertEquals(125, a02.loop5(1000));
        assertEquals(1, a02.loop5(32768));

    }

}