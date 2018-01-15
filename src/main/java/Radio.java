public class Radio extends Component {
    public Radio(String make, String model) {
        super(make, model);
    }

    public String switchOn() {
        return "Heating up valves";
    }

    @Override
    public String switchOff() {
        return "Fades out";
    }

    public String tune(String station) {
        return station;
    }
}
