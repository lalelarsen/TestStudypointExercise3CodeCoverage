/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.teststudypointexercise3codecoverage;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Frederik
 */
@RunWith(Parameterized.class)
public class CalendarInvalidEquivalenceTest {
    
    private int month;
    private int year;
    
    public CalendarInvalidEquivalenceTest(int month, int year) {
        this.month = month;
        this.year = year;
    }
    
    /**
     * Test of getNumDaysInMonth method, of class Calendar.
     */
    
    @Parameters
    public static Collection<Integer[]> numbers(){
        return Arrays.asList(new Integer[][]{{-5,1985},{15,1985},{5,-50},{5,Integer.MAX_VALUE + 1}});
    }
    
    @Test(expected=Exception.class)
    public void testGetNumDaysInMonth() throws Exception {
        int result = Calendar.getNumDaysInMonth(month, year);
        
    }
    
}
