import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        notatka notatka = new notatka("brak", "lody");
        notatka.diagnostyka();
        System.out.println("medota ktora wyswietla tytul i tresc: ");

        notatka.WysiwietlTytulTresc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tersc notatki: ");
        String tresc = scanner.next();
        System.out.println("Podaj tytul notatki: ");
        String tytul = scanner.next();

        notatka notatka1 = new notatka(tytul, tresc);
        System.out.println("testowanie metody diagnostyka");
        notatka1.diagnostyka();
        System.out.println("testowanie metody wyspietlajacej tytul i tresc ");

        notatka1.WysiwietlTytulTresc();
    }
}

// kartkowka obiektowe i kolekcja