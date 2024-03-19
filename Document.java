public class Document {
  private String titre;
  private static int nbr=0;
  public Document(){
   nbr++;
  }
  public Document (String titre){
    this.titre=titre;
    nbr++;
  }
  public void affiche() {
    System.out.println("Titre du document : " + titre);
    }
}