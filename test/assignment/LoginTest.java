/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignment;

import com.mycompany.assignment.Login;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

/**
 *
 * @author ST10218375
 */
public class LoginTest 
{
    Login response = new Login();
    
    
    public LoginTest() 
    {
        
    }

    @Test
    public boolean testCheckUsername() 
    {
        int expected = 50;
        
        int actual = response.CheckUsername();
        assertEquals(expected,actual);
        
        return true;
    }           

    @Test
    public boolean testCheckpasswordcomplexity() 
    {
        String expected = "Please enter Password";
        String actual = response.ReturnLoginStatus(true);
        assertEquals(expected,actual);
        return true;
         
    }
    
}
