import java.util.Scanner;
import java.io.*;

public class Histogram
{
	public static String astCounter(int count){
		String result = "";
		for(int i = 0; i < count;i++){
			result = result + "*";
		}
		return result;
	}


    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("histogram.txt"));
        int astArray[];
        astArray = new int[10];

        while (scan.hasNextInt()){
        	int x = scan.nextInt();
        	if(x >= 1 && x <= 10){
        		astArray[0]++;
        	}
        	else if(x >= 11 && x <= 20){
        		astArray[1]++;
        	}
        	else if(x >= 21 && x <= 30){
        		astArray[2]++;
        	}
        	else if(x >= 31 && x <= 40){
        		astArray[3]++;
        	}
        	else if(x >= 41 && x <= 50){
        		astArray[4]++;
        	}
        	else if(x >= 51 && x <= 60){
        		astArray[5]++;
        	}
        	else if(x >= 61 && x <= 70){
        		astArray[6]++;
        	}
        	else if(x >= 71 && x <= 80){
        		astArray[7]++;
        	}
        	else if(x >= 81 && x <= 90){
        		astArray[8]++;
        	}
        	else if(x >= 91 && x <= 100){
        		astArray[9]++;
        	}
        }
        System.out.println("1-10    |" + astCounter(astArray[0]));
        System.out.println("11-20   |" + astCounter(astArray[1]));
        System.out.println("21-30   |" + astCounter(astArray[2]));
        System.out.println("31-40   |" + astCounter(astArray[3]));
        System.out.println("41-50   |" + astCounter(astArray[4]));
        System.out.println("51-60   |" + astCounter(astArray[5]));
        System.out.println("61-70   |" + astCounter(astArray[6]));
        System.out.println("71-80   |" + astCounter(astArray[7]));
        System.out.println("81-90   |" + astCounter(astArray[8]));
        System.out.println("91-100  |" + astCounter(astArray[9]));
        }
    }