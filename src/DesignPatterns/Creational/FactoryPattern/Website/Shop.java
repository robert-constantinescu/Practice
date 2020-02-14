package DesignPatterns.Creational.FactoryPattern.Website;

import DesignPatterns.Creational.FactoryPattern.Website.WebPages.CartPage;
import DesignPatterns.Creational.FactoryPattern.Website.WebPages.ItemPage;
import DesignPatterns.Creational.FactoryPattern.Website.WebPages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());

    }
}
