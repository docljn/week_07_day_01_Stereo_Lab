public class Stereo {

    private CDPlayer cd;
    private Radio radio;

    public Stereo(Radio radio, CDPlayer cd){
        this.radio = radio;
        this.cd = cd;
    }


    public String switchOn(Component component) {
        return component.switchOn();
    }

    public String switchOff(Component component) {
        return component.switchOff();
    }
}
