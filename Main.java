import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
   
    // Add your code here
   
  
  void Draw(int sides, int length, int shapes){
   World world = new World(300,300);
   
    world.setVisible(true);
    yertle.pendown();
  Turtle yertle = new Turtle(world);
       for (int i = 0; i < shapes; i++) {
      for (int j = 0; j < sides; j++){
        yertle.forward(length);
        yertle.turn(90);
      }
      yertle.turnLeft();
      }
    }
  }
   
 
  
   
  }
   Draw(4,50,2);
}
