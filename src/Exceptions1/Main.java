package Exceptions1;
//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione
public class Main {
    public static void main(String[] args) {

        int variable = 50;

        System.out.println(checkNum(variable));

    }
    //da errore se i numeri sono in range tra 1 e 50
    public static boolean checkNum(int number){

        boolean result = true;

        try {
            if(number <= 0 || number > 50){
                throw new ArithmeticException();
            }
        }
        catch(Exception e){
            System.out.println("Errore: " + e);
            result = false;
        }
        return result;
    }
}
