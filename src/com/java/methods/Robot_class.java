package com.java.methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_class {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		Robot rb=new Robot();
		Process rt=Runtime.getRuntime().exec("calc");
		//Process process=new ProcessBuilder("C:\\Program Files\\WindowsApps\\Microsoft.WindowsCalculator_10.1902.42.0_x64__8wekyb3d8bbwe\\Calculator.exe").start();
		Thread.sleep(2500);		
		rb.keyPress(KeyEvent.VK_1);
		rb.keyPress(KeyEvent.VK_ADD);
		rb.keyPress(KeyEvent.VK_2);
		rb.keyPress(KeyEvent.VK_EQUALS);
		rb.delay(5000);
		
		
		
		
	}

}
