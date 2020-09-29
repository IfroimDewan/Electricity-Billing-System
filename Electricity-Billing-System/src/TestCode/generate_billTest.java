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
public class generate_billTest {
    generate_bill c;
    @Before
    public void setUp() throws Exception {
         c = new generate_bill();
    }
    /**
     * Test of generate_bill method, of class pay_bill.
     */
    @Test
    public void testGenera_bill() {
        assertEquals(400,c.genera_bill(100,300));
    }  
}
