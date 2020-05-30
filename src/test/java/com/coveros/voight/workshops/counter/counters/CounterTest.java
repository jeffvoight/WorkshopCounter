package com.coveros.voight.workshops.counter.counters;

import com.coveros.voight.workshops.counter.counters.Counter;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;

/**
 * This tests the Counter class.
 * Note that none of the tests in this class test anything at all.
 * That is to say that this entire file is a bug.
 */
public class CounterTest {
    Counter c = mock(Counter.class); // won't work because abstract

    Counter c2 = Mockito.spy(Counter.class); // This is how to mock abstract

    Counter theCounter = new Counter() { // This works, too.
        @Override
        public int countItems() {
            return 1;
        }

        @Override
        public String getName() {
            return "GetName";
        }
    };

    @BeforeTest
    public void setup(){
        when(c.countItems()).thenReturn(1); // won't work because abstract
        when(c2.countItems()).thenReturn(1);
    }

    @Test
    public void badTestCountItems() {
        Assert.assertEquals(c.countItems(), 1); // doesn't test anything
    }

    @Test
    public void badTestGetCount() {
        Assert.assertEquals(c.getCount(), 0); // Didn't mock abstract
    }

    @Test
    public void spyTestGetCount() {
        Assert.assertEquals(c2.getCount(), 1);
    }

    @Test
    public void overrideTestCountItems() {
        Assert.assertEquals(theCounter.countItems(), 1);
    }

    @Test
    public void overrideTestGetCount() {
        Assert.assertEquals(theCounter.getCount(), 1);
    }
}
