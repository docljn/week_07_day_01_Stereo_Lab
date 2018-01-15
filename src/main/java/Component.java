public abstract class Component {


    String make;
    String model;
    String status;

    public Component(String make, String model){
        this.make = make;
        this.model = model;
    }



    public abstract String switchOn();

    public abstract String switchOff();

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }
}
