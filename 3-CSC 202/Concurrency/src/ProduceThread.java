/**
 * This is my description of my ProduceThread Class. It has 1 method.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/11/2017
 */
public class ProduceThread extends Thread {

	private int index;
	private SynchQueue sq;

	public ProduceThread(int ind, SynchQueue queue) {
		this.index = ind;
		this.sq = queue;
	}
	public void run()  {
		System.out.println("Producer " + index + " started");

		while(!sq.isDone()) {
			
			int x = (int)(Math.random()*10+1);	
			if(sq.enqueue(x)==false) {
				break;
			}

		System.out.println("Producer " + index + " added @ " + sq.getlast() + " ... " +  x +", queue size is " + sq.size());
		}
		try{
			this.sleep((int)Math.random() *1000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());

		}

	}

}//class
