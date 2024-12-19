package Atelier;
// Premier kata en java la team : l'idée va être d'écrire un algorithme pour trouver le plus grand nombre dans un tableau.
// Exemple de données en entrée : int[] tableau = {10, 5, 20, 15, 8};
// Tu peux soit décrire ta logique dans la méthode main, soit créer une nouvelle méthode dans ta classe et l'appeler au sein de ta méthode main.
// :warning: l'utilisation des imports n'est pas autorisée

public class BigNumber {
  int[] tableau = {10, 5, 20, 15, 8};
    public static void main(String[] args) {
      BigNumber bigNumber = new BigNumber();
      int result = bigNumber.getGreatestNumber(bigNumber.tableau);

      System.out.println("The greatest number is : " + result);
  }
  public int getGreatestNumber(int[] arr) {
    int max = arr[0];
    for(int i = 1; i < arr.length; i++) {
      int currVal = arr[i];
      if(currVal > max) {
        max = currVal;
      }
    }
    return max;
  }
  
}
