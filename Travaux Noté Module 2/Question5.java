public class Question5 {

    static boolean a = false;
    static boolean b = false;

    static int entier = (!a && (b | !a)) ? 10 : 20;

    public static void main(String args[]) {

        System.out.println(entier);

    }
}
