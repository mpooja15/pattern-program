package Prog;
import java.util.*;

public class hallow {
 public static void main(String[]args) {
	 //int i, j, k;
	 for(int i=1;i<=5;i++) {
		 for(int k=1;k<=5;k++) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=5;j++) {
			 if(i==1 || i==5||j==1||j==5) {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
 }
 
}
