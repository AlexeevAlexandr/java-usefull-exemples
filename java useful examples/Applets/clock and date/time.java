import java.util.Date;
import java.text.SimpleDateFormat;

import java.awt.*;
import java.applet.*;
/*
<applet code="time" width=300 height=100>
</applet>
*/

public class time extends Applet implements Runnable{
	Thread t;
	boolean stopFlag;

	public void init(){
		t=null;
		}
	public void start(){
		t=new Thread(this);
		stopFlag=false;
		t.start();
		}
	public void run(){
		for( ; ; ){
			try{
				repaint();
				Thread.sleep(100);
				if(stopFlag) break;
				}
			catch (InterruptedException exc){}
			}
		}
	public void stop(){
		stopFlag=true;
		t=null;
		}

	public void paint(Graphics g){
	
		Date d = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
		
		
		
		
		g.drawString(format1.format(d), 20, 20);
		
		
		
		}

}
