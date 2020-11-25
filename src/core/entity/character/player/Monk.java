package core.entity.character.player;

import java.util.ArrayList;

import app.controller.GameController;
import java.awt.image.BufferedImage;
import core.asset.Asset;

public class Monk extends Player
{
    public Monk(GameController gameController, float x, float y, int width, int height, int health, int damage, float speed)
    {
        super(gameController, x, y, width, height, health, damage, speed);
    }

    protected void loadCharacterImage()
    {
        up = new ArrayList<BufferedImage>();
        down = new ArrayList<BufferedImage>();
        left = new ArrayList<BufferedImage>();
        right = new ArrayList<BufferedImage>();
        stand = new ArrayList<BufferedImage>();

        up.add(Asset.monk.crop(436, 701, 357, 454));
        up.add(Asset.monk.crop(24, 679, 357, 454));
        up.add(Asset.monk.crop(1214, 698, 357, 454));
        up.add(Asset.monk.crop(24, 679, 357, 454));

        down.add(Asset.monk.crop(433, 98, 357, 454));
        down.add(Asset.monk.crop(23, 98, 357, 454));
        down.add(Asset.monk.crop(1212, 98, 357, 454));
        down.add(Asset.monk.crop(23, 98, 357, 454));

        left.add(Asset.monk.crop(423, 1272, 357, 454));
        left.add(Asset.monk.crop(29, 1273, 357, 454));
        left.add(Asset.monk.crop(423, 1272, 357, 454));
        left.add(Asset.monk.crop(29, 1273, 357, 454));
        
        right.add(Asset.monk.crop(24, 1876, 357, 454));
        right.add(Asset.monk.crop(419, 1873, 357, 454));
        right.add(Asset.monk.crop(24, 1876, 357, 454));
        right.add(Asset.monk.crop(419, 1873, 357, 454));

        stand.add(Asset.monk.crop(23, 98, 357, 454));
    }
}
