/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ea.pkg1.moves;

import ee.ea.pkg1.types.Fighting;
import ee.ea.pkg1.SpecifiedPhysical;

/**
 *
 * @author Jason
 */
public class SuperPower extends SpecifiedPhysical{
    public SuperPower() {
        basepower = 120;
        accuracy = 100;
        primary = new Fighting();
        name = "superpower";

    }

    public int recoilDamage(int damageDealt) {
        return 0;
    }

    public int statBoost() {
        return 0;
    }

    public int statDrop() {
        return 0;
    }

    public int recoverHealth() {
        return 0;
    }

    public double typeModifier() {
        return 0;
    }
}
