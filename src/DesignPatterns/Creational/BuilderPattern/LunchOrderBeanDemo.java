package DesignPatterns.Creational.BuilderPattern;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();


        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondimeents("Lettuce");
        lunchOrderBean.setDressing("Mustards");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondimeents());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());

    }
}
