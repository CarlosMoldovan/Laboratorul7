package ex4.app.classes;

import ex4.app.interfaces.interfaces1;

public class masina implements interfaces1{
    private int an;
    private String kmBord;
    private String marca;
    public masina(int an, String kmBord, String marca) {
        this.an = an;
        this.kmBord = kmBord;
        this.marca = marca;
    }
    @Override
    public int getAn() {
        return an;
    }

    @Override
    public String getKmBord() {
        return kmBord;
    }

    @Override
    public String getMarca() {
        return marca;
    }
}
