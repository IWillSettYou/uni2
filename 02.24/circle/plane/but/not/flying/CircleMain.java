
package circle.plane.but.not.flying;

import circle.plane.PublicCircle;

public class CircleMain {
    void main(){
        PublicCircle publicCircle = new PublicCircle();

        IO.println(publicCircle.getArea());

        publicCircle.setValues(5, 2, 10);

        IO.println(publicCircle.getArea());

        publicCircle.setValues(5, 2, 0);

        IO.println(publicCircle.getArea());
    }
}