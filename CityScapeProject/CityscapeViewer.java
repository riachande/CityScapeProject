import javax.swing.JFrame; 
import java.awt.Color ;

public class CityscapeViewer
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame(); 
        frame.setSize(950,1000);
        frame.setTitle("CityScape Project"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setBackground(Color.BLACK); 
        CityScapeComponent component = new CityScapeComponent(); 
        frame.add(component); 
        
        frame.setVisible(true); 
    }
}