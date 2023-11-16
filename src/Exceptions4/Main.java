package Exceptions4;
//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0
// e gestisca sia l'eccezione della divisione che quella di indice non presente nell'array,
// leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.
public class Main {
    public static void main(String[] args) {

        int[] arrayNum;

        arrayNum = new int[]{1, 2, 3, 4, 5};

        int i = 4;

        arrayDivision(arrayNum,i);

    }
    public static void arrayDivision(int[] arrayNum, int index){

        try {
            int result = arrayNum[index]/0;

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Index not present in the array. " + e.getMessage());

        }
    }
}
