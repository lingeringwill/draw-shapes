import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(300,300);
   
    Turtle yertle = new Turtle(world);
    // Add your code here
    public void Draw(int sides, length, shapes){
       for (int i = 0; i < shapes; i++) {
      for (int j = 0; j < sides; j++){
        yertle.forward(length);
        yertle.turnLeft();
      }
      yertle.turnLeft();
      }
    }

   
  
  
    world.setVisible(true);
  }
}
