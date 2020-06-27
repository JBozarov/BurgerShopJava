package com.company;

public class Meal {
    // fields
    private String name;
    private PlainBurger burger;
    private Drink drink;
    private Side side;
    private double price;

    // Meal cunstructor
    public Meal(String name, PlainBurger burger, Drink drink, Side side) {
        this.name = name;
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    // get meal price
    public double getPrice() {
        System.out.println(this.price);
        this.price += this.burger.getPrice() + drink.getDrinkPrice()+side.getSidePrice();
        return this.price;
    }

    // get Meal Info
    public void getMealInfo() {
        System.out.println("Your meal details " + this.name + " and it includes " + this.burger.getName() +" and drink is " + this.drink.getDrinkName() + " and your meal side is " +this.side.getSideName()+ " and your meal total price is " + this.getPrice());
    }

}
