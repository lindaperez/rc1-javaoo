package MyContributions;
import processing.core.PApplet;
import java.time.*;
import processing.core.PImage;
/** Second Week using GUI libraries like Processing 
 * 
 * @author Roslindapp
 *
 */

public class SunCycle extends PApplet {
	PImage img=null;
	
	public void settings(){
		//specify size of applet 
		size(600,400);
	}
	public void setup(){
		//load image
		 img = loadImage("../../data/palmTrees.jpg");
		 //resize image
		 img.resize(600, 400);
		
		
	}
	
	public void draw(){
		// set an image 
		image(img,0,0);
		//draw a circle
		ellipse(100,80,80,80);
		//fill color
		//change color according to time
		int s=0,c=0;
		while(c<=10){
			fill(255,255,(s+15)*3);
			s=LocalTime.now().getSecond();
			repaint();
			c++;
		}
	}
}
