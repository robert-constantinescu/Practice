package DesignPatternsMyImplementation.Factory3;

public class Product2 extends Product{

    @Override
    public void createProduct() {
        this.setElem1("Prod 2, Elem 1");
        this.setElem2("Prod 2, Elem 2");
        this.setElem3("Prod 2, Elem 3");
    }
}
