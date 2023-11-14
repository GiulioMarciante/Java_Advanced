package Exceptions4;
//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0
// e gestisca sia l'eccezione della divisione che quella di indice non presente nell'array,
// leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.
public class Main {
    public static void main(String[] args) {

        int[] arrayNum;

        arrayNum = new int[]{1, 2, 3, 4, 5};

        int i = 9;
        division(arrayNum,i);
    }
    public static void division(int[] array, int i){
        try {
            if (i > array[5]) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                throw new ArithmeticException();
            }
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Error " + e);
        }
    }
}
