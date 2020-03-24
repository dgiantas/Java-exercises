/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ListOperationsTest {
    
    
    public ListOperationsTest() {
        
        
    }
    private ListOperations listOperations;
    
    
    
    @BeforeClass
    public  void setUpClass() {
        listOperations = new ListOperations();
    }
    
    public void testAddNameToList(){
        
        listOperations.addNameToList("Andy");
        int sizeOfList  = listOperations.getSizeOfList();
        assertEquals(1, sizeOfList);
        
    }
    
    
    public void testGetList(){
    
    }
    
    @AfterClass
    public  void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
 
   
    @Test
    public void testRemoveNameFromList() {
        listOperations.removeNameFromList("Andy");
     int sizeOfList = listOperations.getSizeOfList();
     assertNotEquals(0,sizeOfList);
     
        

      
    }

    /**
     * Test of getSizeOfList method, of class ListOperations.
     */
    @Test
    public void testGetSizeOfList2() {
       
       
        int expectedResult = 0;
        int result = listOperations.getSizeOfList();
        assertEquals(expectedResult, result);
        
    }
    
}
