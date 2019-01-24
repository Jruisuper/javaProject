package day1229;

class Point{
    private Object x;
    private Object y;
    public void setX(Object x){
        this.x=x;
    }
    public void setY(Object y){
        this.y=y;
    }
    public Object getX(){
        return this.x;
    }
    public Object getY(){
        return this.y;
    }
}
public class GenericsDemo01 {
    public static void main(String[] args) {
        Point p=new Point();
        p.setX("东经180度");
        p.setY("北纬210度");
        String x=(String)p.getX();
        String y=(String)p.getY();
        System.out.println(x);
        System.out.println(y);
    }

}
