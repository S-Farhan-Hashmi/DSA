package SORTING;
import java.util.*;
public class CollectionsSort2 {
    public static void main(String[] args){
        List<Point4> list = new ArrayList<>();
        list.add(new Point4(3,4));
        list.add(new Point4(2,3));
        Collections.sort(list,new Myclm());
        for(int i =0 ;i <list.size();i++) {
            System.out.println(list.get(i).x + " " + list.get(i).y);
        }
    }
}
class Point4{
    int x,y;
    Point4(int x , int y){
        this.x=x;
        this.y=y;
    }
}
class Myclm implements Comparator<Point4>{
    public int compare(Point4 p1 , Point4 p2){
        return p1.x-p2.x;
    }
}
