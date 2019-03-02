import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseInput implements MouseListener{
    public void mouseClicked(MouseEvent e){}
    
    @Override
    public void mousePressed(MouseEvent e){
        int mx = e.getX();
        int my = e.getY();
        
        if (mx >= Main.W/3+120 && mx <= Main.W/3+220){
            if (my >= 150 && my <= 200){
                //Pressed Play Button
                View.State = View.STATE.GAME;
            }
            if(my >= 250 && my <= 300){
                System.exit(1);
            }
        }
    }
    
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}
