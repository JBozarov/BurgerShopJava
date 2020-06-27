package com.company;

import java.util.ArrayList;

public class DeluxeBurger extends PlainBurger{

    public DeluxeBurger(String name, Bread bread, Meat meat) {
        super(name, bread, meat);
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

    // no limit on adding toppings
    @Override
    public void addTopping(Topping topping) {
        this.toppings.add(topping);
        System.out.println("You added " + topping.getName() + " to your " + getName() + " burger and your price is increased by " + topping.getPrice());
    }

    @Override
    public double generateToppinsPrice(ArrayList<Topping> toppings) {
        return super.generateToppinsPrice(toppings);
    }

    @Override
    public double getBurgerInfo() {
        super.getBurgerInfo();
        return this.getPrice();
    }
}
