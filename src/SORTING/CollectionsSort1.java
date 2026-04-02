package SORTING;
import java.util.*;
public class CollectionsSort1 {
    public static void main(String[] args ){
        List<Point3> list = new ArrayList<>();
        list.add(new Point3(3,4));
        list.add(new Point3(2,3));
        Collections.sort(list);
        for(int i =0 ;i <list.size();i++) {
            System.out.println(list.get(i).x + " " + list.get(i).y);
        }
    }

}
class Point3 implements Comparable<Point3>{
    int x,y;
    Point3(int x , int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Point3 p){
        return this.x-p.x;
    }
}

