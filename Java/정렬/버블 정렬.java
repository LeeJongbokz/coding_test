// 왜 틀렸는가?

import java.util.*;

public class Main {	
	public int[] solution(int n, int[] arr){
		
        for(int i=0; i<arr.length; i++){
          
            for(int j=i+1; j<arr.length; j++){
                 if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                 }
            }
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
