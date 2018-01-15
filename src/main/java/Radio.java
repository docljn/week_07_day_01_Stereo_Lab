public class Radio extends Component implements IConnect {
    public Radio(String make, String model) {
        super(make, model);
    }

    public String switchOn() {
        return "Heating up valves";
    }

    public String switchOff() {
        return "Fades out";
    }

    public String tune(String station) {
        return station;
    }

    public String connect() {
        return "Crackle";
    }

    public String disconnect() {
        return "Pop";
    }
}
