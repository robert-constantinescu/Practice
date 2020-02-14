package DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Factories;

import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CardType;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CreditCard;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Validators.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {

		if(creditScore > 650 ) {
			return new AmexFactory();
		}
		else {
			return  new VisaFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType cardType);

	public abstract Validator getValidator(CardType cardType);

}
