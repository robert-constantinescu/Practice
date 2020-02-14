package DesignPatterns.Creational.BuilderPattern;

public class LunchOrderBean {

    private String bread;
    private String condimeents;
    private String dressing;
    private String meat;

    public LunchOrderBean() {

    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondimeents() {
        return condimeents;
    }

    public void setCondimeents(String condimeents) {
        this.condimeents = condimeents;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
