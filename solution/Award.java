package solution;
import java.util.ArrayList;
/**
 * Award class for printing award names.
 * 
 * @author Derrick
 * @version 2017
 */
public class Award implements DisplayMethod
{
    private ArrayList<String> summaCumLaude;
    private ArrayList<String> magnaCumLaude;
    private ArrayList<String> cumLaude;
    private DisplayMethod displayMethod;
    /**
     * Award constructor for the method.
     */
    public Award()
    {
        summaCumLaude = new ArrayList<String>();
        magnaCumLaude =  new ArrayList<String>();
        cumLaude =  new ArrayList<String>();
    }
    /**
     * display method implementation from the interface.
     * @return str the string names
     * @param s first arraylist
     * @param m second arrayList
     * @param c third arraylist
    */
    public String display(ArrayList<String> s, 
        ArrayList<String> m, ArrayList<String> c)
    {
        s = summaCumLaude;
        m = magnaCumLaude;
        c = cumLaude;
        String str = " ";
        return str;
    }
    /**
     * main method for implementing methods.
    * @param args printing awards
    */
    public static void main(String[] args)
    {
        Award aw = new Award();
        aw.cumLaude.add("Drake Ronald");
        aw.summaCumLaude.add("Drake Ronald");
        aw.magnaCumLaude.add("Drake Ronald");
        aw.cumLaude.add("Drake Ronald");
        DisplayTabular dT = new DisplayTabular();
        System.out.print(dT.display(aw.summaCumLaude, 
            aw.magnaCumLaude, aw.cumLaude));
    }
}
