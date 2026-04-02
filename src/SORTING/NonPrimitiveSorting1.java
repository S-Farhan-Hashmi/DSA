package SORTING;
import java.util.*;
public class NonPrimitiveSorting1 {
    public static void main(String[] args) {
        Point[] arr = {new Point(3, 4), new Point(5, 6)};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
class Point implements Comparable<Point>{
    int x , y;
    Point(int x , int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Point p){
        return this.x-p.x;
    }
}
