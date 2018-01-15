public class CDPlayer extends Component implements IConnect {


    public CDPlayer(String make, String model) {
        super(make, model);
    }

    public String switchOn() {
        return "GreenLight";
    }


    public String switchOff() {
        return "RedLight";
    }

    public String play(String album) {
        return "Playing " + album;
    }

    public String connect() {
        return "Connected";
    }

    public String disconnect() {
        return "Disconnected";
    }
}
