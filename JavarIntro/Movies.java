public class Movies {
  public static void main(String[] args) {
    String[] movies = {"Star Wars", "Blade Runner", "Sabrina"};
    String[][] actors = new String[][] {
      {"Mark Hamill", "Carrie Fisher", "Peter Cushing"},
      {"Rutger Hauer", "Sean Young", "Edward James Olmos"},
      {"Julia Ormond", "Greg Kinnear", "Nancy Marchand"},
    } ;

    for (int i = 0; i < movies.length; i++) {
      System.out.println("Dans le film " + movies[i] + ", les principaux acteurs sont : ");

      for (int j = 0; j < actors[i].length; j++) {

        if (j < actors[i].length) {
          System.out.print(actors[i][j] + ", ");
        } else {
          System.out.print(actors[i][j]);
        }
      }
      
      System.out.println();
    }
  }
  
}
