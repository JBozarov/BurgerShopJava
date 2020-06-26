package com.company;

public class Main {

    public static void main(String[] args) {

        //  Bread types
        Bread ciabatta = new Bread("Ciabatta Roll", 2.99);
        Bread kaiser = new Bread("Kaiser Roll", 3.99);
        Bread georgian = new Bread("Potato Roll", 4.99);
        Bread italian = new Bread("Italian Roll", 5.99);


        // Meat types
        Meat brisket = new Meat("Brisket", 2);
        Meat dryAged = new Meat("Dry Aged", 3);
        Meat grass = new Meat("Grass", 4);
        Meat wagyu = new Meat("Wagyu", 5);


        // Toppings
        Topping avacado = new Topping("Avacado", 5.35);
        Topping lettuce = new Topping("Lettuce", 1.26);
        Topping bacon = new Topping("Bacon", 2.15);
        Topping egg = new Topping("Fried egg", 2.36);
        Topping mayo = new Topping("Moyoneese", 0.35);


        // Plain burger
        PlainBurger plainBurger = new PlainBurger("Plain Burger", ciabatta, brisket);
        plainBurger.addTopping(avacado);
        plainBurger.addTopping(lettuce);
        plainBurger.getBurgerInfo();
        plainBurger.addTopping(egg);
        plainBurger.getBurgerInfo();
        plainBurger.addTopping(mayo);


        // Healthy burger
        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger ", kaiser, dryAged);
        healthyBurger.getBurgerInfo();
        healthyBurger.addTopping(avacado);
        healthyBurger.addTopping(lettuce);
        healthyBurger.addTopping(bacon);
        healthyBurger.addTopping(egg);
        healthyBurger.addTopping(mayo);
        healthyBurger.getBurgerInfo();


        // Deluxe burger
        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger", georgian, grass);
        deluxeBurger.getBurgerInfo();
        deluxeBurger.addTopping(avacado);
        deluxeBurger.addTopping(lettuce);
        deluxeBurger.addTopping(bacon);
        deluxeBurger.addTopping(egg);
        deluxeBurger.addTopping(mayo);
        deluxeBurger.getBurgerInfo();


        // Exercise 2
        // Drink class instances
        Drink water = new Drink("Water", 0.00);
        Drink gatorade = new Drink("Gatorade", 0.60);
        Drink cocacola = new Drink("CocaCola", 1.26);
        Drink fanta = new Drink("Fanta", 1.50);
        Drink moundew = new Drink("Mountain Dew", 1.99);

        // Sides
        Side fries = new Side("French Fries", 1.99);
        Side chips = new Side("Chips", 2.50);
        Side applepie = new Side("Apple Pie", 3.50);
        Side icecream = new Side("Ice Cream", 5);

        // Meal, basic meal
        Meal defaultMeal = new Meal("Basic Meal", plainBurger, water, fries);
        defaultMeal.getMealInfo();

        // Meal with healthy burger and cocacola and applepie
        Meal healthyMeal = new Meal("Healthy Meal", healthyBurger, cocacola, applepie);
        healthyMeal.getMealInfo();

        // Deluxe meal includes Deluxe burger, moundew and icecream
        Meal deluxeMeal = new Meal("Deluxe Meal", deluxeBurger, moundew, icecream);
        deluxeMeal.getMealInfo();
    }
}
