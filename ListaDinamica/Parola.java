class Parola {
    String testo;
    int contatore;
    Parola next;
// costruttore come prima
// incrementa come prima
    public String toString () {
        if (next!=null)
        return testo+ ": "+contatore+ "," +next.toString();
    else
        return testo+ ": "+contatore+".";
    }
}