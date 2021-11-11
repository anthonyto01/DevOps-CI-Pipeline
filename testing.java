package javaapplication2;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author antho
 */
public class Dec2HexTest {
    public String result = "";
    public int Dec2Hex;
   
    public Dec2HexTest() {
    }

    @Before
    public void  Dec2Hex (String args[]) throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of main method, of class Dec2Hex.
     */
    @Test
    public void testMain() {
                System.out.println("Hexadecimal representation is: ");
                
                Dec2Hex dec2Hex = new Dec2Hex(new String [] {"150"});
                //What the expected result would be once tested
                String expResult = "1E";
                String hexadecimal = "";  
                result = hexadecimal;
                //Checks if the testing results matches with the expected/actual result
                assertEquals(expResult, result);
    }

    /**
     * Test of checkInput method, of class Dec2Hex.
     */
    @Test
    public void testCheckInput() {
    }
    
}

