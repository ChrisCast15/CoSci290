/*
*Author: Christian Castillo
*Co Sci 290
*22 May 2018
*/ 

public abstract class Undead{
  private int health;
  private int experience;
  private String name;
  
  //constructor
  public Undead(){
    this.health = 25;
    this.experience = 10;
    this.name = "Undead";
  }
  
  public Undead(int health, int experience, String name){
    this.health = health;
    this.experience = experience;
    this.name = name;
  }
  
  //getter
  public int getHealth(){return this.health;}
  public int getExperience(){return this.experience;}
  public String getName(){return this.name;}
  
  //setter
  public void setHealth(int health){this.health = health;}
  public void setExperience(int experience){this.experience = experience;}
  public void setName(String name){this.name = name;}
  
  //toString
  public String toString(){
    return name + " stats: health= " + this.health + ",experience= " + this.experience;
  }
  
  public abstract void attack();
}