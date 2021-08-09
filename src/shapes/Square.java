package shapes;

public class Square extends Rectangle {

    public Square (int side) {
        super(side, side);
    }


    @Override
    public int getArea(){
        System.out.println("Get area from square");
        return super.length * super.width;
    }

    @Override
    public int getPerimeter(){
        System.out.println("Get per from square");
        return 4 * super.length;
    }



}
