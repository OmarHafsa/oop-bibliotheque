
public class livre extends Document {
    private String editeur;
    private String auteur ;
    public livre(){

    }
    public livre(String titre, String editeur, String auteur){
        super(titre);
        this.editeur= editeur;
        this.auteur =auteur;
    }
    public void affiche(){
        super.affiche();
        System.out.println("editeur: "+editeur);
        System.out.println("auteur:"+auteur);
    }
}
