import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //wyszukiwanie linowe (zadanie na 5)
        ArrayList<Integer> parzyste = new ArrayList<>();
        for(int i = 200; i <301; i = i + 2) {
            parzyste.add(i);
        }
        System.out.println(parzyste);
        //zapytaj o liczbe i podaj jakim indeksem jest
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szuakna liczbe: ");
        int liczbaszukana = scanner.nextInt();
        for(int i = 0; i < parzyste.size(); i++){
            if(parzyste.get(i).equals(liczbaszukana)){
                System.out.println("indeks wynosi: " + i);
                break;
            }
        }
        //wyszukiwanie binarne (zadanie na 6)
    }
}

