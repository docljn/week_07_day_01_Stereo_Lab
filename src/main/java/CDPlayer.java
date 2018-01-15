public class CDPlayer extends Component {


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
}
