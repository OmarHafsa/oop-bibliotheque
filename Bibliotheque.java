public class Bibliotheque {
    private Document[] documents;
    private int tailleMax;
    private static int count=0;
    public Bibliotheque(int tailleMax){
        this.tailleMax = tailleMax;
        this.documents=new Document[tailleMax];
    }
    public void ajoute(Document d){
      if(count<tailleMax){
        documents[count]=d;
        count++;
      }else{
        System.out.println("la bibliotheque est pleine");
      }
    }
    public void listing(){
       int count=0;
        while (count<tailleMax){
           documents[count].affiche();
           count++;
        }
    }
}
