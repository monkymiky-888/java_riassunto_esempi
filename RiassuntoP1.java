// ogni file deve essere nominato come l'unica classe pubblica che contiene.

/**commento blocco di testo
 * su più righe
 * riconoscibile con il comando javadoc
 */

/*
 * semplice commento su più righe
 */

import java.util.Scanner; // input da tastiera
public class RiassuntoP1 {
// ------------------------------------------ costanti ---------------------------------------------------------------
    public static final float costante = 3.14; //può essere usato come alias per rendere più esplicativo l'utilizzo di numeri "costanti" nelle espressioni. tipo float PI = 3,14 
// -----------------------------------------metodo di classe  e return ----------------------------------------------------------
    public static int metodoDiClasse(int intero1, int intero2){ //metodo di classe (non di istanza) best-practice usare verbi o frasi per i nomi dei metodi
        int ris;
        if(intero1>intero2){
            ris= intero1;
            return intero1;                     // bad practice mettere tanti return sparsi nel blocco di codice
        }
        else{
            ris = intero2;
            return intero2;
        }
        return ris;};                           //best-practice mettere 1 unico return alla fine del blocco
    public static void main(String[] args) { //viene ignorato questo metodo se la classe non viene eseguita come programma
//--------------------------------------------casting --------------------------------------------------------------
        double doubleVar = 9.3;
        int intVar = (int)doubleVar; //casting esplicito  
//------------------------------------------- if-else e string ----------------------------------------------------
        String stringa1 ="CiAo";
        String stringa2 = "ciao";
        if(stringa1 == stringa2){} // per le stringhe == significa che punta alla stessa area di memoria bad-practice!
        else if (stringa1.equals(stringa2)) {}// best-practice , confronta i valori contenuti nelle stringhe
        else if (stringa2.equalsIgnoreCase(stringa1)){} // non case sensitive
// --------------------------------------------- operatore ternario ---------------------------------------------------------------------
        int max = 0;
        max = (intVar > doubleVar) ? intVar : doubleVar ; // operatore ternario che equivale all'if qua sotto.
        if(intVar > doubleVar)
            max = intVar;
        else
            max = doubleVar;
//------------------------------------------------------------- asserzioni -------------------------------------------------------
        assert intVar != 1; /* obsoleto!! si attivano con java -enableassertion nomeProgramma oppure con un impostazione dell IDE.
                                verifica l'espressione booleana, se falsa viene mostara l'asserzione e termina il programma*/
//------------------------------------------------------ switch - case --------------------------------------------------------------
        switch(intVar){ // può confrontare le lable delle Enum
            case 1:
                intVAr++;
                break;
            case 2:
                doubleVar++;
            case 9:
            default:
                println("messaggio d'errore, stampato nel caso si siano dimenticati casi"); // best-bractice mettere sempre il caso default
        }
//------------------------------------------------------- input da tastiera ---------------------------------------------------------
Scanner tastiera = new Scanner(System.in);
int dimensione = tastiera.nextInt();
//------------------------------------------------------- print / println -----------------------------------------------------------
        print(intVar + "  -  "); // stampa senza andare a capo
        println(doublevar); // stampa e poi va a capo
        print("questo è il carattere di escape \\  per scrivere simboli particolari in una stringa.\n\\n per andare a capo \n \\r sposta l'output all'inizio della riga corrente \n \\t tab"); 
//------------------------------------------------------------classe Math --------------------------------------------------------
// è importata di default da Java
        int mAx = Math.max(3,4);
        int min = Math.min(3.0,2.0);
        int valoreAssoluto = Math.abs(intVar);
        int arrotondato = (int)Math.round(doubleVar); // ritorna un lond se l'argomento è double, int se l'arg è float
        int intSopra = Math.ceil(doubleVar);
        int intSotto = Math.floor(doubleVar);
        int potenza = Math.pow(2.0 , 3.0) ; // 2 alla terza --- argomenti double
        int radice = Math.sqrt(4.0); // ritorna 2.0
//---------------------------------------------------------------operatore % resto della divisione-------------------------------------------------------------------- 
        float float1 = 3,14;
        float float2 = 1,0;
        float resto = float1%float2; // == 0,14
        println(resto);
//--------------------------------------------array sono oggetti, = e == seguono le stesse regole che per gli oggetti --------------------------------------------
        dimensione = tastiera.nextInt();
        string[] arrayDiStringhe = new string[dimensione]; // array di stringhe di dimensione scelta dall'utente
        int arrayDiInt[] = new int[100]; // best-practice scegliere un nome al singolare (si accede alla singola variabile)
        // best practice ignorare l'elemento 0 dell'array se le cose che vi inserisco sono numerate nella realtà da a partire da 1 (non 0)
        double[] numero = {3.3 , 2.3 , 4.5 , 9};
        // passando un elemento di un array come parametro per una funzione viene passato il riferiento alla variabile e non fatta una copia.
        //public static int metodo (int[] array){return array[0];};         si può passare l'intero array come parametro anche senza specificarne la lunghezza
        //public static int metodo (int... args){return args[0];};          crea un array di interi lugno quanti sono gli argomenti e lo passa come parametro
        //int ris = metodo(arrayDiInt); // no parentesi quadre 
        int matrice[][] = new int[10][10];

//---------------------------------------------------------- for e for-each -----------------------------------------------------------------------------
        for(int elemento : arrayDiInt) // for-each
            elemento ++;
        for(int i = 0; i<=arrayDiInt.length; i++) // usare il for-each sarebbe un errore perche i è usato nel corpo del ciclo
            arrayDiInt[i] = i * 2;
//----------------------------------------------------------------------------------------------------------------------------------------------------------

}
}
