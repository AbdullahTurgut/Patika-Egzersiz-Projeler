package Examples;

public class Point {
    int x;
    int y;

    //constructor

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void distanceFromOrigin(){
        double distance = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        System.out.println(distance);
    }
}
