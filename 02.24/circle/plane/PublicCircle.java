
package circle.plane;


public class PublicCircle {
    private double x;
    private double y;
    private double r;

    public PublicCircle(){
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }

    public double getArea(){
        return 3.14 * 2 * r;
    }

    public void setValues(double x, double y, double r){
        if(r < 1.0) throw new IllegalArgumentException("You stupid");
        this.x = x;
        this.y = y;
        this.r = r;
    }
}