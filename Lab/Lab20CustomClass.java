/**
*Christian Castillo
*15 May 2018
*Co Sci 290
**/


//Start Shape class
public class Lab20CustomClass{
  
  private String name;
  private String color;
  private double area;
  
  public Lab20CustomClass(){
    this.name = "Triangle";
    this.color = "White";
    this.area = 0.0;
  }  
  
  public Lab20CustomClass(String shapeName, String shapeColor, double shapeArea){
    this.name = shapeName;
    this.color = shapeColor;
    this.area = shapeArea;
  }
    
  //getter or Accessor
  public String getName(){ return this.name; }
  public String getColor(){ return this.color; }
  
  //setter or Mutator
  public void setName(String str){ this.name = str; }
  public void setColor(String str){ this.color = str; }
  
  //toString
  public String toString(){ return "This " + this.color + " " + this.name + " has an area of " + this.area;}
    
}