import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class WzorSimpsona {
    public static void SimpsonCalka1(int podprzedzialy)
    {
        double h= (2*Math.PI-0)/podprzedzialy;
        double xi[] = new double [podprzedzialy+1];
        double a =0;
        for(int i=0;i<podprzedzialy+1;i++)
        {
            xi[i]=a+ i*h;
        }
        double fi[] = new double[podprzedzialy+1];
        for(int i=0;i<podprzedzialy+1;i++)
        {
            fi[i]=pow(Math.sin(xi[i]),2)+2;

        }
        double sumaIndeksowNieparzystych = 0;
        for(int i=1;i<=podprzedzialy-1;i+=2)
        {
            sumaIndeksowNieparzystych+=fi[i];
        }
        double sumaIndeksowParzystych = 0;
        for(int i=2;i<=podprzedzialy-2;i+=2)
        {
            sumaIndeksowParzystych+=fi[i];
        }
        double wynik;
        wynik = (h/3)*(fi[0]+4*(sumaIndeksowNieparzystych)+2*(sumaIndeksowParzystych) + fi[podprzedzialy]);
        System.out.println("Wynik wynosi: "+wynik);








    }
    public static void SimpsonCalka2(int podprzedzialy)
    {
        double h= (double)2/podprzedzialy;
        double xi[] = new double [podprzedzialy+1];
        double a =0;
        for(int i=0;i<podprzedzialy+1;i++)
        {
            xi[i]=a+ i*h;
        }
        double fi[] = new double[podprzedzialy+1];
        for(int i=0;i<podprzedzialy+1;i++)
        {
            fi[i]=pow(Math.E,xi[i])*2*pow(xi[i],3);

        }
        double sumaIndeksowNieparzystych = 0;
        for(int i=1;i<=podprzedzialy-1;i+=2)
        {
            sumaIndeksowNieparzystych+=fi[i];
        }
        double sumaIndeksowParzystych = 0;
        for(int i=2;i<=podprzedzialy-2;i+=2)
        {
            sumaIndeksowParzystych+=fi[i];
        }
        double wynik;
        wynik = (h/3)*(fi[0]+4*(sumaIndeksowNieparzystych)+2*(sumaIndeksowParzystych) + fi[podprzedzialy]);
        System.out.println("Wynik wynosi: "+wynik);

    }public static void SimpsonCalka3(int podprzedzialy)
    {
        double h= (double)1/podprzedzialy;
        double xi[] = new double [podprzedzialy+1];
        double a =0;
        for(int i=0;i<podprzedzialy+1;i++)
        {
            xi[i]=a+ i*h;
        }
        double fi[] = new double[podprzedzialy+1];
        for(int i=0;i<podprzedzialy+1;i++)
        {
            fi[i]=Math.sqrt(xi[i]+1.0);

        }
        double sumaIndeksowNieparzystych = 0;
        for(int i=1;i<=podprzedzialy-1;i+=2)
        {
            sumaIndeksowNieparzystych+=fi[i];
        }
        double sumaIndeksowParzystych = 0;
        for(int i=2;i<=podprzedzialy-2;i+=2)
        {
            sumaIndeksowParzystych+=fi[i];
        }
        double wynik;
        wynik = (h/3)*(fi[0]+4*(sumaIndeksowNieparzystych)+2*(sumaIndeksowParzystych) + fi[podprzedzialy]);
        System.out.println("Wynik wynosi: "+wynik);

    }
}
