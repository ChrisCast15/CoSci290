/*
*Author: Christian Castillo
*Co Sci 290
*22 May 2018
*/

import java.util.*;

public class UndeadDriver{
  
  public static void main(String[] args){
    ArrayList<Undead> list = new ArrayList<Undead>();
    
    for(int i = 0; i <=10; i++){
      int rng = (int) (Math.random() * 11);
      if( 0 <= rng && rng <= 5){
        list.add(new UndeadMage());
      } else{
        list.add(new UndeadWarrior());
      }
    }
    
    for( int i = 0; i <= 10; i++){
      list.get(i).attack();
    }
    
    
  }
}