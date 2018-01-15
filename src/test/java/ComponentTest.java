import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponentTest {

    Radio radio;


    @Before
    public void before(){
        radio = new Radio("Sony", "xxx");
    }




    @Test
    public void canGetMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("xxx", radio.getModel());
    }

    @Test
    public void canTurnUp(){
        assertEquals("louder", radio.turnUp());
    }

    @Test
    public void canTurnDown(){
        assertEquals("softer", radio.turnDown());

    }
}
