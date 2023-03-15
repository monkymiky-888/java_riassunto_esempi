/**commento descrizione classe omettendo i dettagli implementativi
 * Classe POO descrive una classe introducendo concetti propri della POO
 */
class POO{
    public int variabilePubblica; // errore! sempre meglio rendere le variabili di istanza private e definire getter e setter
    private int variabilePrivata;
    /**ogni metodo pubblico dovrebbe avere un commento che ne descrive il modo per utilizzarlo. */
    // commento contenente dettagli implementativi
    public int getVarPrivata(){return variabilePrivata}; // ritorna una copia della variabile non il riferimento
    /**Precondizione: x è maggiore di 0.
     * Postcondizione: setta variabilePrivata = x e non restituisce nulla.   
     */
    public void setVarPrivata(int x){ if (x>0) variabilePrivata = x;}   // possibile inserire controlli sulla modifica ed evitare errori dovuti ad una modifica non voluta
                                                                        // può essere richiamato in un altro oggetto (e nel main) tramite oggetto.setVarPrivata();

    private void metodoPrivato(){variabilePrivata = variabilePubblica;} /* funzione usata solo all'interno dell'oggetto. 
                                                                        POO oggetto = new POO();
                                                                        oggetto.metodoPrivato(); --> da un errore di compilazione! inaccessibile!*/
    //--------------------------------- costruttori ---------------------------------------------------------------
    public POO(){}; // costruttore di default
    public POO(int variabilePrivata, int variabilePubblica){ // posso usare lo stesso nome delle variabili di istanza grazie a "this"
        this.variabilePrivata= variabilePrivata; 
        this.variabilePubblica= variabilePubblica;
    }
    //---------------------------------------------------------------------------------------------------------------

}