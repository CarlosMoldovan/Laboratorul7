package ex3;

import java.util.ArrayList;
import java.util.List;

public class ListaDiscipline {
    private List<String> denumireDiscipline = new ArrayList<>();
    private List<String> cadreDidactice = new ArrayList<>();
    private List<Integer> note = new ArrayList();

    public void adaugareDisc(String denumire, String cadruDidactic, int nota) {
        denumireDiscipline.add(denumire);
        cadreDidactice.add(cadruDidactic);
        note.add(nota);
    }

    public double calculMedie() {
        if (denumireDiscipline.isEmpty() || note.isEmpty()) {
            return 0.0; // Sau altă valoare implicită
        }

        int sumaNote = 0;
        for (int nota : note) {
            sumaNote += nota;
        }

        return (double) sumaNote / note.size();
    }
}
