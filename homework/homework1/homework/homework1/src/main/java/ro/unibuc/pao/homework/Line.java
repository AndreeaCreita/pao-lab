package ro.unibuc.pao.homework;

public class Line {
    private Point p1;
    private Point p2;

    public Line() {

    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    //TODO: add code here

    public int getLength(Point p1, Point p2)
    {
        return (int) Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY()-p2.getY()),2));
    }

    public int getLength()
    {
        return getLength(this.p1, this.p2);
    }
}