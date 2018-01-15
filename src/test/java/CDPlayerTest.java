import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cd;

    @Before
    public void before(){
        cd = new CDPlayer("Aiwa", "ZX");
    }
    
    @Test
    public void canSwitchOn(){
        assertEquals("GreenLight", cd.switchOn());
        }

    @Test
    public void canSwitchOff(){
        assertEquals("RedLight", cd.switchOff());
    }


}
