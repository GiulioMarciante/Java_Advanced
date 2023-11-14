package Null1;
//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
public class Main {
    public static void main(String[] args) {

        Double numerator  = 5.0;

        Double denominator = null;

        try {
            if(numerator != null ){
                System.out.println("Numerator: " + numerator);
            }else {
                throw new Exception();
            }
        }
        catch (Exception e){
            System.out.println("Numerator: " + e.getMessage());
        }
        try {
            if (denominator == null ) {
                System.out.println("Denominator: " + denominator);
            } else {
                throw new Exception();
            }
        }
        catch (Exception e){
                System.out.println("Denominator: " + e.getMessage());
        }
    }
}

