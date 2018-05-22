/**
*Christian Castillo
*17 May 2018
*Co Sci 290
**/

public class Lab21AbstractClass extends Lab20CustomClass{
  
  private String name;
  private int sides;
  
  public Lab21AbstractClass(){
    super();
    this.name = "Triangle";
    this.sides = 3;
    
  }
  
  public String getName() { return this.name; }
  public int getSides() { return this.sides; }
  
  public void setName(String name){ this.name = name; }
  public void setSides(int sides){ this.sides = sides; }
  
  public String toString(){
    return super.toString() + "\nThis " + this.name + " has " + this.sides + " sides!";
  }
  
  
  
  
  
}