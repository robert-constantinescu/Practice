package DesignPatternsMyImplementation.Builder.CarBuilder;

public class CarBuilder {

    public static class Builder {

        private String engine;
        private int power;
        private boolean electric;
        private boolean hasAutopilot;

        public Builder(){

        }
        public CarBuilder build() {
            return new CarBuilder(this);
        }
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }
        public Builder power(int power){
            this.power = power;
            return this;
        }
        public Builder electric(boolean electric){
            this.electric = electric;
            return this;
        }
        public Builder hasAutoPilot(boolean hasAutopilot) {
            this.hasAutopilot = hasAutopilot;
            return this;
        }
    }


    private CarBuilder(Builder builder) {
        this.engine = builder.engine;
        this.power = builder.power;
        this.electric = builder.electric;
        this.hasAutopilot = builder.hasAutopilot;


    }

    private final String engine;
    private final int power;
    private final boolean electric;
    private final boolean hasAutopilot;

    public String getEngine() {
        return engine;
    }

    public int getPower() {
        return power;
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isHasAutopilot() {
        return hasAutopilot;
    }

}
