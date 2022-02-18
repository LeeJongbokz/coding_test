import java.util.*;
class Main {	
	public int[] solution(int n, int[] arr){
		
        for(int i=0; i<n; i++){
          
          int min = arr[i];
          int minIdx = i;
          
          for(int j=i+1; j<n; j++){
              if(arr[j] < min){
                min = arr[j]; 
                minIdx = j; 
              }
          }
          
          int temp = arr[i];
          arr[i] = min;
          arr[minIdx] = temp;
          
        }
     
		return arr;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}
