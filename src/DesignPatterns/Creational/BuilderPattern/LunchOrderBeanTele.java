package DesignPatterns.Creational.BuilderPattern;

public class LunchOrderBeanTele {

    //Lunch order bean with telescoping constructors

    private String bread;
    private String condimeents;
    private String dressing;
    private String meat;

    public LunchOrderBeanTele(String bread) {
        this.bread = bread;
    }

    public LunchOrderBeanTele(String bread, String condimeents) {
        this(bread);
        this.condimeents = condimeents;
    }

    public LunchOrderBeanTele(String bread, String condimeents, String dressing) {
        this.bread = bread;
        this.condimeents = condimeents;
        this.dressing = dressing;
    }

    public LunchOrderBeanTele(String bread, String condimeents, String dressing, String meat) {
        this(bread, condimeents, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondimeents() {
        return condimeents;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
