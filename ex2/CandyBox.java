package ex2;

public class CandyBox {
    private String flavor;
    private String origin;
    public CandyBox(){

    }
    public CandyBox(String flavor,String origin)
    {
        this.flavor = flavor;
        this.origin = origin;
    }
    public float getVolume(){
        return 0;
    }
    @Override
    public String toString(){
        return "flavor is " + flavor + " originating in " + origin;
    }
    @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true; // Verificare pentru referința la același obiect
    }

    if (obj == null || getClass() != obj.getClass()) {
        return false; // Verificare pentru nulitate sau tip diferit
    }

    CandyBox otherBox = (CandyBox) obj; // Conversie la tipul CandyBox

    // Comparăm câmpurile flavor și origin
    if (flavor != null ? !flavor.equals(otherBox.flavor) : otherBox.flavor != null) {
        return false;
    }
    if (origin != null ? !origin.equals(otherBox.origin) : otherBox.origin != null) {
        return false;
    }

    return true; // Obiectele sunt considerate egale dacă câmpurile flavor și origin sunt identice
}


}
