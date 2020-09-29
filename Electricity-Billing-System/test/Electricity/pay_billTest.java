/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author ifroi
 */
public class pay_billTest {
    
    pay_bill b;
    @Before
    public void setUp() throws Exception {
         b = new pay_bill();
    }  
    /**
     * Test of payBill method, of class pay_bill.
     */
    @Test
    public void testpBill() {
        assertEquals(900,b.pBill(500,400));
    }    
}
