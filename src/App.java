import app.controller.GameController;

public class App
{
    public static void main(String[] args)
    {
        GameController game = new GameController(448, 448);

        game.launch();
    }
}
