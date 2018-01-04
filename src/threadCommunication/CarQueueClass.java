package threadCommunication;

public class CarQueueClass {
	int n;
	boolean mechanic_available = false;

	synchronized int get() {
		if (!mechanic_available)
			try {
				// the wait() method puts a thread in the waitinig
				// for pool from running state.
				wait(5000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Got Request for Car Service: " + n);
		mechanic_available = false;
		// the notify() method is used to send a signal to one and
		// only one of the threads that are waiting in that same
		// object's waiting pool
		notify();
		return n;
	}

	synchronized void put(int n) {
		if (mechanic_available)
			try {
				wait(5000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		mechanic_available = true;
		System.out.println("Put Request for Car Service: " + n);
		notify();
	}

}
