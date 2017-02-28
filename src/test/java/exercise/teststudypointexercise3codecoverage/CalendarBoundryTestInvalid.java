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
public class CalendarBoundryTestInvalid {
    private int month;
    private int year;
    private int exp;
    
    public CalendarBoundryTestInvalid(int month, int year) {
        this.month = month;
        this.year = year;
    }
    
    /**
     * Test of getNumDaysInMonth method, of class Calendar.
     */
    
    @Parameterized.Parameters
    public static Collection<Integer[]> numbers(){
        return Arrays.asList(new Integer[][]{{-1,1985},{0,1985},{13,1975},{14,1964},{5,-2},{5,-1}});
    }
    
    @Test(expected=Exception.class)
    public void testGetNumDaysInMonth() throws Exception {
        int result = Calendar.getNumDaysInMonth(month, year);
        assertEquals(exp, result);
    }
}
