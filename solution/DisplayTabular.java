package solution;
import java.util.ArrayList;
/**
 * DisplayTabular class for printing award names.
 * 
 * @author Derrick Kimbrough
 * @version 2017
 */
public class DisplayTabular implements DisplayMethod
{
    Award aw = new Award();
    /**
     * DisplayTabular no-args constructor.
     */
    DisplayTabular()
    {
        
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
        aw.display(s, m, c);
        String str = "";
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < 20 * 3 + 4; i++)
        {
            if (i == 0 || i == 20 + 1 || i == 2 * 20 + 2 || i == 3 * 20 + 3)
            {
                str += "+";
            }
            str += "-";
        }
        str += "\n";
        str1 = "| Summa Cum Laude      | Magna Cum Laude     | "
                + "Cum Laude           |\n";
        for (int j = 0; j < c.size(); j++)
        {
            str2 += String.format("| %-20s" + "| %-20s" 
            + "| %-20s" + "|\n" + str, s.get(j), m.get(j), c.get(j));
        }
        return str + str1 + str + str2;
    }
}
