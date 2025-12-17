package FlyWeightPattern;

import java.util.HashMap;
import java.util.Objects;

public class FlyWeightBulletRegistry {
    static HashMap<String, FlyWeightBullet> hmap = new HashMap<>();

    static void register(String bullet) {
        FlyWeightBullet fb = null;
        if (Objects.equals(bullet, "pistol")) {
            fb = new PistolBullet();
        } else if (Objects.equals(bullet, "rifle")) {
            fb = new RifleBullet();
        }
        if (fb != null) hmap.put(bullet, fb);
    }

    static FlyWeightBullet fetch(String bullet) {
        return hmap.get(bullet);
    }
}
