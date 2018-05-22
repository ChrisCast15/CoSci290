/*
*Author: Christian Castillo
*Co Sci 290
*22 May 2018
*/

public class UndeadMage extends Undead{
  private String spellOne;
  private String spellTwo;
  
  public UndeadMage(){
    super(30, 15, "Undead Mage");
    this.spellOne = "Flame";
    this.spellTwo = "Freeze";
  }
    //getter
    public String getSpellOne(){return this.spellOne;}
    public String getSpellTwo(){return this.spellTwo;}
    
    //setter
    public void setSpellOne(String spellOne){this.spellOne = spellOne;}
    public void setSpellTwo(String spellTwo){this.spellTwo = spellTwo;}
    
    //toString
    public String toString(){
      return super.toString() + ", Spell One= " + this.spellOne + ", Spell Two= " + this.spellTwo;
    }
    
    @Override
    public void attack(){
      System.out.println("The " + this.getName() + " casts a spell on you!");
    }
}