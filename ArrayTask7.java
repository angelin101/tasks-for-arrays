public class ArrayTask7{
	public static void main(String[] args) {
		int[] array = {2, 6, 17, 23, 21, 34, 7, 26, 3};
		int MAX = 15;
		int change = 0;
			for (int i = 0; i < array.length; i++) 
				if (array[i] >= MAX){ 
					array[i] = MAX;// array[i] = (array[i] >= MAX) ? MAX : array[i];
					change++; 	
				}
			for (int i = 0; i < array.length; i++)
				System.out.print(array[i]+" ");
			System.out.println("Колличество замен - "+change);
	}
}