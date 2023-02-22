package Robot_ClassEX;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robot_class_Example {

	public static void main(String[] args) throws Exception {
		String command = "notepad.exe";   
		Runtime run = Runtime.getRuntime();   
		run.exec(command);   
		try   
		{   
		//delay 4ms  
		Thread.sleep(4000);   
		}   
		catch (InterruptedException e)   
		{   
		// TODO Auto-generated catch block   
		e.printStackTrace();   
		}   
		//creating a constructor of the Robot class  
		Robot robot = new Robot();   
		//pressing key by invoking the keyPress() method  
		robot.keyPress(KeyEvent.VK_W);   
		//delay of 5 miliseconds after each key press  
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_E);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_L);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_C);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_O);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_M);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_E);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_SPACE);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_T);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_O);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_SPACE);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_M);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_Y);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_W);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_O);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_R);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_L);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_D);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_SPACE);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_S);   
		Thread.sleep(500);   
		robot.keyPress(KeyEvent.VK_S);   
		Thread.sleep(500);   

	}

}
