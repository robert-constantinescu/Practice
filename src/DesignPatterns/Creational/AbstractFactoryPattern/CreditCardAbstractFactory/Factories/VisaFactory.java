package DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Factories;

import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CardType;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.Visa.VisaBlackCreditCard;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.Visa.VisaGoldCreditCard;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CreditCard;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Validators.Validator;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Validators.VisaValidator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new VisaGoldCreditCard();
			case PLATINUM:
				return new VisaBlackCreditCard();
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
