package FlyWeightPattern;

public class Main {
    public static void main(String[] args) {
        FlyWeightBulletRegistry.register("pistol");
        FlyWeightBulletRegistry.register("rifle");
        Bullet pb = new Bullet();
        pb.setShootingAngle(45.65);
        pb.setTarget("78.89.09");
        pb.fb = FlyWeightBulletRegistry.fetch("pistol");

        Bullet rb = new Bullet();
        rb.setShootingAngle(26.36);
        rb.setTarget("54.36.25");
        rb.fb = FlyWeightBulletRegistry.fetch("rifle");


        System.out.println(pb.getShootingAngle());
        System.out.println(pb.getTarget());
        System.out.println(pb.fb.getColor());

        System.out.println(rb.getShootingAngle());
        System.out.println(rb.getTarget());
        System.out.println(rb.fb.getColor());

    }
}
