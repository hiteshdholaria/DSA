import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class TestSortedArraysMedian {
    @Test
    public void testGreaterNumbers1() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 50, 50, 100, 200).toArray(), 50);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGreaterNumbers2() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 50, 50, 50, 200).toArray(), 50);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers3() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 50, 50, 100, 200).toArray(), 50);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGreaterNumbers4() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 50, 50, 50, 50).toArray(), 50);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers5() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 50, 50, 50, 50, 150).toArray(), 10);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testGreaterNumbers6() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 50, 50, 50, 50, 150).toArray(), 0);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testGreaterNumbers7() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(50, 50, 50, 50, 50, 50).toArray(), 50);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers8() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 50, 50, 50, 100, 100, 150).toArray(), 100);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers9() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 50, 50, 50, 100, 100, 150).toArray(), 50);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testGreaterNumbers10() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 50, 50, 50, 100, 100, 100).toArray(), 100);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers11() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 50, 50, 50, 100, 100, 100).toArray(), 10);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testGreaterNumbers12() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 50, 50, 50, 100, 100, 100).toArray(), 5);
        Assert.assertEquals(9, result);
    }

    @Test
    public void testGreaterNumbers13() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 50, 50, 50, 100, 100, 100).toArray(), 15);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testGreaterNumbers14() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 50, 50, 50, 100, 100, 100).toArray(), 50);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testGreaterNumbers15() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 50, 50, 50, 100, 100, 100).toArray(), 60);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testGreaterNumbers16() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 50, 50, 50, 100, 100, 100).toArray(), 100);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers17() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 50, 50, 50, 100, 100, 100).toArray(), 200);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers18() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10).toArray(), 5);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers19() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10).toArray(), 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers20() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10).toArray(), 20);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers21() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10).toArray(), 5);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGreaterNumbers22() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10).toArray(), 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers23() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10).toArray(), 20);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers24() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10).toArray(), 5);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testGreaterNumbers25() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10).toArray(), 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers26() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10).toArray(), 20);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers27() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 20).toArray(), 5);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testGreaterNumbers28() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 20).toArray(), 10);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers29() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 20).toArray(), 15);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers30() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 20).toArray(), 20);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers31() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 10, 10, 20).toArray(), 30);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers32() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40).toArray(), 5);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testGreaterNumbers33() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40).toArray(), 10);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testGreaterNumbers34() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40).toArray(), 15);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testGreaterNumbers35() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40).toArray(), 20);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGreaterNumbers36() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40).toArray(), 25);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGreaterNumbers37() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40).toArray(), 30);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers38() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40).toArray(), 35);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers39() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40).toArray(), 40);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers40() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40).toArray(), 45);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers41() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 5);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testGreaterNumbers42() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 30);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGreaterNumbers43() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 5);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testGreaterNumbers44() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 10);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testGreaterNumbers45() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 15);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testGreaterNumbers46() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 20);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers47() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 25);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers48() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 30);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers49() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 40);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers50() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of().toArray(), 40);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers51() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 20, 0, 5);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGreaterNumbers52() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 5, 2, 6);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testGreaterNumbers53() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 10, 2, 6);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testGreaterNumbers54() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 15, 2, 6);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testGreaterNumbers55() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 20, 2, 6);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testGreaterNumbers56() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 25, 2, 6);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testGreaterNumbers57() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 30, 2, 6);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGreaterNumbers58() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 35, 2, 6);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGreaterNumbers59() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 40, 2, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers60() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 45, 2, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers61() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 5, 0, 0);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers62() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 10, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers63() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 15, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers64() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 5, 2, 2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers65() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 10, 2, 2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers66() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 15, 2, 2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers67() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 20, 2, 2);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers68() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 25, 2, 2);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers69() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 25, 8, 8);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers70() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 40, 8, 8);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGreaterNumbers71() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 50, 8, 8);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGreaterNumbers72() {
        int result = SortedArraysMedian.greaterNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 55, 8, 8);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers1() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(50, 50, 50, 50, 50, 50).toArray(), 50);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers2() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 50, 50, 50, 50, 50).toArray(), 50);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSmallerNumbers3() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 50, 50, 50, 50).toArray(), 50);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSmallerNumbers4() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(50, 50, 50, 50, 50, 100).toArray(), 100);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSmallerNumbers5() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(50, 50, 50, 100, 100, 200).toArray(), 100);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSmallerNumbers6() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(50, 50, 50, 100, 100, 200).toArray(), 150);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSmallerNumbers7() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 50, 50, 50, 100, 100, 200).toArray(), 100);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSmallerNumbers8() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 50, 50, 50, 100, 100, 200).toArray(), 50);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSmallerNumbers9() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 50, 50, 50, 100, 100, 200).toArray(), 20);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSmallerNumbers10() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10, 20, 20, 20, 50, 50, 50, 100, 100, 200).toArray(), 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers11() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10, 20, 20, 20, 50, 50, 50, 100, 100, 200).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers12() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10, 20, 20, 20, 50, 50, 50, 100, 100, 200).toArray(), 15);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSmallerNumbers13() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10, 20, 20, 20, 50, 50, 50, 100, 100, 200).toArray(), 40);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testSmallerNumbers14() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10, 20, 20, 20, 50, 50, 50, 100, 100, 200).toArray(), 400);
        Assert.assertEquals(12, result);
    }

    @Test
    public void testSmallerNumbers15() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10, 20, 20, 20, 50, 50, 50, 100, 100, 200).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers16() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers17() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10).toArray(), 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers18() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10).toArray(), 20);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSmallerNumbers19() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers20() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10).toArray(), 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers21() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10).toArray(), 20);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSmallerNumbers22() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers23() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10).toArray(), 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers24() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10).toArray(), 20);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSmallerNumbers25() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10, 10).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers26() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10, 10).toArray(), 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers27() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 10, 10, 10).toArray(), 20);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSmallerNumbers28() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers29() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40).toArray(), 10);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers30() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40).toArray(), 15);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSmallerNumbers31() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40).toArray(), 20);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSmallerNumbers32() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40).toArray(), 25);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSmallerNumbers33() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40).toArray(), 30);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSmallerNumbers34() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40).toArray(), 35);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSmallerNumbers35() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40).toArray(), 40);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSmallerNumbers36() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40).toArray(), 45);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSmallerNumbers37() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers38() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 30);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSmallerNumbers39() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 50);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSmallerNumbers40() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 60);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSmallerNumbers41() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 25);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSmallerNumbers42() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 20);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSmallerNumbers43() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 30);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSmallerNumbers44() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30).toArray(), 40);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSmallerNumbers45() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of().toArray(), 40);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers46() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 50, 3, 8);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSmallerNumbers47() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 5, 0, 4);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers48() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 10, 0, 4);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers49() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 15, 0, 4);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSmallerNumbers50() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 20, 0, 4);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSmallerNumbers51() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 25, 0, 4);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSmallerNumbers52() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 30, 0, 4);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSmallerNumbers53() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 35, 0, 4);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSmallerNumbers54() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 10, 1, 3);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers55() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 20, 1, 3);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers56() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 25, 1, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSmallerNumbers57() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 5, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers58() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 10, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers59() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 15, 0, 0);
        Assert.assertEquals(1, result);
    }
////

    @Test
    public void testSmallerNumbers60() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 5, 6, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers61() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 30, 6, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers62() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 40, 6, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSmallerNumbers63() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 45, 6, 6);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSmallerNumbers64() {
        int result = SortedArraysMedian.smallerNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 100, 6, 6);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers1() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of().toArray(), 40);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers2() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers3() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10).toArray(), 10);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers4() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10).toArray(), 15);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers5() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers6() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10).toArray(), 10);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testEqualNumbers7() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10).toArray(), 15);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers8() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10, 20, 30, 30, 30, 40).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers9() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10, 20, 30, 30, 30, 40).toArray(), 10);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testEqualNumbers10() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10, 20, 30, 30, 30, 40).toArray(), 15);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers11() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10, 20, 30, 30, 30, 40).toArray(), 20);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers12() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10, 20, 30, 30, 30, 40).toArray(), 25);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers13() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10, 20, 30, 30, 30, 40).toArray(), 30);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testEqualNumbers14() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10, 20, 30, 30, 30, 40).toArray(), 40);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers15() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10, 20, 30, 30, 30, 40).toArray(), 45);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers16() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 10, 20, 30, 30, 30, 40, 40, 40, 40).toArray(), 40);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testEqualNumbers17() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers18() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers19() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers20() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 10);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers21() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 15);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers22() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 20);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers23() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 25);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers24() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 30);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers25() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 35);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers26() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 40);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers27() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 45);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers28() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 50);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers29() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 50).toArray(), 55);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers30() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 30, 40, 40, 40, 50).toArray(), 40);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testEqualNumbers31() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 20);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testEqualNumbers32() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 15);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers33() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 30);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers34() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 25);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers35() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 50);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers36() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 50, 3, 7);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers37() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 50, 3, 8);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers38() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 5, 0, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers39() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 10, 0, 6);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers40() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 15, 0, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers41() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 20, 0, 6);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testEqualNumbers42() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 25, 0, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers43() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 30, 0, 6);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers44() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 35, 0, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers45() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 40, 0, 6);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testEqualNumbers46() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 50, 0, 6);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers47() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 5, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers48() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 10, 0, 0);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers49() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 15, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers50() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 15, 3, 3);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEqualNumbers51() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 20, 3, 3);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testEqualNumbers52() {
        int result = SortedArraysMedian.equalNumbers(IntStream.of(10, 20, 20, 20, 30, 40, 40, 40, 50).toArray(), 25, 3, 3);
        Assert.assertEquals(0, result);
    }

}
