/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.teststudypointexercise3codecoverage;

/**
 *
 * @author Frederik
 */
public class Reibursment {
    public static int getReimbursement(boolean deductible, String visitType){
        //set return value til 0 by default
        int percentageReimbursed = 0;
        //tjek om deductible er opnået
        if(deductible){
            //jeg har lavet det til en switch case, så den kan blive udvidet nemt
            switch (visitType){
                case "Doctor's Office":
                    percentageReimbursed = 50;
                    break;
                case "Hospital":
                    percentageReimbursed = 80;
                    break;
            }
        }
        return percentageReimbursed;
    }
}
