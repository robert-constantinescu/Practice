package DesignPatternsMyImplementation.Builder.CarBuilder;

public class CarOrder {

    private String engine;
    private int power;
    private boolean electric;
    private boolean hasAutopilot;

    public CarOrder(String engine) {
        this.engine = engine;
    }

    public CarOrder(String engine, int power) {
        this(engine);
        this.power = power;
    }

    public CarOrder(String engine, int power, boolean electric) {
        this(engine, power);
        this.electric = electric;
    }

    public CarOrder(String engine, int power, boolean electric, boolean hasAutopilot) {
        this(engine, power, electric);
        this.hasAutopilot = hasAutopilot;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public boolean isHasAutopilot() {
        return hasAutopilot;
    }

    public void setHasAutopilot(boolean hasAutopilot) {
        this.hasAutopilot = hasAutopilot;
    }
}
