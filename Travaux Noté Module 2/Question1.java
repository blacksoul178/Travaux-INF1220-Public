public class Question1 {

    public static void main(String args[]) {

        Cercle c = new Cercle(1);
        System.out.println("L\'aire est de: " + c.aire()); // Pour une meilleur lisibilité j'ai ajouter un descriptif
        System.out.println("Le périmètre est de: " + c.perimetre());

    }
}

class Cercle {

    private int rayon = 0; // definition de la variable du rayon, qui sera utilisée par nos fonction à
                           // venir

    public Cercle(int x) { // Constructeur

        rayon = x;

    }

    public double aire() { // La formule Math.pow et Math.PI exige d'utiliser un type double.

        return Math.PI * Math.pow(rayon, 2); // formule java qui représente PI * r²

    }

    public double perimetre() {

        return 2 * Math.PI * rayon; // formule java qui représente 2 * PI * r

    }
}