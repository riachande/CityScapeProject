import java.awt.Graphics; 
import java.awt.Graphics2D; 
import javax.swing.JComponent;
/**
 *This Component will draw the city scape. 
 *
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CityScapeComponent extends JComponent
{


    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void paintComponent(Graphics g)
{
    Graphics2D g2 = (Graphics2D) g; 
    //Creation of the moon //
    Moon moon = new Moon(0,0); 
    
    moon.draw(g2);
    
    // Creation of the buildings // 
    Building building = new Building(20,500);
    building.draw(g2);
    Building building2 = new Building(150,500);
    building2.draw(g2);
    Building building3 = new Building(280,500);
    building3.draw(g2);
    Building building4 = new Building(410,500);
    building4.draw(g2);
    Building building5 = new Building(540,500);
    building5.draw(g2);
    Building building6 = new Building(670,500);
    building6.draw(g2);
    Building building7 = new Building(800,500);
    building7.draw(g2);
    
    
    // Windows for building 1//
    Window window1 = new Window(24,510); 
    window1.draw(g2); 
    
    Window window2 = new Window(24,540); 
    window2.draw(g2); 
    
    Window window3 = new Window(24,570); 
    window3.draw(g2);
    
    Window window4 = new Window(24,600); 
    window4.draw(g2); 
    
    Window window5 = new Window(24,630); 
    window5.draw(g2); 
    
    Window window11 = new Window(50,510); 
    window11.draw(g2); 
    
    Window window12 = new Window(50,540); 
    window12.draw(g2); 
    
    Window window13 = new Window(50,570); 
    window13.draw(g2); 
    
    Window window14 = new Window(50,600); 
    window14.draw(g2); 
    
    Window window15 = new Window(50,630); 
    window15.draw(g2); 
    
    Window window21 = new Window(76,510);
    window21.draw(g2);
    
    
    Window window22 = new Window(76,540);
    window22.draw(g2);
    
    
    Window window23 = new Window(76,570);
    window23.draw(g2);
    
    
    Window window24 = new Window(76,600);
    window24.draw(g2);
    
    
    Window window25 = new Window(76,630);
    window25.draw(g2);
    
     Window window31 = new Window(102,510);
    window31.draw(g2);
    
    
    Window window32 = new Window(102,540);
    window32.draw(g2);
    
    
    Window window33 = new Window(102,570);
    window33.draw(g2);
    
    
    Window window34 = new Window(102,600);
    window34.draw(g2);
    
    
    Window window35 = new Window(102,630);
    window35.draw(g2);
    
    // Window for building 2 //
    
    WindowBuilding2 window41 = new WindowBuilding2(155,510); 
    window41.draw(g2); 
    
    WindowBuilding2 window42 = new WindowBuilding2(155,540); 
    window42.draw(g2); 
    
    WindowBuilding2 window43 = new WindowBuilding2(155,570); 
    window43.draw(g2);
    
    WindowBuilding2 window44 = new WindowBuilding2(155,600); 
    window44.draw(g2); 
    
    WindowBuilding2 window45 = new WindowBuilding2(155,630); 
    window45.draw(g2); 
    
    WindowBuilding2 window51 = new WindowBuilding2(181,510); 
    window51.draw(g2); 
    
    WindowBuilding2 window52 = new WindowBuilding2(181,540); 
    window52.draw(g2); 
    
    WindowBuilding2 window53 = new WindowBuilding2(181,570); 
    window53.draw(g2); 
    
    WindowBuilding2 window54 = new WindowBuilding2(181,600); 
    window54.draw(g2); 
    
    WindowBuilding2 window55 = new WindowBuilding2(181,630); 
    window55.draw(g2); 
    
    WindowBuilding2 window61 = new WindowBuilding2(207,510);
    window61.draw(g2);
    
    
    WindowBuilding2 window62 = new WindowBuilding2(207,540);
    window62.draw(g2);
    
    
    WindowBuilding2 window63 = new WindowBuilding2(207,570);
    window63.draw(g2);
    
    
    WindowBuilding2 window64 = new WindowBuilding2(207,600);
    window64.draw(g2);
    
    
    WindowBuilding2 window65 = new WindowBuilding2(207,630);
    window65.draw(g2);
    
     WindowBuilding2 window71 = new WindowBuilding2(233,510);
    window71.draw(g2);
    
    
    WindowBuilding2 window72 = new WindowBuilding2(233,540);
    window72.draw(g2);
    
    
    WindowBuilding2 window73 = new WindowBuilding2(233,570);
    window73.draw(g2);
    
    
    WindowBuilding2 window74 = new WindowBuilding2(233,600);
    window74.draw(g2);
    
    
    WindowBuilding2 window75 = new WindowBuilding2(233,630);
    window75.draw(g2);
    
    
    // Windows for building 3// 
    WindowBuilding3 window110 = new WindowBuilding3(286,510); 
    window110.draw(g2); 
    
    WindowBuilding3 window211 = new WindowBuilding3(286,540); 
    window211.draw(g2); 
    
    WindowBuilding3 window311 = new WindowBuilding3(286,570); 
    window311.draw(g2);
    
    WindowBuilding3 window411 = new WindowBuilding3(286,600); 
    window411.draw(g2); 
    
    WindowBuilding3 window511 = new WindowBuilding3(286,630); 
    window511.draw(g2); 
    
    WindowBuilding3 window1111 = new WindowBuilding3(312,510); 
    window1111.draw(g2); 
    
    WindowBuilding3 window1211 = new WindowBuilding3(312,540); 
    window1211.draw(g2); 
    
    WindowBuilding3 window1311 = new WindowBuilding3(312,570); 
    window1311.draw(g2); 
    
    WindowBuilding3 window1411 = new WindowBuilding3(312,600); 
    window1411.draw(g2); 
    
    WindowBuilding3 window1511 = new WindowBuilding3(312,630); 
    window1511.draw(g2); 
    
    WindowBuilding3 window2111 = new WindowBuilding3(338,510);
    window2111.draw(g2);
    
    
    WindowBuilding3 window2211 = new WindowBuilding3(338,540);
    window2211.draw(g2);
    
    
    WindowBuilding3 window2311 = new WindowBuilding3(338,570);
    window2311.draw(g2);
    
    
    WindowBuilding3 window2411 = new WindowBuilding3(338,600);
    window2411.draw(g2);
    
    
    WindowBuilding3 window2511 = new WindowBuilding3(338,630);
    window2511.draw(g2);
    
     WindowBuilding3 window3111 = new WindowBuilding3(364,510);
    window3111.draw(g2);
    
    
    WindowBuilding3 window3211 = new WindowBuilding3(364,540);
    window3211.draw(g2);
    
    
    WindowBuilding3 window3311 = new WindowBuilding3(364,570);
    window3311.draw(g2);
    
    
    WindowBuilding3 window3411 = new WindowBuilding3(364,600);
    window3411.draw(g2);
    
    
    WindowBuilding3 window3511 = new WindowBuilding3(364,630);
    window3511.draw(g2);
    
    // Windows for building 4// 
    
    WindowBuilding4 window122 = new WindowBuilding4(417,510); 
    window122.draw(g2); 
    
    WindowBuilding4 window222 = new WindowBuilding4(417,540); 
    window222.draw(g2); 
    
    WindowBuilding4 window322 = new WindowBuilding4(417,570); 
    window322.draw(g2);
    
    WindowBuilding4 window422 = new WindowBuilding4(417,600); 
    window422.draw(g2); 
    
    WindowBuilding4 window522 = new WindowBuilding4(417,630); 
    window522.draw(g2); 
    
    WindowBuilding4 window1122 = new WindowBuilding4(443,510); 
    window1122.draw(g2); 
    
    WindowBuilding4 window1222 = new WindowBuilding4(443,540); 
    window1222.draw(g2); 
    
    WindowBuilding4 window1322 = new WindowBuilding4(443,570); 
    window1322.draw(g2); 
    
    WindowBuilding4 window1422 = new WindowBuilding4(443,600); 
    window1422.draw(g2); 
    
    WindowBuilding4 window1522 = new WindowBuilding4(443,630); 
    window1522.draw(g2); 
    
    WindowBuilding4 window2122 = new WindowBuilding4(469,510);
    window2122.draw(g2);
    
    
    WindowBuilding4 window2222 = new WindowBuilding4(469,540);
    window2222.draw(g2);
    
    
    WindowBuilding4 window2322 = new WindowBuilding4(469,570);
    window2322.draw(g2);
    
    
    WindowBuilding4 window2422 = new WindowBuilding4(469,600);
    window2422.draw(g2);
    
    
    WindowBuilding4 window2522 = new WindowBuilding4(469,630);
    window2522.draw(g2);
    
     WindowBuilding4 window3122 = new WindowBuilding4(495,510);
    window3122.draw(g2);
    
    
    WindowBuilding4 window3222 = new WindowBuilding4(495,540);
    window3222.draw(g2);
    
    
    WindowBuilding4 window3322 = new WindowBuilding4(495,570);
    window3322.draw(g2);
    
    
    WindowBuilding4 window3422 = new WindowBuilding4(495,600);
    window3422.draw(g2);
    
    
    WindowBuilding4 window3522 = new WindowBuilding4(495,630);
    window3522.draw(g2);
    
    
    }
}
