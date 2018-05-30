/**
 * This class runs the SumArrayInParallel application.
 * 
 * @author wilkin. Updated by defoe on Nov 9, 2015
 *
 */
public class Main {

	public static int[] dataToSum;

	public static void main(String[] args) {
		int n = 200000000;
		int numThreads = 4;
		long startTime = System.currentTimeMillis();
		setData(n);
		long endTime = System.currentTimeMillis();

		System.out.println("Done creating array, took " + (endTime - startTime) + " ms");
		System.out.flush();

		startTime = System.currentTimeMillis();
		long c = sumSerial(dataToSum);
		endTime = System.currentTimeMillis();

		System.out.println("Done summing array serially, took " + (endTime - startTime) + " ms");
		System.out.flush();

		// TODO Create sumParallel and call it here
		startTime = System.currentTimeMillis();
		long d = sumParallel(dataToSum, numThreads);
		endTime = System.currentTimeMillis();

		System.out.println("Done summing array parallelly, took " + (endTime - startTime) + " ms");
		System.out.flush();

		System.out.println(c);
		System.out.println(d);

	}

	public static void setData(int n) {
		dataToSum = new int[n];
		for (int i = 0; i < n; i++) {
			double randSign = Math.random();
			double randVal = Math.random();
			int sign = (randSign < 0.5) ? -1 : 1;
			dataToSum[i] = (int) (randVal * n) * sign;
		}
	}

	public static long sumSerial(int[] data) {
		long result = 0;
		for (int i = 0; i < data.length; i++)
			result += data[i];
		return result;
	}

	public static long sumParallel(int[] data, int numThreads) {
		long result = 0;
		SumThread[] threads = new SumThread[numThreads];
		Thread[] threadObjects = new Thread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			threads[i] = new SumThread(data, data.length * i / numThreads, data.length * (i + 1) / numThreads);
			threadObjects[i] = new Thread(threads[i]);
			threadObjects[i].start();
		}
		for (int i = 0; i < numThreads; i++) {
			try {
				threadObjects[i].join();
				result += threads[i].getSum();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	// TODO Create a sumParallel method that takes in the
	// data array and the number of threads to use

}
