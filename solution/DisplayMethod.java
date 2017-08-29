package solution;
import java.util.ArrayList;
/**
 * DisplayMethod interface for implementation.
 * 
 * @author Derrick Kimbrough
 * @version 2017
 */
public interface DisplayMethod
{
    /**
     * the display method used to pass the arrayLists.
     * 
     * @param s summaCumLaude
     * @param m magnaCumLaude
     * @param c cumLaude
     * @return string the output to be printed out
     */
    public String display(ArrayList<String> s, ArrayList<String> m, 
        ArrayList<String> c);
}
