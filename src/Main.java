import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Lepsze przyblizenie niz 3.14 M_PI lub M_E
        int calka;
        char metoda;
        int przedzialy;
        System.out.println("Ktora calke chcesz obliczyc? (Wprowadz 1, 2 lub 3)");
        Scanner ktoraCalka = new Scanner(System.in);
        calka=ktoraCalka.nextInt();
        System.out.println("Wybierz metode, ktora chcesz zastosowac: (Wprowadz T- Trapezow lub S-Simpsona");
        Scanner ktoraMetoda = new Scanner(System.in);
        metoda=ktoraMetoda.next().charAt(0);
        System.out.println("Wprowadz liczbe podprzedzialow (Musi byc wieksza niz 1, jesli wybrales metode Simpsona, musi byc parzysta)");
        Scanner liczbaPrzedzialow = new Scanner(System.in);
        przedzialy=liczbaPrzedzialow.nextInt();
        if(przedzialy<=1)
        {
            throw new Exception ("Nieprawidlowa liczba przedzialow, sprobuj ponownie");
        }
        if(metoda =='S'&& przedzialy%2!=0)
        {
            throw new Exception("Wprowadzono nieparzysta liczbe przedzialow dla metody Simpsona, w tej metodzie liczba przedzialow powinna byc parzysta ");
        }
        if(calka==1 && metoda=='S') {
            WzorSimpsona.SimpsonCalka1(przedzialy);
        }
        if(calka==2 && metoda=='S') {
            WzorSimpsona.SimpsonCalka2(przedzialy);
        }
        if(calka==3 && metoda=='S') {
            WzorSimpsona.SimpsonCalka3(przedzialy);
        }

    }
}