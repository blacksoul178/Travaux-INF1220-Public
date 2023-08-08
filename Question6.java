public class Question6 {

    public static void main(String args[]) {
        Bonhomme1 A = new Bonhomme1("Albert"); // Création de 3 bonhommes avec le premier code
        Bonhomme1 B = new Bonhomme1("Bertrand");
        Bonhomme1 C = new Bonhomme1("Charlie");
        Bonhomme2 D = new Bonhomme2("David"); // Création de 3 bonhommes avec le deuxieme code
        Bonhomme2 E = new Bonhomme2("Edouard");
        Bonhomme2 F = new Bonhomme2("Fernand");

        System.out.println("Le nom de notre premier Bonhomme est :" + A.affiche1()); // affichage de la valeur des 3
                                                                                     // premier bonhommes
        System.out.println("Le nom de notre Deuxieme Bonhomme est :" + B.affiche1());
        System.out.println("Le nom de notre troisieme Bonhomme est :" + C.affiche1());

        System.out.println("Le nom de notre quatrieme Bonhomme est :" + D.affiche2()); // Affichage de la valeur des 3
                                                                                       // bonhommes suivant
        System.out.println("Le nom de notre cinquieme Bonhomme est :" + E.affiche2());
        System.out.println("Le nom de notre sixieme Bonhomme est :" + F.affiche2());

    }

}

class Bonhomme1 { // premier Code Bonhomme
    public static String nom1;

    public Bonhomme1(String n) { // constructeur
        nom1 = n;
    }

    public String affiche1() { // Méthode pour retourner la valeur de l'objet créé

        return Bonhomme1.nom1;

    }

}

class Bonhomme2 { // Deuxième Code Bonhomme

    public String nom2;

    public Bonhomme2(String n) { // constructeur
        nom2 = n;
    }

    public String affiche2() { // méthode pour retourner la valeur de l'objet créé

        return nom2;

    }

}