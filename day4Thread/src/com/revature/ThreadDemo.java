package com.revature;

public class ThreadDemo implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread myThread = new Thread("thread1");
		Thread myRunnableThread = new Thread(new ThreadDemo());
		
		myThread.setPriority(4);
		myThread.setDaemon(true);
		myThread.interrupt();
		System.out.println(myThread.getName());
		System.out.println(myThread.getId());
		System.out.println(myThread.getPriority());
		System.out.println(myThread.isAlive());
		myRunnableThread.start();
		System.out.println(myRunnableThread.getName());
		System.out.println(myRunnableThread.getId());
		System.out.println(myRunnableThread.getPriority());
		System.out.println(myRunnableThread.isAlive());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running!!!!");
	}

}
