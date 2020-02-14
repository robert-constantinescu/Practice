package DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory;

import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CardType;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CreditCard;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Factories.CreditCardFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card2.getClass());
	}

}
