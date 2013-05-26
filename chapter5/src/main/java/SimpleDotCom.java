import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/9/13
 * Time: 12:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDotCom {
    public static final int MINIMUM_POSITION = 1;
    public static final int MAXIMUM_POSITION = 7;
    public static final int SIZE_OF_DOTCOM = 3;
    private List<Integer> position = new ArrayList<Integer>();
    private int hit_number;

    public void setStartPosition(int position) throws Exception {
        if (isValidStartPosition(position)){
            this.position.add(position);
            this.position.add(position + 1);
            this.position.add(position + 2);
        }
        else {
            throw new Exception();
        }
    }

    private boolean isValidStartPosition(int position) {
        return position >= MINIMUM_POSITION && position <= MAXIMUM_POSITION - SIZE_OF_DOTCOM + 1;
    }

    private boolean isGivenPositionInValidRange(int givePosition) {
        return givePosition >= MINIMUM_POSITION && givePosition <= MAXIMUM_POSITION;
    }

    public List<Integer> getPosition() {
        return position;
    }

    public String check(int guessNumber) throws Exception {
        if (!isGivenPositionInValidRange(guessNumber)){
            throw new Exception();
        }
        else{
            if (!position.contains(guessNumber)){
                return "Miss";
            }
            else {
                hit_number++;
                position.remove(position.indexOf(guessNumber));
                if (hit_number == SIZE_OF_DOTCOM){
                    return "Kill";
                }
                return "Hit";
            }
        }
    }

    public boolean isKilled() {
        return hit_number == SIZE_OF_DOTCOM;
    }
}
