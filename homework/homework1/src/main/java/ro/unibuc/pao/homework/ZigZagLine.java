package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagLine extends Line {

    //TODO: add code here

    private List<Point> Points;

    public ZigZagLine(List<Point> Points) {
        //TODO: add code here
        this.Points = Points;
    }

    public ZigZagLine(Point... Points) {
        //TODO: add code here
        this.Points = new ArrayList<Point>(Arrays.asList(Points));
    }

    public void addPoint(Point point) {
        //TODO: add code here
        Points.add(Points.size(), point);
    }

    public int getLength() {
        //TODO: add code here
        int i = 0;
        int Len = 0;
        while( i< Points.size() -1)
        {
            Len += getLength(Points.get(i),Points.get(i+1));
            i++;
        }
        return Len;
    }

}
