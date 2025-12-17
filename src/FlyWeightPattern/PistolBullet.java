package FlyWeightPattern;

public class PistolBullet extends FlyWeightBullet {
    final double weight = 5.56;
    final String color = "brown";
    final int maxSpeed = 250;
    final int maxDamage = 150;
    final byte[] image = {10, 20, 30, 40, 50};

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
