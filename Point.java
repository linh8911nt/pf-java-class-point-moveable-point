public class Point {
    private float pointX = 0;
    private float pointY = 0;

    public Point() {
    }

    public Point(float pointX, float pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public float getPointX() {
        return pointX;
    }

    public void setPointX(float pointX) {
        this.pointX = pointX;
    }

    public float getPointY() {
        return pointY;
    }

    public void setPointY(float pointY) {
        this.pointY = pointY;
    }

    public void setXY(float pointX, float pointY){
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public float[] getXY(){
        float[] xy = new float[2];
        xy[0] = pointX;
        xy[1] = pointY;
        return xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                " pointX = " + pointX +
                ", pointY = " + pointY +
                '}';
    }
}
