/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/9/13
 * Time: 12:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDotComGame {
    public static final int MAXIMUM_POSITION = 7;
    private SimpleDotCom simpleDotCom;

    public void startGame() throws Exception {
        simpleDotCom = new SimpleDotCom();
        int start_position = createRandomPosition();
        simpleDotCom.setStartPosition(start_position);
    }

    public String guess(int guessNumber) throws Exception {
        return simpleDotCom.check(guessNumber);
    }

    public boolean isAlive() {
        return !simpleDotCom.isKilled();
    }

    public int createRandomPosition() {
        return (int)(Math.random() * 5 + 1);
    }
}
