public class BubbleSort{

	public void sort(int[]arr){
		for(int i = 0 ; i < arr.length - 1 ; i++){
			for(int j = 0 ; j < arr.length - 1 - i ; j++){
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
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
		int[]arr = {23,45,61,2,4,1,98};

		BubbleSort bs = new BubbleSort();

		System.out.println("Before Sorting");
		bs.print(arr);

		bs.sort(arr);

		System.out.println("After Sorting");
		bs.print(arr);
	}
}