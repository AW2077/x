import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy: ");
        int rozmiar = scanner.nextInt();

        double[] tablica = new double[rozmiar];

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("wynik.txt");

            System.out.println("Podaj elementy tablicy:");
            double suma = 0.0;
            for (int i = 0; i < tablica.length; i++) {
                double el  = scanner.nextDouble();
                tablica[i] = el;
                fileWriter.write(Double.toString(el) + " ");
                suma += el;
            }
            fileWriter.write("\nPosortowana:\n");

            Arrays.sort(tablica);
            for (double el : tablica) {
                fileWriter.write(Double.toString(el)+ " ");
            }
            fileWriter.write("\n");

            double srednia = suma / rozmiar;

            double mediana;
            int srodek = (0 + rozmiar - 1) / 2;

            if (rozmiar % 2 == 0) { // parzysta
                mediana = (tablica[srodek] + tablica[srodek + 1]) / 2.0;
            } else { // nieparzysta
                mediana = tablica[srodek];
            }

            fileWriter.write("Średnia: " + srednia + "\n");
            fileWriter.write("Mediana: " + mediana + "\n");

            System.out.println("Średnia: " + srednia);
            System.out.println("Mediana: " + mediana);

        } finally {
            if (fileWriter != null) {
                fileWriter.close();
                System.out.println("Zapisane!");
            }
        }

    }

}
