package DesignPatternsMyImplementation.Factory3;

public abstract class Product {

    private String elem1;
    private String elem2;
    private String elem3;

    public Product() {
        this.createProduct();
    }

    public abstract void createProduct();


    public String getElem1() {
        return elem1;
    }

    public void setElem1(String elem1) {
        this.elem1 = elem1;
    }

    public String getElem2() {
        return elem2;
    }

    public void setElem2(String elem2) {
        this.elem2 = elem2;
    }

    public String getElem3() {
        return elem3;
    }

    public void setElem3(String elem3) {
        this.elem3 = elem3;
    }
}
