package shuffle;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/26/13
 * Time: 11:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Shuffle1 {
    private static int x;

    public static void main(String [] args){
            x = 3;
            while (x > 0){
                if (x > 2){
                    System.out.print("a");
                }
                x = x-1;
                System.out.print("-");
                if(x == 2){
                    System.out.print("b c");
                }
                if(x < 2){
                    System.out.print("d");
                    x = x-1;
                }
            }
        }
}

