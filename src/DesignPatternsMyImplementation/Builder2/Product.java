package DesignPatternsMyImplementation.Builder2;

public class Product {


    public static class Builder {

        private String elem1;
        private String elem2;
        private String elem3;
        private String elem4;


        public Builder() {

        }

        public Product buildProduct(){
            return new Product(this);
        }

        public Builder setElem1(String elem1) {
            this.elem1 = elem1;
            return this;
        }

        public Builder setElem2(String elem2){
            this.elem2 = elem2;
            return this;
        }

        public Builder setElem3(String elem3){
            this.elem3 = elem3;
            return this;
        }

        public Builder setElem4(String elem4){
            this.elem4 = elem4;
            return this;
        }

    }




    private final String elem1;
    private final String elem2;
    private final String elem3;
    private final String elem4;



    private Product(Builder builder) {
        this.elem1 = builder.elem1;
        this.elem2 = builder.elem2;
        this.elem3 = builder.elem3;
        this.elem4 = builder.elem4;
    }

    public String getElem1() {
        return elem1;
    }

    public String getElem2() {
        return elem2;
    }

    public String getElem3() {
        return elem3;
    }

    public String getElem4() {
        return elem4;
    }
}
