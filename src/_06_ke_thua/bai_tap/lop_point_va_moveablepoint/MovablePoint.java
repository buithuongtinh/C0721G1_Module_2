package _06_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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


    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] array2 = {getxSpeed(), getySpeed()};
        return array2;
    }
    public MovablePoint move() {
        super.setX(super.getX() + this.getxSpeed());
        super.setY(super.getY() + this.getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MoveAblePoint{" + super.toString()  +
                " xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
