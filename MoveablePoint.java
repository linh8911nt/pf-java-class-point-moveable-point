public class MoveablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float pointX, float pointY, float xSpeed, float ySpeed) {
        super(pointX, pointY);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint move(){
        float newPointX = getPointX() + xSpeed;
        float newPointY = getPointY() + ySpeed;
        setPointX(newPointX);
        setPointY(newPointY);
        return this;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] xySpeed = new float[2];
        xySpeed[0] = xSpeed;
        xySpeed[1] = ySpeed;
        return xySpeed;
    }

    @Override
    public String toString() {
        return super.toString() +
                " with MoveablePoint{" +
                "xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }


}
