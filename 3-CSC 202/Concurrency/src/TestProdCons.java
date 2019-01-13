/**
 * This is my description of my TestProdCons Class. It determines if my ConsumerThreads and ProduceThreads are running properly.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 10/11/2017
 */
import java.util.*;

public class TestProdCons extends Thread {

	public static void main(String[] args) throws InterruptedException  {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter two arguements for ProducerThreads & ConsumerThreads respectively");
		int a = input.nextInt();
		int b = input.nextInt();

		List<Thread> threads = new ArrayList<Thread>();

		SynchQueue queue = new SynchQueue();


		for(int i=1;i<=a;i++) {

			ProduceThread t = new ProduceThread(i,queue);
			t.start();
			threads.add(t);
		}
		for(int i=1;i<=b;i++) {
			ConsumerThread t = new ConsumerThread(i,queue);
			t.start();
			threads.add(t);
		}

		sleep(3000);

		queue.shutDown();

		for(Thread t: threads) t.join();

		System.out.println("Main program exiting after joining threads");
	}

}
