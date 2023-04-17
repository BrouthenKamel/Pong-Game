import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.management.relation.RelationNotFoundException;
import javax.swing.*;
public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 3;
    Ball(int x, int y, int width, int height){
        super( x,y ,width ,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection==0){
            randomXDirection--;
        }
        setXDirection(randomXDirection*initialSpeed);
        int randomYDirection = random.nextInt(2);
        if(randomYDirection==0){
            randomYDirection--;
        }
        setYDirection(randomYDirection*initialSpeed);
    }

    public void setXDirection(int randowXDirection){
        xVelocity = randowXDirection ;
    }
    public void setYDirection(int randowYDirection){
        yVelocity = randowYDirection ;
    }
    public void move(){
        x += xVelocity ;
        y += yVelocity ;
    }
    public void draw(Graphics g){
        g.setColor(new Color(255, 255, 255));
        g.fillOval(x, y, width, height);

    }

}
