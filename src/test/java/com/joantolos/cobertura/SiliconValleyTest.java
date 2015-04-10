package com.joantolos.cobertura;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Created by u6019943 on 10/04/2015.
 */
public class SiliconValleyTest {
    
    private SiliconValley siliconValley;
    private Method method;
    
    @Before
    public void setUp(){
        this.method = Method.AGILE;
        this.siliconValley = new SiliconValley(this.method);
    }
    
    @After
    public void tearDown(){
        this.method = null;
        this.siliconValley = null;
    }
    
    @Test
    public void agileRulesTest(){
        Assert.assertTrue(this.siliconValley.changeTheWorld());
    }

    @Test
    public void waterfallSucksTest(){
        SiliconValley siliconValleyFailing = new SiliconValley(Method.WATERFALL);
        Assert.assertFalse(siliconValleyFailing.changeTheWorld());
    }
    
}
