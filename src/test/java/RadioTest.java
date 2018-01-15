import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;


    @Before
    public void before(){
        radio = new Radio("A", "B");
    }

    @Test
    public void canSwitchOn(){
        assertEquals("Heating up valves", radio.switchOn());
    }

    @Test
    public void canSwitchOff(){
        assertEquals("Fades out", radio.switchOff());
    }

    @Test
    public void canTune(){
        assertEquals("Radio3", radio.tune("Radio3"));
    }



}
