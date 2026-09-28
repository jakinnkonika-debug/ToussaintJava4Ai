class Lista {
    Parola inizio = null;
    void aggiungi(Parola nuova) { //aggiungi in cima
        if(inizio == null) 
            inizio = nuova;
         else {
            nuova.next = inizio;
            inizio = nuova;
            }
        }
        public String toString() {
            if(inizio != null)
                return "Ecco la lista:"+inizio.toString();
            else
                return "Lista vuota";
        }


    }
