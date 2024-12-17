package Atelier;

import java.util.ArrayList;

public class Recipe {
  public static void main(String[] args) {
    byte quantity = 125;
    byte cookingTime = 60;
    short temperature = 180;

    ArrayList<String> ingredients = new ArrayList<>();
    ingredients.add("farine");
    ingredients.add("sucre");
    ingredients.add("beurre");
    ingredients.add("oeufs");

    for (String i : ingredients) {
      System.out.println("- " + quantity + "g de " + i);
    }
    System.out.println("Place ton plat au four pendant " + cookingTime + " minutes à " + temperature + " degrés");
  }
  
}
