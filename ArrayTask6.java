public class ArrayTask6{
	public static void main(String[] args){
		int[] array = {7,12,26,34,51};
		int min = array[0];
		int max = array[array.length-1]; 
		int res;
		for (int i = 0; i < array.length; i++) {
			if(min <= array[i])
				continue;
			else{ 
				min = array[i];
			}				
		}
		for (int i = 0; i < array.length; i++) {
			if(max >= array[i])
				continue;
			else{ 
				max = array[i];
			}				
		}
		res = max - min + 1;
		System.out.println("Наименьшая длина числовой оси, содержащей все элементы массива - "+res);		
	}
}