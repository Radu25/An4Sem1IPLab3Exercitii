import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Proiect1 {
    public static void main(String[] args){
        Biblioteca biblioteca1 = new Biblioteca("BibliotecaTest1");
        Carte carte1 = new Carte("Titlu1", "Autor1", 2014, 251);
        Carte carte2 = new Carte("Titlu2", "Autor2", 2014, 250);

        biblioteca1.add(carte1);
        biblioteca1.add(carte2);

        Biblioteca biblioteca2= new Biblioteca("MyLibrary");
        Carte carte3=new Carte("Print si cersetor","Mark Twain",2014,265);
        Carte carte4=new Carte("Castelul din Carpati","Jules Verne",1950,210);
        biblioteca2.add(carte3);
        biblioteca2.add(carte4);

        System.out.println(biblioteca1);
        System.out.println(biblioteca2);

        biblioteca1.add(biblioteca2);
        System.out.println("\n");
        System.out.println(biblioteca1);

        System.out.println("\n");

        System.out.println(carte2.compareTo(carte3));


        ArrayList<Carte> listaCarti = new ArrayList<>();
        listaCarti.add(new Carte("Titlu1", "Autor1", 2014, 251));
        listaCarti.add(new Carte("Titlu2", "Autor2", 2014, 240));

        Collections.sort(listaCarti, Collections.reverseOrder()); //sortez descrescator dupa numarul de pagini
        System.out.println(listaCarti);

        Collections.sort(listaCarti);//sortez crescator dupa numarul de pagini
        System.out.println(listaCarti);
        //Collections.sort(, Collections.reverseOrder());

    }
}
