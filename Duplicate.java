public class Duplicate{
	public static void main(String[] args){
		
		int[] arr={10,2,3,4,5,7,6,9,10,4};
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
			if(arr[i]==arr[j])
			System.out.println(arr[i]);
			}
		}
	}	
}