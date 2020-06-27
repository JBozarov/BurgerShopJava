package com.company;

import java.util.ArrayList;
import java.util.Map;

public class Order {
    private String name;
    private double price;
    private PlainBurger burger;
    private Bread bread;
    private Meat meat;
    private Map<String, Double> toppings;
    private Map<String, Double> allSides;
    private ArrayList<Side> sides;

    private Meal meal;


    // 1st constructor
    public Order(String name, PlainBurger burger, Bread bread, Meat meat) {
        this.name = name;
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;
        this.toppings = Map.of("Tomato", 1.99, "Avacado", 0.99, "Bacon", 2.99, "Ketchup", 0.27, "Egg", 1.50, "Lettuce", 0.99);
        this.allSides = Map.of("Fries", 1.99, "Chips", 2.50, "Apple Pie", 3.50, "Ice Cream", 3.99, "Tater tots", 3.50, "Dessert", 4.99);
        this.sides = new ArrayList<Side>();
    }

    // 2nd constructor
    public Order(Meal meal) {
        this.meal = meal;
    }

    public ArrayList<Side> getSides() {
        return sides;
    }

    // get order info and price
    public void getOrderInfo() {
        double orderBasePrice = burger.getBurgerInfo()+bread.getPrice()+meat.getPrice();
        double sidesPrice = generateSidesPrice(this.sides);
        if ( sides.size()>0 ) {
            System.out.println("Your order is " + this.burger.getName() + " for " + burger.getBurgerInfo() + " and it includes " + bread.getName() + " for " + bread.getPrice() + " and " + meat.getName() + " for " + meat.getPrice() + " and " + getSides().size() + " sides for " + sidesPrice + " and  your total is " + (orderBasePrice+sidesPrice) );
        } else if (sides.size()<1){
            System.out.println("Your order is " + this.burger.getName() + " for " + burger.getBurgerInfo() + " and it includes " + bread.getName() + " for " + bread.getPrice() + " and " + meat.getName() + " for " + meat.getPrice() + ", and 0 sides and  your total is " + (orderBasePrice+sidesPrice) );
        }
    }

    // generate the price for sides
    public double generateSidesPrice(ArrayList<Side> sides) {
        double totalPrice = 0;
        if (sides.size()>0) {
            for ( int i = 0; i<sides.size(); i++ ) {
                totalPrice += sides.get(i).getSidePrice();
            }
        }
        return totalPrice;
    }

    // add topping method is separate from PlainBurger's addTopping method
    public boolean addTopping(int numberOfToppings) {
        int i = 0;
        for ( String key : toppings.keySet()) {
            if ( i<numberOfToppings ) {
                Topping tempTopping = new Topping(key, toppings.get(key));
                burger.addTopping(tempTopping);
                burger.getBurgerInfo();
                i++;
            }
        }
        return true;
    }


    // add sides method
    public boolean addSides ( int numberOfSides ) {
        int i = 0;
        for ( String key : allSides.keySet()) {
            if ( i<numberOfSides ) {
                i++;
                Side tempSide = new Side(key, allSides.get(key));
                sides.add(tempSide);
                System.out.println(tempSide.getSideName() + " has been added to your order and side price is " + tempSide.getSidePrice());
            }
        }
        return true;
    }


}
