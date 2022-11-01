public class Carte implements Comparable<Carte>{
    private String titlu;
    private String autor;
    private Integer an_aparitie;
    private Integer nr_pagini;

    public Carte(String titlu, String autor, Integer an_aparitie, Integer nr_pagini)
    {
        this.titlu = titlu;
        this.autor = autor;
        this.an_aparitie = an_aparitie;
        this.nr_pagini = nr_pagini;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAn_aparitie() {
        return an_aparitie;
    }

    public Integer getNr_pagini() {
        return nr_pagini;
    }

    @Override
    public String toString() {
        return "Carte{" +
                titlu + '\'' +
                autor + '\'' +
                "publicata in" +
                an_aparitie +
                "Nr pagini: "+nr_pagini+'}';
    }

    @Override
    public int compareTo(Carte o) {
        return this.getNr_pagini().compareTo(o.getNr_pagini());
    }
}
