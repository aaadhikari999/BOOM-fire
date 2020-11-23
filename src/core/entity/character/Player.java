package core.entity.character;

import java.awt.Graphics;
import core.asset.Asset;
import app.controller.GameController;

public class Player extends Character
{
    public Player(GameController gameController, float x, float y, int width, int height, int health, int damage, float speed)
    {
        super(gameController , x, y, width, height, health, damage, speed, Asset.player);
    }

    public void tick()
    {
        if (gameController.getKeyService().up.pressed) {
            moveUp(speed);
        }

        if (gameController.getKeyService().down.pressed) {
            moveDown(speed);
        }

        if (gameController.getKeyService().left.pressed) {
            moveLeft(speed);
        }
        
        if (gameController.getKeyService().right.pressed) {
            moveRight(speed);
        }
    }

    public void render(Graphics graphics)
    {
        graphics.drawImage(BImage,
            (int) (x - gameController.getCameraService().getXOffset()),
            (int) (y - gameController.getCameraService().getYOffset()),
            width, height, null);
    }
}
