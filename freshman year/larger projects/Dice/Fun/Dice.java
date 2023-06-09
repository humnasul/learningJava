package Dice.Fun;
/**
 * Implements a Dice object (a die)
 *
 * @author andrianoff
 * @version June 25, 2014
 */
/**
 * Name: Humna Sultan
 * Program Name: 1. Dice Lab
 * Date: 16 June 2019
 * Extra N/A
 */
public class Dice
//class name
{
    /**
     * Constructs a die
     */
    int sides = 17;
    int sides2 = 5;
    //declares and initializes vars
    public Dice()
    {
    }

    /**
     * Rolls a die - generates a random number in the range 1
     .. 6
     * @return the face value of the die
     */
    public int roll()
    {
        return (int) (Math.random()*sides) + 1;

    }
    //rolls die one
    public int roll2()
    {
        return (int) (Math.random()*sides2) + 1;

    }
    //rolls die 2
    @Override
    public String toString(){
        return "sides = " + this.sides;
    }
}
