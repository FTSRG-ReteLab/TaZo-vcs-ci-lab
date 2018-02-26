package hu.bme.mit.train.tachograph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrainTachographTest {

    TrainTachograph ttg;

    @Before
    public void before() {
        ttg = new TrainTachograph();
    }

    @Test
    public void CheckEmptyCollection() {

        Assert.assertEquals(true, ttg.isEmpty());
        ttg.add("2018-12-02", 5, 25);
        Assert.assertEquals(false, ttg.isEmpty());
    }

}
