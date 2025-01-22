package com.multithreading;

class Captain extends Thread{
	@Override
	public void run() {
		try {
			BattingCoach ba = new BattingCoach();
			ba.setName("BAC");
			
			BowlingCoach bo = new BowlingCoach();
			bo.setName("BOC");

			ba.setDaemon(true);
			bo.setDaemon(true);
			
			ba.start();
			bo.start();
			
			System.out.println("Captain goes to ground");
			Thread.sleep(3000);
			System.out.println("Captain will do warm-up");
			Thread.sleep(3000);
			System.out.println("Captain will do catching practice");
			Thread.sleep(3000);
			System.out.println("Captain will do batting practice");
			Thread.sleep(3000);
			System.out.println("Captain will do bowling practtice");
			Thread.sleep(3000);
			System.out.println("Captain will go to Hotel");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class BattingCoach extends Thread{
	@Override
	public void run() {
		for(;;) {
			System.out.println("BattingCoach is in the ground");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class BowlingCoach extends Thread{
	@Override
	public void run() {
		for(;;) {
			System.out.println("BowlingCoach is in the ground");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class DeamonThread {
	public static void main(String[] args) {
		Captain c = new Captain();
		c.setName("CAPTAIN");
		c.start();
	}

}
