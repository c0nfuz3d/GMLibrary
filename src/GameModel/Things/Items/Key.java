package GameModel.Things.Items;


/**
 * Write a description of class Key here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Key extends Item
{
    private static int keycount;
    public static Key skeleton;
    private int code;

    /**
     * Constructor for objects of class Key
     */
    public Key()
    {
        name="Generic Key";
        keycount++;
        code=keycount;
        category="Item";
    }

    /**
     * gets the key code
     * 
     * @return     the key code 
     */
    public int getCode()
    {
        return code;
    }
    
    /**
     * sets the key code
     * 
     * @param     the key code to set
     */
    public void setCode(int code)
    {
        this.code=code;
    }
}