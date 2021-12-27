package com.revature;

public class FactoryPatternDemo {
	  public static Dessert getDessert(String dessertType) {
          switch(dessertType) {
              case "cake":
                  return new Cake();
              case "sandwich":
                  return new Sandwich();
              case "ice cream":
                  return new IceCream();
              default:
                  throw new DessertNotfoundException(dessertType + " not found!");
          }
      }
}
