package Exceptions1;
//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione
public class Main {
    public static void main(String[] args) {

        int number = 11;

        System.out.println(checkNum(number));
    }
    public static boolean checkNum(int number) {

        if (number > 10 || number < 0) {
            throw new ArithmeticException();
        } else {
            return true;
        }
    }
}
