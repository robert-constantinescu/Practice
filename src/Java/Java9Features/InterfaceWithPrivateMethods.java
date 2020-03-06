package Java.Java9Features;


public interface InterfaceWithPrivateMethods {
// =================   Before
    double getPriceBefore();

    default double getPriceWithTaxBefore() {
        return getPriceBefore() * 1.21;
    }

    default double getOfferPriceBefore(double discount) {
        return getPriceBefore() * 1.21 * discount;
    }


// =================  After

    double getPriceAfter();

    default double getPriceWithTaxAfter() {
        return getTaxedPriceInternal() * 1.21;
    }

    default double getOfferPriceAfter(double discount) {
        return getTaxedPriceInternal() * 1.21 * discount;
    }

    // private methods can be used within the body of default methods
    private double getTaxedPriceInternal() {
        return getPriceAfter() * 1.21;
    }


}
