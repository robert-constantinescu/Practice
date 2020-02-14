package DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Factories;

import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.Amex.AmexGoldCreditCard;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.Amex.AmexPlatinumCreditCard;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CardType;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CreditCard;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Validators.AmexGoldValidator;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Validators.AmexPlatinumValidator;
import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Validators.Validator;

public class  AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch(cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
			case PLATINUM:
				return new AmexPlatinumCreditCard();
			default:
				break;
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch(cardType) {
			case GOLD:
				return new AmexGoldValidator();
			case PLATINUM:
				return new AmexPlatinumValidator();
		}
		return null;
	}
}
