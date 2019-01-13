/**
 * This is my description of my SynchQueue Class. It is used by both Consumer and Produce threads.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/11/2017
 */
public class SynchQueue {

	private int[] data;
	private int last;
	private boolean done;

	public SynchQueue() {
		done = false;
		data = new int[10];
		last = -1;
	}
	public synchronized int size() {
		return last+1;
	}
	public boolean isFull() {
		if(size() == data.length) {
			return true;
		}
		return false;
	}
	public synchronized boolean enqueue(int datum) {
		if(isFull()) {
			return false;
		}
		data[++last] = datum;
		return true;
	}
	public synchronized int dequeue() {
		if(last == -1) {
			return -1;
		}
		int temp = data[0];
		for(int i=1; i<=last; i++)
			data[i-1] = data[i];
		last--;
		return temp;	
	}
	public boolean isDone() {
		return done;
	}
	public void shutDown() {
		done = true;
	}
	public synchronized int getlast() {
		return last;
	}

}//class
