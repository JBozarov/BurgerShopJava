package com.company;

public class Main {

    public static void main(String[] args) {

        //  Bread types
        Bread ciabatta = new Bread("Ciabatta Roll", 2.99);
        Bread kaiser = new Bread("Kaiser Roll", 3.99);
        Bread potato = new Bread("Potato Roll", 4.99);
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
        healthyBurger.generateToppinsPrice(healthyBurger.getToppings());
    }
}
