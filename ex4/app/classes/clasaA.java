package ex4.app.classes;
import ex4.app.interfaces.interfaces1;

public class clasaA extends masina implements interfaces1 {
    public clasaA(int an, String kmBord, String marca) {
        super(an, kmBord, marca);
    }

    // Nu este nevoie să creați o instanță de masina în interiorul clasei
    @Override
    public int getAn(){
        return super.getAn();
    }

    @Override
    public String getKmBord(){
        return super.getKmBord();
    }

    @Override
    public String getMarca(){
        return super.getMarca();
    }
}
