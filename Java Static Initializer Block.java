import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static Scanner sc = new Scanner(System.in);
public static int B = sc.nextInt();
public static int H = sc.nextInt();
public static boolean flag = init2();


public static boolean init2(){
    if(B<=0 || H<=0){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        return false;
    }
    return true;
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

