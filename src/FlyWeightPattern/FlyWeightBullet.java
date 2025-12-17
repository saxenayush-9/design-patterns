package FlyWeightPattern;

public abstract class FlyWeightBullet {
    double weight;
    String color;
    int maxSpeed;
    int maxDamage;
    byte[] image;

    abstract byte[] getImage();

    abstract double getWeight();

    abstract int getMaxDamage();

    abstract int getMaxSpeed();

    abstract String getColor();

}
