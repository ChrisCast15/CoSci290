/*
*Author: Christian Castillo
*Co Sci 290
*22 May 2018
*/

public class UndeadWarrior extends Undead{
  
  private String rightHandWeapon;
  private String leftHandWeapon;
  
  public UndeadWarrior(){
    super(35, 20, "Undead Warrior");
    this.rightHandWeapon = "sword";
    this.leftHandWeapon = "shield";
  }
  
  //getter
  public String getRightHandWeapon(){return this.rightHandWeapon;}
  public String getLeftHandWeapon(){return this.leftHandWeapon;}
  
  //setter
  public void setRightHandWeapon(String rightHandWeapon){
    this.rightHandWeapon = rightHandWeapon;
  }
  
  public void setLeftHandWeapon(String leftHandWeapon){
    this.leftHandWeapon = leftHandWeapon;
  }
  
  //toString
  public String toString(){
    return super.toString() + ", Right Hand: " + this.rightHandWeapon + ", Left Hand: " + this.leftHandWeapon;
  }
  
  @Override
  public void attack(){
    System.out.println("The " + this.getName() + " swings at you with its " + this.rightHandWeapon + ".");
  }
}