/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CalculationTest {
    
    public CalculationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetSumValid() {
        Calculation calc = new Calculation();
       int result = calc.getSum(2, 2);
       assertEquals(4,result);
    }
     
    @Test
   public void testGetSumNotValid(){
        Calculation calc = new Calculation();
       int result = calc.getSum(2, 2);
       assertNotEquals(5, result);
    }
    
   
    @Test
  public void testDivisionValid(){
       Calculation calc = new Calculation();
  double result = calc.division(4,2);
  assertNotEquals(2,result, 0.1);
  }
  
  @Test(expected = ArithmeticException.class)
  public void testDivisionZeroNumber(){
       Calculation calc = new Calculation();
  calc.division(4,0);
  }
  
  
   @Test
  public void testDivisionNegativeNumber(){
       Calculation calc = new Calculation();
 double result = calc.division(-4,2);
 assertTrue(result<0);
  }
  
  @Test
  public void testDivisionPositiveNumber(){
       Calculation calc = new Calculation();
 double result = calc.division(-4,-2);
 assertFalse(result<0);
  }
  
  
  
  @Test
  public void testSumOfArrayValid(){
      Calculation calc = new Calculation();
      int []array = {2,4,8};
      int sum =  calc.sumOfArray(array);
      assertEquals(14,sum);
  }
  
  
  
   @Test
  public void testSumOfArrayNotValid(){
      Calculation calc = new Calculation();
      int []array = {2,4,8};
      int sum =  calc.sumOfArray(array);
      assertNotEquals(20,sum);
}
   

}
       

