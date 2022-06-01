import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer testCustomer = new Customer("Rick");

    @Test
    public void testGetName(){
        assertEquals("Rick", testCustomer.getName());
    }

    @Test
    public void testAmountFor() {

    }

    @Test
    public void testStatement(){

    }

}