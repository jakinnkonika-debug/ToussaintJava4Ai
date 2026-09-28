class Parola {
    String testo;
    int contatore = 1;
    Parola next;
// costruttore come prima
    public Parola(String testo,int contatore) {
        this.testo = testo;
        this.contatore = contatore;
        this.next = null;
    }

    public Parola(String testo) {
        this.testo = testo;
    }

    public String toString () {
        if (next!=null)
        return testo+ ": "+contatore+ "," +next.toString();
    else
        return testo+ ": "+contatore+".";
    }
}