public class SelectionSort{

	public void sort(int[]arr){
		for(int i = 0 ; i < arr.length - 1 ; i++){
			int minIndex = i;
			for(int j = i + 1 ; j < arr.length ; j ++){
				if(arr[j] < arr[minIndex]){
					int temp = arr[j];
					arr[j] = arr[minIndex];
					arr[minIndex] = temp;
				}
			}
		}
	}
	public void print(int[]arr){
		for(int num : arr){
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[]args){
		int[]arr = {23,45,12,6,24,56};

		SelectionSort se = new SelectionSort();

		System.out.println("Before");
		se.print(arr);

		se.sort(arr);
		System.out.println("After");
		se.print(arr);
	}
}






