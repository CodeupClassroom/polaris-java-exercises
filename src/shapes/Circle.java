package shapes;

public class Circle {

    private double radius;

    // BONUS: GOOD USE OF STATIC TO COUNT HOW MANY INSTANCES OF CIRCLE
    private static int count = 0;

    public Circle(double radius) {
        this.radius = radius;
        // BONUS: INCREMENT COUNT EACH TIME A CIRCLE IS CREATED
        count++;
    }

    // BONUS: CREATE STATIC METHOD TO GET COUNT FROM CLASS NOT EACH OBJECT
    public static int getCount() {
        return count;
    }


    public double getArea(){
        return Math.PI * radius * radius;
    }


    public double getCircumference() {
        return 2 * Math.PI * radius;
    }


}
