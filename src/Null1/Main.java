package Null1;
//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
public class Main {
    public static void main(String[] args) {

        Double numerator  = 42.0;

        Double denominator = 0.0;

        try {
            System.out.println(checkNull(numerator,denominator));
        }
        catch (ArithmeticException e){
            System.out.println("The denominator is 0");
        }
        catch (Exception e){
                System.out.println("One of the number is null");
        }
    }
    public static Double checkNull(Double numerator, Double denominator) throws Exception {
        if (numerator == null || denominator == null) {

            throw new Exception();

        } else if(denominator == 0){

            throw new ArithmeticException();

        } else {
            return numerator/denominator;
        }
    }
}

