package DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.Validators;

import DesignPatterns.Creational.AbstractFactoryPattern.CreditCardAbstractFactory.CardTypes.CreditCard;

public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
