import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert.*;

public class SkillDemoTest {

    @Test
    public void test(){
        assertEquals(1, SkillDemo.multiply(2, 3));
    }
    
}
