package entity.explosion.children;

import java.util.ArrayList;

import asset.Asset;
import core.main.Handler;
import entity.explosion.Explosion;

import java.awt.image.BufferedImage;

public class ExplosionK extends Explosion
{
    public ExplosionK(Handler handler)
    {
        super(handler);
    }

    @Override
    protected void loadInfo()
    {
        damage = 5;
        deleted = false;
    }

    @Override
    protected void loadImages()
    {
        images = new ArrayList<BufferedImage>();

        images.add(Asset.explosionK.crop(65, 104, 189, 162));
        images.add(Asset.explosionK.crop(288, 104, 189, 162));
        images.add(Asset.explosionK.crop(516, 104, 189, 162));
        images.add(Asset.explosionK.crop(742, 104, 189, 162));
        images.add(Asset.explosionK.crop(68, 301, 189, 162));
        images.add(Asset.explosionK.crop(294, 301, 189, 162));
        images.add(Asset.explosionK.crop(516, 301, 189, 162));
        images.add(Asset.explosionK.crop(742, 301, 189, 162));
        images.add(Asset.explosionK.crop(64, 497, 189, 162));
        images.add(Asset.explosionK.crop(291, 497, 189, 162));
        images.add(Asset.explosionK.crop(514, 497, 189, 162));
        images.add(Asset.explosionK.crop(726, 497, 189, 162));
    }
}
