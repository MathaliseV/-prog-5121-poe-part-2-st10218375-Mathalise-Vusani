/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

/**
 *
 * @author ST10218375
 */
public class TaskTest {
    
    public TaskTest(String testName) 
    {
       String expectedString = "Add Task Feature";
       String actual = new String();
       assertEquals(expectedString,actual);
    }

    @Test
    public boolean testCheckTaskDescription() 
    {
       String expectedString = "Create add Task Feature to add task Users";
       
       return(expectedString.length() <=50);
    }

    @Test
    public void testCreateTaskID() 
    {
        
    }

    @Test
    public void testPrintTaskDetails() 
    {
       String expectedString = "Mike Smith";
       System.out.println("Mike Smith");
    }

    @Test
    public boolean testReturnTotalHours(boolean returntotalHours) 
    {
       int totalHours = 10;
       return returntotalHours;
    }
    
}
