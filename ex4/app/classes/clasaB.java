package ex4.app.classes;
import ex4.app.interfaces.interfaces2;

public class clasaB extends oras implements interfaces2 {
    public clasaB(String nume, int nrlocuitori, String judet) {
        super(nume, nrlocuitori, judet);
    }

    @Override
    public void setNume(String nume) {
        super.setNume(nume);
    }

    @Override
    public int getNrLocuitori(){
        return super.getNrLocuitori();
    }

    @Override
    public String getJudet(){
        return super.getJudet();
    }
}
