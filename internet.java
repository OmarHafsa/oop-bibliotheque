public class internet extends Document {
    private String URL;
    public internet (){

    }
    public internet (String titre,String URL){
        super(titre);
        this.URL=URL;
    }
    public void affiche(){
        super.affiche();
        System.out.println("url:"+URL);
    }
}
