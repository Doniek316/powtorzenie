public class notatka {
    private static int zlicz;
     protected String tytul;
    protected String tresc;
    private int identifikator;

    public notatka(String tresc, String tytul) {
        this.tresc = tresc;
        this.tytul = tytul;
        zlicz ++;
        identifikator = zlicz;
    }
    public void  WysiwietlTytulTresc(){
        System.out.println("Notatka: ");
        System.out.println("tytuł: " + tytul);
        System.out.println("tresc: " + tresc);

    }

    public void diagnostyka(){
        System.out.println("notatka{" +
                "identifikator=" + identifikator +
                ", tytul='" + tytul + '\'' +
                ", tresc='" + tresc + '\'' +
                '}');
    }
}
