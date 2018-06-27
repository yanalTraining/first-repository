

public class Test {

	public static void main(String[] args) {
		int[] a = { 5, 5, 6, 6, 7, 7, 8, 8, 9, 9 };
		MyArray array=new MyArray(a);
		array.printArray();
		System.out.println("the minimum is " + array.min());
		System.out.println("the maximum is " + array.max());
		System.out.println("the standerd deviation is " + array.standerDeviation());
		System.out.println("the average is " + array.average());
		System.out.println("the mod is " + array.mode());
		System.out.println("size of array is " + array.getsize());
	}

}
