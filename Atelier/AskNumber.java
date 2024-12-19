package Atelier;

import java.util.Scanner;

public class AskNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ecrire 3 nombres : ");

    String ligne = scanner.nextLine();

    String[] parts = ligne.split(" ");

    float nombre1 = Float.parseFloat(parts[0]);
    float nombre2 = Float.parseFloat(parts[1]);
    float nombre3 = Float.parseFloat(parts[2]);

    float moyenne = (nombre1 + nombre2 + nombre3) / 3;
    System.out.println("La moyenne des trois nombres est : " + String.format("%.2f", moyenne));

    scanner.close();

  }

  
}
