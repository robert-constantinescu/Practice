package DesignPatternsMyImplementation.Factory3;

public class Product1 extends Product {

    @Override
    public void createProduct() {
        this.setElem1("prod 1, Elem 1");
        this.setElem2("prod 1, Elem 2");
        this.setElem3("prod 1, Elem 3");
    }
}
