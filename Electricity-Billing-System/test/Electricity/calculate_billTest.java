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
public class calculate_billTest {
    calculate_bill c;
    @Before
    public void setup () throws Exception {
        c = new calculate_bill();
    }
    @Test
    public void testCalculate_bill() {
       assertEquals(1000,c.cal_bill(500, 300, 200));
    }

   
    
}
