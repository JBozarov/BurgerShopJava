package com.company;

import java.util.ArrayList;

public class HealthyBurger extends PlainBurger{
    private ArrayList<Topping> toppings;

    //constructor
    public HealthyBurger(String name, Bread bread, Meat meat) {
        super(name, bread, meat);
        this.toppings = new ArrayList<Topping>();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public ArrayList<Topping> getToppings() {
        return super.getToppings();
    }

    // can add upto 4 toppings only
    @Override
    public void addTopping(Topping topping) {
        if ( this.toppings.size() >= 4) {
            System.out.println("Cannot add more than 2 toppings to your "+this.getName());
        }
        else {
            this.toppings.add(topping);
            System.out.println("You added " + topping.getName() + " to your " + getName() + " burger and your price is increased by " + topping.getPrice());
        }
    }

    @Override
    public double generateToppinsPrice(ArrayList<Topping> toppings) {
        return super.generateToppinsPrice(this.toppings);
    }

    @Override
    public double getBurgerInfo() {
        super.getBurgerInfo();
        return this.getPrice();
    }
}
