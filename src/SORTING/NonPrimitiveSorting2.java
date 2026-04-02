package SORTING;
import java.util.*;
public class NonPrimitiveSorting2 {
    public static void main(String[] args) {
        Point1[] arr = {new Point1(3, 4), new Point1(5, 6)};
        Arrays.sort(arr,new Myclass());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
class Point1{
    int x , y;
    Point1(int x , int y){
        this.x=x;
        this.y=y;
    }
}
class Myclass implements Comparator<Point1>{
    public int compare(Point1 p1, Point1 p2){
        return p1.x-p2.x;
    }
}
