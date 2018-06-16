package src;
import java.util.Scanner;

public class Sorting_Demo {
	public static void main(String[] args){
	int[] a = {4,3,2,1};
	Scanner sc = new Scanner(System.in);
	System.out.println("Select 1. Bubble Sort 2. Merge Sort 3. Quick Sort");
	int choice = sc.nextInt();
	
	 if(choice ==1){
	Bubble_Sort bubblesort = new Bubble_Sort();
	int b[] = bubblesort.sort(a);
	for(int i = 0; i<b.length;i++){
		System.out.print(b[i]+" ");
	}
	}
	else if(choice ==2){
	Merge_Sort mergesort= new Merge_Sort();
	mergesort.sort(a,0,a.length-1);
	
	for(int index=0;index<a.length;index++){
		System.out.print(a[index]+" ");
	}
	}
	
	if(choice == 3){
	Quick_Sort quicksort= new Quick_Sort();
	quicksort.sort(a,0,a.length-1);
	
	for(int index=0;index<a.length;index++){
		System.out.print(a[index]+" ");
	}
	
	}
	}
}
