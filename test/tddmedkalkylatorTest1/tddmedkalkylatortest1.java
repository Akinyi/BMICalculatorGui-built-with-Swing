
package tddmedkalkylatorTest1;

import tddmedkalkylator.TDDmedKalkylator;
import junit.framework.TestCase;
import org.junit.Test;


public class tddmedkalkylatortest1 {

 TDDmedKalkylator tdd = new TDDmedKalkylator();

 @Test
    public final void getBMITest()  {
    TDDmedKalkylator tdd = new TDDmedKalkylator();     
        TestCase.assertTrue(tdd.getBMI(25,500) == 1);
        TestCase.assertFalse(tdd.getBMI(25,500) == 5);
    }
    
    @Test
    public final void additionTest(){
        TDDmedKalkylator tdd = new TDDmedKalkylator();
        TestCase.assertTrue(tdd.addition(25,500) == 525);
        TestCase.assertEquals(525.00, tdd.addition(25,500));
    }
    
    @Test
    public final void subtractionTest(){
        TDDmedKalkylator tdd = new TDDmedKalkylator();
        TestCase.assertTrue(tdd.subtraction(899,45) == 854);
        TestCase.assertEquals(854.00, tdd.subtraction(899,45));
        TestCase.assertEquals(899.00, 899.00);
        
    }
    
    @Test
    public final void openEditTest(){
        String password = "password";
        TestCase.assertTrue(tdd.openEdit(password) == true);
        TestCase.assertFalse(tdd.openEdit(password) == false);
    }
    
    @Test
    public final void saveEdit(){
        TestCase.assertTrue(tdd.saveEdit() != -1);
        TestCase.assertFalse(tdd.saveEdit() == -1);
    }
    
}
