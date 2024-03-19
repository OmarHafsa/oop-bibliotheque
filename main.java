public class main{
    public static void main(String[] args) {
   
        Bibliotheque bibliothèque = new Bibliotheque(2);

        // Création de quelques documents
        livre livre1 = new livre("omar hafsa", "omar", "hafsa");
        internet internet1 = new internet("github", "https://github.com/OmarHafsa");
        bibliothèque.ajoute(livre1);
        bibliothèque.ajoute(internet1);

    
        bibliothèque.listing();
    }
}

