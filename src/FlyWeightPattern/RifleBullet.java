package FlyWeightPattern;

public class RifleBullet extends FlyWeightBullet {
    final double weight = 762;
    final String color = "golden";
    final int maxSpeed = 300;
    final int maxDamage = 250;
    final byte[] image = {20, 30, 40, 50, 60};

    public int getMaxDamage() {
        return maxDamage;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public byte[] getImage() {
        return image;
    }

}
