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

/**
 *
 * @author Frederik
 */
@RunWith(Parameterized.class)
public class CalendarBoundryTest {
    private int month;
    private int year;
    private int exp;
    
    public CalendarBoundryTest(int month, int year, int exp) {
        this.month = month;
        this.year = year;
        this.exp = exp;
    }
    
    /**
     * Test of getNumDaysInMonth method, of class Calendar.
     */
    
    @Parameterized.Parameters
    public static Collection<Integer[]> numbers(){
        return Arrays.asList(new Integer[][]{{1,1985,31},{2,1985,28},{11,1975,30},{12,1964,31},{5,1,31},{5,2,31}});
    }
    
    @Test
    public void testGetNumDaysInMonth() throws Exception {
        int result = Calendar.getNumDaysInMonth(month, year);
        assertEquals(exp, result);
    }
}
