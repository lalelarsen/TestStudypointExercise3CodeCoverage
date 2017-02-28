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
public class Calendar {
    
    public static int getNumDaysInMonth(int month, int year) throws Exception{
        //tjek om det er febuar
        if(month == 2){
            //2 conditions. alle år 400 går op i, og alle år 4 går op i hvor 100 ikke gør.
            if(year%400 == 0 || year%4 == 0 && year%100 != 0){
                return 29;
            }
            return 28;
            //tjek efter september, april, juni og november
        } else if(month == 9 || month == 4 || month == 6 || month == 11){
            return 30;
        }
        if(month < 1 || month > 12 || year < 0 || year > Integer.MAX_VALUE){
            throw new Exception();
        }
        return 31;
    }
    
}
