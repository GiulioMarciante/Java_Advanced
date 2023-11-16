package Exceptions2;
//Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
public class Main {
    public static void main(String[] args) {

        System.out.println(checkCharNum('d'));
    }
    public static boolean checkCharNum(char variable) {

        StringBuilder isNumber = new StringBuilder("The character is a number? ");

            if(!Character.isDigit(variable)){
                isNumber.append("false");
                throw new ArithmeticException("" + isNumber);
            }
            else{
                System.out.println(isNumber);
                return true;
            }
    }
}
