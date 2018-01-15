import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Radio radio;
    CDPlayer cd;
    Stereo stereo;


    @Before
    public void before(){
        radio = new Radio("a", "b");
        cd = new CDPlayer("c", "d");
        stereo = new Stereo(radio, cd);
    }

    @Test
    public void canTurnOnComponent(){
        assertEquals("Heating up valves", stereo.switchOn(radio));
    }

    @Test
    public void canTurnOffComponent(){
        assertEquals("RedLight", stereo.switchOff(cd));
    }


    @Test
    public void canConnectToComponent(){
        assertEquals("Connected", stereo.connect(cd));
    }

    @Test
    public void canDisconnectFromComponent(){
        assertEquals("Disconnected", stereo.disconnect(cd));
    }



}
