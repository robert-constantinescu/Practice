package DesignPatternsMyImplementation.Factory3;

public class Factory  {


    public static Product getProduct(int n) {
        Product prod = null;
        if(n == 1) {
            prod =new Product1();
            return prod;
        }
        else if (n==2) {
            prod = new Product2();
            return prod;
        }
        return prod;
    }
}
