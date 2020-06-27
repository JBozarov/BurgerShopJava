package com.company;

import java.util.ArrayList;

public class PlainBurger {
    private String name;
    private double price;

    private Bread bread;
    private Meat meat;
    ArrayList<Topping> toppings;

    // constructor
    public PlainBurger(String name, Bread bread, Meat meat) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.toppings = new ArrayList<Topping>();
    }

    // getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    // add topping method allows to add max 2 topping
    public void addTopping (Topping topping) {
        if ( toppings.size()>=2) {
            System.out.println("Cannot add more than 2 toppings to your "+this.name);
        }
        else {
            this.toppings.add(topping);
            System.out.println("You added " + topping.getName() + " to your " + getName() + " burger and your price is increased by " + topping.getPrice());
        }
    }

    // generating toppings price
    public double generateToppinsPrice(ArrayList<Topping> toppings) {
        double totalPrice = 0;
        for ( int i = 0; i<toppings.size(); i++ ) {
            totalPrice += toppings.get(i).getPrice();
        }
        return totalPrice;
    }

    // getting burger info
    public double getBurgerInfo() {
        this.price  = this.bread.getPrice() + this.meat.getPrice() + generateToppinsPrice(this.toppings);
        System.out.println("Your burger is " + this.name + " and its price is " + this.price);
        return this.price;
    }
}



















