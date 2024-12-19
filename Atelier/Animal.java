package Atelier;

public class Animal {
  private String name;
  private int height;
  private boolean carnivorous;
  private int numberOfLegs;

  public Animal(String name, int height, boolean carnivorous, int numberOfLegs) {
    this.name = name;
    this.height = height;
    this.carnivorous = carnivorous;
    this.numberOfLegs = numberOfLegs;
  }

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public int getHeight() {

    return this.height;
  }

  public void setHeight(int height) {

    this.height = height;
  }

  private boolean isCarnivorous() {

    return this.carnivorous;
  }

  public void setCarnivorous(boolean carnivorous) {
    this.carnivorous = carnivorous;
  }

  public int getNumberOfLegs() {

    return this.numberOfLegs;
  }

  public void setNumberOfLegs(int numberOfLegs) {

    this.numberOfLegs = numberOfLegs;
  }

  public String introduce() {
    String carnivoreStatus = isCarnivorous() ? "je suis carnivore" : "je ne suis pas carnivore";

    return "Hey, en tant que " + getName() + ", j'ai " + getNumberOfLegs() + " pattes et " + carnivoreStatus;
  }

  public boolean isDangerous() {
    return this.getHeight() > 50 && this.isCarnivorous();
  }
}