package DesignPatterns.Creational.FactoryPattern.Website;

import DesignPatterns.Creational.FactoryPattern.Website.WebPages.AboutPage;
import DesignPatterns.Creational.FactoryPattern.Website.WebPages.CommentPage;
import DesignPatterns.Creational.FactoryPattern.Website.WebPages.ContactPage;
import DesignPatterns.Creational.FactoryPattern.Website.WebPages.PostPage;

public class Blog extends Website {


    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }


}
