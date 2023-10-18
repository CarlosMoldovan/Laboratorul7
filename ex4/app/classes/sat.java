package ex4.app.classes;

import ex4.app.interfaces.interfaces2;

public class sat implements interfaces2{
    private String nume;
    private int nrlocuitori;
    private String judet;
    public sat(String nume,int nrlocuitori,String judet){
        this.nume = nume;
        this.nrlocuitori = nrlocuitori;
        this.judet = judet;
    }
    @Override
    public void setNume(String nume)
    {
        this.nume = nume;
    }
    @Override
    public int  getNrLocuitori(){
        return nrlocuitori;
    }
    @Override
    public String getJudet(){
        return judet;
    }
}
