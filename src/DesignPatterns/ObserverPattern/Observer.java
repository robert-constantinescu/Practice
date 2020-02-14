package DesignPatterns.ObserverPattern;


/*
        SUBJECT     ---------------------------------------> <interface> Observer {+update():void}
        {                                                         /|\
            +register(Observer o):void                           / | \
            +unregister(Observer o): void                       /  |  \
            +notifyObserver():void                             /   |   \
        }                                                     /    |    \
                                                             /     |     \
                                                            /      |      \
                                                           /       |       \
                                                      IBMPrice     |    AAPLPrice
                                                  {+update():void} |  {+update():void}
                                                                   |
                                                                   |
                                                                   |
 */

public interface Observer {

    public void update(double ibmPrice, double aaplPrice, double googPrice);


}
