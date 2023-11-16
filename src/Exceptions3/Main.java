package Exceptions3;
//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
public class Main {
    public static void main(String[] args) {

        int numerator = 6;

        int denominator = 0;

        try {
            int division = numerator/denominator;
        }
        catch (ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}