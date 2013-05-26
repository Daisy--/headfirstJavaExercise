/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/9/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDotComGameTestDriver {
    private static SimpleDotComGame simpleDotComGame;

    public static void main(String[] args) throws Exception {
        simpleDotComGame = new SimpleDotComGame();
        simpleDotComGame.startGame();
        System.out.println("Game start!");
        while(simpleDotComGame.isAlive()){
            System.out.println(simpleDotComGame.guess(Integer.parseInt(GameHelper.getUserInput("enter a number : "))));
        }
    }
}
