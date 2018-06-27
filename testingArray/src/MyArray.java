
public class MyArray {
	 int []array = new int[10];

	public MyArray() {
		super();
	}
	public MyArray(int[]array ){
		this.array=array;
	}

	public int min() {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];

			}
		}
		return min;
	}

	public int max() {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public double average() {
		int sum = 0;
		double mean;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		mean = sum / array.length;
		return mean;
	}

	public double standerDeviation() {
		double s = 0;
		double sum = 0;
		double average = average();
		for (int i = 0; i < array.length; i++) {
			sum += Math.pow(array[i] - average, 2);
		}
		s = Math.sqrt(sum / array.length);
		return s;
	}

	public double mode() {
		int[] max = new int[array.length];
		int num;
		int max1 = max[0];
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			num = array[i];
			for (int j = 0; j < array.length; j++) {
				if (num == array[j]) {
					max[i]++;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (max[i] > max1) {
				max1 = max[i];
				x = i;
			}
		}
		return array[x];
	}

	public void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("the element"+(i+1)+"  "+ array[i]);
		}
	}

	public int getsize() {
		return array.length;
	}
}
