package threadCommunication;

public class CarMechanic implements Runnable {
	CarQueueClass q;
	CarMechanic(CarQueueClass queue){
		this.q=queue;
		new Thread(this, "CarMechanic").start();
	}
	@Override
	public void run() {
		for(int i=0;i< 5;i++)	
		q.get();
	}
}
