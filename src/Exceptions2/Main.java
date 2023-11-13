package Exceptions2;
//Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
public class Main {
    public static void main(String[] args) {
        char variable = '3';

        checkCharNum(variable);
    }

    public static void checkCharNum(char variable) {
        try {
            if (Character.isDigit(variable)) {
                System.out.println(variable + " it's a number");
            }
            else{
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(variable + " it's not a number");
        }
    }
}
