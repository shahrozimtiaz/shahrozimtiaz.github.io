/**
 * This is my description of my ConsumerThread Class. It has 1 method and 1 helper method.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/11/2017
 */
public class ConsumerThread extends Thread {

	private int index;
	private SynchQueue sq;

	public ConsumerThread(int ind, SynchQueue queue) {
		this.index = ind;
		this.sq = queue;
	}
	public void run() {
		System.out.println("Consumer " + index + " started");

		while(!sq.isDone()) {
			int rt = sq.dequeue();
			if(rt!=-1) {
				int frt = factorial(rt);
				System.out.println("Consumer " + index + " removed " + rt +", computed " + rt + "! = " + frt);
			}

		}
		try{
			this.sleep((int)Math.random() *1000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}


	}
	public static int factorial(int x) {
		if(x<=0) return 1;
		x = x * factorial(x-1);
		return x;
	}
}//class
