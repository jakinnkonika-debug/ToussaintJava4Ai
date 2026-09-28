public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        Parola a = new Parola("A");
        Parola b = new Parola("B");
        Parola c = new Parola("C");

        l.aggiungi(a);
        l.aggiungi(b);
        l.aggiungi(c);
        System.out.println(l);
    }
}
