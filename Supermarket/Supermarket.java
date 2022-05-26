import java.util.Scanner;

class Supermarket
{
    public static void main ( String[] args )
    {
      Scanner program = new Scanner(System.in);
//definiowanie produktów
      String[] produkty = {"masło", "mleko", "chleb"};
      double[] ceny = {8.99, 2.99, 1.99};
      int[] ilosc = {23, 12, 22};
      int stan_czy_zakup = 0;
      int sprzedaz = 0;
      // Stan czy zakup?

      while (stan_czy_zakup !=4){
        System.out.println("Wpisz odpowiednią liczbę");
        System.out.println("1. Sprawdź stan magazynu");
        System.out.println("2. Zmień stan magazynu");
        System.out.println("3. Przeprowadź zakup");
        System.out.println("4. Wyjdź z programu");

        stan_czy_zakup = program.nextInt();
        System.out.println("\n");
//stan magazynu
        if (stan_czy_zakup == 1) {
			      System.out.println("produkt\tcena\tilość");
			         for (int i=0; i<produkty.length; i++) {
				         System.out.println(produkty[i] + "\t" + ceny[i] +  "\t" + ilosc[i]);
			         }
               System.out.println("\n\n");
        } else if (stan_czy_zakup == 2){
          System.out.println("Zmień stan magazynu");
          System.out.println("\n");
//Przeprowadzenie zakupu
        } else if (stan_czy_zakup == 3 ) {
			      for (int i=0; i<produkty.length; i++) {
				       System.out.println((i+1) + ". " + produkty[i]);

		        }
        while (sprzedaz != 2){
		        System.out.print("Który produkt chcesz wybrać?: ");
			      int ktory_produkt = program.nextInt();
			      while (ktory_produkt > produkty.length){ //nie można wybrać produtku spoza listy
				          System.out.print("Wybierz poprawny produkt. Który produkt chcesz wybrać?: ");
				          ktory_produkt = program.nextInt();
			      }
			      System.out.print("Ile sztuk?: ");
			      int ile_sztuk = program.nextInt();
			      while (ile_sztuk > ilosc[(ktory_produkt - 1)]){
				          System.out.print("Za mało towaru w magazynie. Wybierz mniejszą ilość produktu: ");
				          ile_sztuk = program.nextInt();
			      }
			      System.out.println("Wybrałeś: " + produkty[(ktory_produkt - 1)] + "\t"+ ile_sztuk + " sztuki");
			      System.out.println("Do zapłaty: " + (ceny[ktory_produkt - 1] * ile_sztuk));
			      System.out.println("Dziękujemy za skorzystanie z naszych usług");
			      ilosc[ktory_produkt - 1] = ilosc[ktory_produkt - 1] - ile_sztuk;
            System.out.println("\n");
            System.out.print("1. Dodaj kolejny produkt");
            System.out.print("2. Zakończ");
            sprzedaz = program.nextInt();

       }
       } else {
         System.out.println("\n");
       }
			 // jeszcze raz
		}


      //zapłacenie


    }
}
