import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/9/13
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameHelper {
    public static String getUserInput(String prompt) throws IOException {
        String inputLine = null;
        System.out.print(prompt);
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        inputLine = is.readLine();
        if (inputLine.length() == 0){
            return null;
        }
        return inputLine;
    }
}
