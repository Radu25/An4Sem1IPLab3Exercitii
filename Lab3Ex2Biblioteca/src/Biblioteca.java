import java.util.ArrayList;

public class Biblioteca {
     ArrayList<Carte> carti=new ArrayList<>();

    String nume;

    Biblioteca(String nume)
    {
        this.nume = nume;
    }

    String getNume()
    {
        return this.nume;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + nume+
                "carti=" + carti +
                '}';
    }

    public ArrayList<Carte> getCarti() {
        return carti;
    }

   public void add(Carte carte)
    {
        carti.add(carte);
    }

    public void add(Biblioteca biblioteca)
    {
        carti.addAll(biblioteca.carti);
    }


}
