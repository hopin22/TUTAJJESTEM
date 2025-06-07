
public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj świecie!");
        
        // Przykład 1: Kalkulator
        calculator();
        
        // Przykład 2: Pętla z liczbami
        printNumbers();
        
        // Przykład 3: Sprawdzanie liczby parzystej/nieparzystej
        checkEvenOdd(7);
        checkEvenOdd(10);
    }
    
    // Prosty kalkulator
    public static void calculator() {
        System.out.println("\n=== KALKULATOR ===");
        int a = 15;
        int b = 7;
        
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
    }
    
    // Wyświetlanie liczb od 1 do 10
    public static void printNumbers() {
        System.out.println("\n=== LICZBY OD 1 DO 10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // Sprawdzanie czy liczba jest parzysta czy nieparzysta
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " jest liczbą parzystą");
        } else {
            System.out.println(number + " jest liczbą nieparzystą");
        }
    }
}
