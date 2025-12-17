package FlyWeightPattern;

public class Bullet {
    private String target;
    private double shootingAngle;
    FlyWeightBullet fb;

    public double getShootingAngle() {
        return shootingAngle;
    }

    public void setShootingAngle(double shootingAngle) {
        this.shootingAngle = shootingAngle;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
