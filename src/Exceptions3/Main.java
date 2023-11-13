package Exceptions3;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        try {
            divisionFunction(number);
        }
        catch (ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    public static int divisionFunction(int number){

        int result = number/0;

        return result;
    }
}