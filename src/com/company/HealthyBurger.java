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
    public ArrayList<Topping> getToppings() {
        return super.getToppings();
    }

    @Override
    public void addTopping(Topping topping) {
        this.toppings.add(topping);
        System.out.println("You added " + topping.getName() + " to your " + getName() + " burger and your price is increased by " + topping.getPrice());
    }

    @Override
    public double generateToppinsPrice(ArrayList<Topping> toppings) {
        return super.generateToppinsPrice(this.toppings);
    }

    @Override
    public void getBurgerInfo() {
        super.getBurgerInfo();
    }
}
