/**
 * Let's imagine a more complication situation where once again, like part 1, we
 * have multiple calculations that should run in parallel. However, now a
 * calculation the requires 4 steps. Step 1 must be finished before steps 2A &
 * 2B start. Step 2A & 2B can be run in parallel. Step 3 can only start after
 * both Steps 2A & 2B finish.
 *
 * Solution? Threads that while running, thread other threads to do part of the
 * work!
 * 
 * You'll probably want to reuse your inner class from Part 1, but you'll also
 * need a new inner class for this one.
 * 
 * If you do this correctly, running a single job should look like this:
 * 
 * Starting Buffalo job Step 1 Finishing Buffalo job Step 1 Starting Buffalo job
 * Step 2A Starting Buffalo job Step 2B Finishing Buffalo job Step 2A Finishing
 * Buffalo job Step 2B Starting Buffalo job Step 3 Starting Buffalo job Step 3
 * 
 * Running 2 jobs should look something like this:
 * 
 * Starting Job 2 Part 1 Starting Job 1 Part 1 Finishing Job 2 Part 1 Finishing
 * Job 1 Part 1 Starting Job 2 Part 2A Starting Job 2 Part 2B Starting Job 1
 * Part 2A Starting Job 1 Part 2B Finishing Job 1 Part 2B Finishing Job 2 Part
 * 2A Finishing Job 1 Part 2A Finishing Job 2 Part 2B Starting Job 1 Part 3
 * Starting Job 2 Part 3 Finishing Job 2 Part 3 Finishing Job 1 Part 3
 * 
 * @author hewner. Created Nov 7, 2016.
 */
public class Part2 {

	public void runCalculations() {
		Job job11 = new Job("Job 1 Part 1");
		Job job12 = new Job("Job 2 Part 1");
		Thread t1 = new Thread(job11);
		Thread t2 = new Thread(job12);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			Job job2a1 = new Job("Job 1 Part 2A");
			Job job2a2 = new Job("Job 2 Part 2A");
			Job job2b1 = new Job("Job 1 Part 2B");
			Job job2b2 = new Job("Job 2 Part 2B");
			Thread t3 = new Thread(job2a1);
			Thread t4 = new Thread(job2a2);
			Thread t5 = new Thread(job2b1);
			Thread t6 = new Thread(job2b2);
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		Job job31 = new Job("Job 1 Part 3");
		Job job32 = new Job("Job 2 Part 3");
		Thread t7 = new Thread(job31);
		Thread t8 = new Thread(job32);
		t7.start();
		t8.start();

		//
		// Calculation.doCalculation("Job 1 Part 1");
		// Calculation.doCalculation("Job 1 Part 2A");
		// Calculation.doCalculation("Job 1 Part 2B");
		//
		// Calculation.doCalculation("Job 2 Part 1");
		// Calculation.doCalculation("Job 2 Part 2A");
		// Calculation.doCalculation("Job 2 Part 2B");
	}

	public static void main(String[] args) {
		// not doing the work in main to make it easier
		// to use inner classes
		Part2 p = new Part2();
		p.runCalculations();

	}

	public class Job implements Runnable {

		private String name;

		public Job(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			Calculation.doCalculation(this.name);
		}
	}
}
