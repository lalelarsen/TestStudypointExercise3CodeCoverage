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
public class CalendarEquivalenceTest {
    
    private int month;
    private int year;
    private int exp;
    
    public CalendarEquivalenceTest(int month, int year, int exp) {
        this.month = month;
        this.year = year;
        this.exp = exp;
    }
    
    /**
     * Test of getNumDaysInMonth method, of class Calendar.
     */
    
    @Parameters
    public static Collection<Integer[]> numbers(){
        return Arrays.asList(new Integer[][]{{1,1985,31},{1,1984,31},{9,1975,30},{9,1964,30},{2,1965,28},{2,1944,29}});
    }
    
    @Test
    public void testGetNumDaysInMonth() throws Exception {
        int result = Calendar.getNumDaysInMonth(month, year);
        assertEquals(exp, result);
    }
    
}
