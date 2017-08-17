import java.util.Scanner;



public class BubSrt {
	public static void bubbleSort(int arr[]){
		int n = arr.length;
		int g = 0;
		int h = 0;
		int c=0;
		while(g!=h+n){
			if(c!=n-1){
			if(arr[c]>arr[c+1]){
				int temp = arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
				g++;
			}
			}
			h++;
			if(c==n-1){
				c=0;
			}
			else{
			c++;
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			bubbleSort(arr);
			for(int i=0;i<n;i++){
				System.out.println(arr[i]);
				
			}
			}
	}


