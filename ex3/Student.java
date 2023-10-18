package ex3;

public class Student extends Persoana {
    private ListaDiscipline listaDisc;

    public Student(String nume, String prenume, String cnp) {
        super(nume, prenume, cnp);
        listaDisc = new ListaDiscipline();
    }

    public void adaugareDisciplina(String denumire, String cadruDidactic, int nota) {
        listaDisc.adaugareDisc(denumire, cadruDidactic, nota);
    }

    public double calculMedie() {
        return listaDisc.calculMedie();
    }

    @Override
    public String toString() {
        return super.toString() + "\nMedie: " + calculMedie();
    }
}

