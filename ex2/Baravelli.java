package ex2;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;
    public Baravelli(){

    }
    public Baravelli(String flavor, String origin,float radius,float height){
        super(flavor, origin);
        this.height = height;
        this.radius = radius;
    }
    @Override
    public float getVolume() {
       return (float) (Math.PI * Math.pow(radius, 2) * height);
    }
    @Override
    public String toString() {
       return "The " + super.toString() + " has volume " + getVolume();
    }

}
