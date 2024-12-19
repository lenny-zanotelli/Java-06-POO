package Atelier;

public class Main {
  public static void main(String[] args) {
    Animal lion = new Animal("simba", 120, true, 4);

    Animal perroquet = new Animal("Rio", 30, false, 2);

    System.out.println(lion.introduce());
    System.out.println(lion.isDangerous());
    System.out.println(perroquet.introduce());
    System.out.println(perroquet.isDangerous());
  }
  
}
