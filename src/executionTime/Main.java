package executionTime;

public class Main {

	public static void main(String[] args) {

		long start = System.nanoTime();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long duration = (System.nanoTime() - start) / 1000000;

		System.out.println(duration + " ms");
	}
}
