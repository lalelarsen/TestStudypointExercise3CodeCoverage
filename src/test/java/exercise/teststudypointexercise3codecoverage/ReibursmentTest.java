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
public class ReibursmentTest {
    
    boolean deductible;
    String visitType;
    int result;
    
    public ReibursmentTest(boolean dd, String vt, int result){
        deductible = dd;
        visitType = vt;
        this.result = result;
    }
    
     @Parameterized.Parameters
    public static Collection<Object[]> numbers(){
        return Arrays.asList(new Object[][]{{true,"Doctor's Office",50},{true,"Hospital",80},{false,"Doctor's Office",0},{false,"Hospital",0}});
    }
    
    @Test
    public void testGetReimbursement() {
        int exp = Reibursment.getReimbursement(deductible, visitType);
        assertEquals(exp, result);
    }
    
}
