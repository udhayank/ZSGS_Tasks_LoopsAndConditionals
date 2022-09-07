package com.ZSGS;

public class PrintPaternWithNestedLoops {

	public static void main(String[] args) {
		
		// To print square pattern
		int n = 4;
		
		// Top half
		for (int i=1; i<=n; i++) {
						
			for(int j=1; j<i; j++) {
				System.out.print(n-j+1 + " ");
			}
			
			for (int j=i; j<=n; j++) {
				System.out.print(n-i+1 + " ");
			}
			
			for (int j=i+1; j<=n; j++) {
				System.out.print(n-i+1 + " ");
			}
			
			for(int j=n-i+1; j<n; j++) {
				System.out.print(j+1 + " ");
			}
			
			System.out.println();
			
		}
		
		// Bottom half
		for (int i=n-1; i>0; i--) {
			
			for(int j=1; j<i; j++) {
				System.out.print(n-j+1 + " ");
			}
			
			for (int j=i; j<=n; j++) {
				System.out.print(n-i+1 + " ");
			}
			
			for (int j=i+1; j<=n; j++) {
				System.out.print(n-i+1 + " ");
			}
			
			for(int j=n-i+1; j<n; j++) {
				System.out.print(j+1 + " ");
			}
			
			System.out.println();
			
		}
		

	}

}
