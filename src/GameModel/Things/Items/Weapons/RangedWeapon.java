package GameModel.Things.Items.Weapons;
import GameModel.Things.Items.Ammo;

import java.util.ArrayList; 
/**
 * Write a description of class RangedWeapon here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class RangedWeapon extends Weapon
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Ammo> ammunition = new ArrayList<Ammo>();

    /**
     * Constructor for objects of class Projectile
     */
    public RangedWeapon()
    {
        category="Weapon";
        
    }

    
}