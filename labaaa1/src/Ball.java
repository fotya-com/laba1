public class Ball {
    private String col ;
    private int rad;

    public Ball (String c,int r)
    {
        col  = c;
        rad = r;
    }
    public Ball(String c){
        col = c;
        rad = 0;

    }
    public Ball (){
        col = "different";
        rad = 0;
    }
    public void setRadius(int rad) {
        this.rad = rad;
    }
    public void setColor(String col) {
        this.col = col;
    }
    public String getColor(String col){
        return col;
    }
    public int getRadius() {
        return rad;
    }
    public String toString(){
        return this.col+", radius "+this.rad;
    }
    public void intoRadius(){
        System.out.println( col +" ball with square  "+ 4*3.14*Math.pow(rad,3));
    }
}