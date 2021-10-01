package test2.edu.home;

import java.io.File;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// bai 2 - Basic Part-I 
		int a =74, b=36;
		int sum =a+b;
		//System.out.println(sum);
		
		//bai 3 - Basic Part-I
		float x =50, y=3;
		float div =x/y;
		
		DecimalFormat df = new DecimalFormat("#.#");
		div = Float.parseFloat(df.format(div)) ;
		//System.out.println(div);
		*/
		
		/*
		//bai 4 -basic part 1
		System.out.println(8*6-5);
		System.out.println((55+9)%9);
		System.out.println((-3*5/8)+20);
		System.out.println(5 + (15 / 3 * 2) - (8 % 3));
		*/
		
		/*
		//bai 5 -basic part1
		Scanner s =new Scanner(System.in);
		System.out.print("Input first number: ");
		int iSo1 =s.nextInt();
		System.out.print("Input second number: ");
		int iSo2 =s.nextInt();
		System.out.println(iSo1*iSo2);
		*/
		
		/*
		//Bai 6 -basic part 1
		Scanner s = new Scanner(System.in);
		System.out.print("Input 1st number:");
		int iNum1 = s.nextInt();
		System.out.print("Input 2nd number:");
		int iNum2 = s.nextInt();
		System.out.println(iNum1+iNum2);
		System.out.println(iNum1-iNum2);
		System.out.println(iNum1*iNum2);
		System.out.println(iNum1/iNum2);
		System.out.println(iNum1%iNum2);
		*/
		
		/*
		//Bai 7 -basic part 1
		Scanner s =new Scanner(System.in);
		System.out.print("Input number:");
		int num = s.nextInt();
		int count =1;
		for (int i = 0; i < 10; i++) {
			int fac = num * count;
			count++;
			System.out.println(fac);
		}
		*/
		
		/*
		//Bai 8 -basic part 1
		 System.out.println("   J    a   v     v  a ");
	     System.out.println("   J   a a   v   v  a a");
	     System.out.println("J  J  aaaaa   V V  aaaaa");
	     System.out.println(" JJ  a     a   V  a     a");
		*/
		
		/*
		//Bai 9 - basic part 1
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		*/
		
		/*
		//Bai 10 - basic part 1
		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		*/
		
		/*
		//Bai 11 -basic part 1
		Scanner s = new Scanner(System.in);
		System.out.println("Radius= ");
		double radius = s.nextDouble();
		System.out.println("Perimeter is: " + (2 * Math.PI* radius));
		System.out.println("Area is: " + (Math.PI * radius* radius));
		*/
		
		/*
		//Bai 12 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.print("Input N= ");
		int n = in.nextInt();
		int sum =0;
		for (int i = 0; i <n ; i++) {
			Scanner s = new Scanner(System.in);
			System.out.print("Number = " );
			int num = s.nextInt();
			sum =sum+num;
		}
		System.out.println("Average = " + (sum/n));
		*/
		
		/*
		//Bai 13 -basic part 1
		Scanner in =new Scanner(System.in);
		System.out.println("Width= ");
		double iWidth = in.nextDouble();
		System.out.println("Height= ");
		double iHeight = in.nextDouble();
		double area = iHeight*iWidth;
		double perimeter = (iHeight+iWidth)*2;
		
		DecimalFormat df1 = new DecimalFormat("#.##");//convert double to string
		area = Double.parseDouble(df1.format(area)) ;
		System.out.println("Area = " + area);
		DecimalFormat df2 = new DecimalFormat("#.##");
		perimeter = Double.parseDouble(df2.format(perimeter)) ;
		System.out.println("Perimeter = " + perimeter);
		*/
		
		/*
		 //bAI 14 - basic part 1 
		System.out.println("==============================================");
	    System.out.println("==============================================");
	    System.out.println("==============================================");
	    System.out.println("==============================================");
	    System.out.println("==============================================");
	    System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        */
		
		/*
		//Bai 15 -basic part 1
		Scanner in =new Scanner(System.in);
		System.out.print("Num1= ");
		int iNum1 = in.nextInt();
		System.out.print("Num2= ");
		int iNum2 = in.nextInt();
		int swap =iNum1;
		iNum1 = iNum2;
		iNum2 =swap;
        System.out.println("Num1 after= " + iNum1);
        System.out.print("Num2 after= " + iNum2);
        */
		
		
		//Bai 17 - basic part 1
		Scanner in =new Scanner(System.in);
		System.out.print("Input first binary number= ");
		int iNum1 = in.nextInt();
		System.out.print("Input second binary number= ");
		int iNum2 = in.nextInt();
		System.out.println(Integer.toBinaryString(iNum1) + Integer.toBinaryString(iNum2));
        
	
		/*
		//Bai 19 -basic part 1
		Scanner in =new Scanner(System.in);
		System.out.print("Input decimal number= ");
		int iNum1 = in.nextInt();
		System.out.println("Decimal to Binary is: "+ Integer.toBinaryString(iNum1));
        */
		
		/*
		//Bai 20 -baisc part 1
		Scanner in =new Scanner(System.in);
		System.out.print("Input decimal number= ");
		int iNum1 = in.nextInt();
		System.out.println("Decimal to Hexa is:"+ Integer.toHexString(iNum1));
        */
		
		/*
		//Bai 21 -baisc part 1
		Scanner in =new Scanner(System.in);
		System.out.print("Input decimal number= ");
		int iNum1 = in.nextInt();
		System.out.println("Decimal to Octal is: " + Integer.toOctalString(iNum1));
		*/
		
		/*
		//Bai 22 -basic part 1
		String 	binaryString = new String("101");
		System.out.println("Binary to decimal: "+ Integer.parseInt(binaryString,2)); //convert binary to decimal
		*/
		
		/*
		//Bai 23 -basic part 1
		String 	binaryString = new String("1101");
		int iDecimal = Integer.parseInt(binaryString,2);//convert binary-->decimal-->hexa
		System.out.println("Binary to Hexa is:"+ Integer.toHexString(iDecimal));
		*/
		
		/*
		//Bai 24 -basic part 1
		String 	binaryString = new String("111");
		int iDecimal = Integer.parseInt(binaryString,2);//convert binary-->decimal-->Octal
		System.out.println("Binary to Octal is:"+ Integer.toOctalString(iDecimal));
		*/
		
		/*
		//Bai 25 -basic part 1
		String octalString = new String("10");
		int iDecimal = Integer.parseInt(octalString,8);
		System.out.println("Octal to Decimal is: " +iDecimal);
		*/
	
		/*
		//Bai26 -basic part 1
		String octalString = "7";
		int iDecimal = Integer.parseInt(octalString,8);
		System.out.println("Octal to Binary is: "+ Integer.toBinaryString(iDecimal));
		*/
	
		/*
		//Bai 27 -basic part 1
		String octalString = new String("100");
		int iDecimal = Integer.parseInt(octalString,8);
		System.out.println("Octal to Hexa is: " + Integer.toHexString(iDecimal));
		*/
		
		/*
		//Bai 28 -baisc part 1
		String hexaString = "25";
		System.out.println("Hexa to decimal is: "+ Integer.parseInt(hexaString,16));
		*/
		
		/*
		//Bai 29 -basic part 1
		String hexaString = new String("37");
		int iDecimal = Integer.parseInt(hexaString,16);
		System.out.println("Hexa to binary is :" + Integer.toBinaryString(iDecimal));
		*/
		
		/*
		//Bai 30 - basic part 1
		String hexaSring = "40";
		int iDecimal = Integer.parseInt(hexaSring,16);
		System.out.println("Hexa to Octal is : " + Integer.toOctalString(iDecimal));
		*/
		
		/*
		//Bai 31 - basic part 1
	    System.out.println("\nJava Version: "+System.getProperty("java.version"));
	    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
	    System.out.println("Java Home: "+System.getProperty("java.home"));
	    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
	    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
	    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	    */
		
		/*
		//Bai 32 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.print("Num1= ");
		int iNum1 = in.nextInt();
		System.out.print("Num2= ");
		int iNum2 = in.nextInt();
		System.out.println(Integer.compare(iNum1, iNum2));
		*/
		
		/*
		//Bai 33 - basic part 1
		Scanner in = new Scanner(System.in);
		System.out.print("Input Number= ");
		int iNum = in.nextInt();
		
		int sum =0;
		while(iNum!=0) {
			int iRem =iNum%10;
			sum = sum+ iRem;
			iNum = iNum/10;
		}
		System.out.println("Sum of digits: " + sum);
		*/
		
		/*
		//Bai 34 -basic part 1
		 Scanner in = new Scanner(System.in);
	     System.out.print("Input the length of a side of the hexagon: ");
	     double dSide = in.nextDouble();
	     System.out.print("Area of a side of the hexagon: " + (6*dSide*dSide)/(4*Math.tan(Math.PI/6)));
		*/
		
		/*
		//Bai 35 -basic part 1
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int iNumber = in.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double iSide = in.nextDouble();
        System.out.println("Area of the polygon is: " + (iNumber*iSide*iSide)/(4*Math.tan(Math.PI/iNumber)));
		*/
		
		/*
		//Bai 36 -basic part 1 
		Scanner input = new Scanner(System.in);
	    System.out.print("Input the latitude of coordinate 1: ");
	    double dX1 = input.nextDouble();
	    System.out.print("Input the longitude of coordinate 1: ");
	    double dY1 = input.nextDouble();
	    System.out.print("Input the latitude of coordinate 2: ");
	    double dX2 = input.nextDouble();
	    System.out.print("Input the longitude of coordinate 2: ");
	    double dY2 = input.nextDouble();
		double dRadius = 6371.01;
		System.out.println("Distance of these 2 points: " + dRadius* Math.acos(Math.sin(dX1)*Math.sin(dX2)+Math.cos(dX1)*Math.cos(dX2)*Math.cos(dY1-dY2)));
		*/
		
		/*
		//Bai 37 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.println("Input string: ");
		char[] cRev = in.nextLine().toCharArray();
		for (int i = cRev.length-1; i >=0; i--) {
			System.out.print(cRev[i]);
		}
		*/

		/*
		//Bai 38 - basic part 1
		Scanner in = new Scanner(System.in);
		System.out.println("Input string: ");
		String sTest = in.nextLine();
		count(sTest);
		 
		public static void count(String sTest) {
			char[] compute = sTest.toCharArray();
			int iLetter =0;
			int iSpace =0;
			int iNum =0;
			int iOther =0;
			for(int i=0; i<sTest.length();i++)
			{
				if(Character.isLetter(compute[i]))
					iLetter++;
				else if(Character.isSpaceChar(compute[i]))
					iSpace++;
				else if(Character.isDigit(compute[i]))
					iNum++;
				else
					iOther++;
			}
		System.out.println("Letters: " +iLetter);
		System.out.println("Space: " +iSpace);
		System.out.println("Number: " +iNum);
		System.out.println("Others: " +iOther);
		}
		*/
		
		/*
		//Bai 39 -basic part 1
		int count =0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if(i!=j && i!=k && k!=j) {
						count++;
						System.out.println(i+""+j+""+k);
					}	
				}
			}
		}
		System.out.println("Total unique number : " + count);
		*/
		
		/*
		//Bai 40 -basic part 1
		System.out.println("List of available character sets: ");  
	    for (String str : Charset.availableCharsets().keySet()) {
	      System.out.println(str);
	    }
	    */
		
		/*
		//Bai 41- basic part 1
		//Scanner in = new Scanner(System.in);
		//System.out.println("Input value :");
		//String sValue = in.next();
		int iValue = 'Z';
		System.out.println("ASCII is: " +iValue );
		*/
		
		//Bai 42 - basic part 1
		
		
		//Bai 43 -basic part 1
		/*
		   System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\n");
		*/
		
		/*
		//Bai 44 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.println("Input n =");
		int iNum = in.nextInt();
		System.out.println(iNum+(iNum*10+iNum)+(iNum*100+iNum*10+iNum));
		System.out.printf("%d + %d%d + %d%d%d",iNum,iNum,iNum,iNum,iNum,iNum);
		*/
		
		/*
		//Bai 45 -basic part 1
		System.out.println("D:\\Java_Ex  : " + new File("D:\\Java_OOP\\eclipse").length() + " bytes");
		*/
		
		/*
		//Bai 46 -basic part 1
		System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
		*/
		
		/*
		//Bai 47 -basic part 1
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
		*/
		
		/*
		//Bai 48 - basic part 1
		for(int i =1;i<=99;i++) {
			if(i %2 !=0) 
			System.out.println(i);	
		}
		*/
		
		/*
		//Bai 49 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.println("Input =");
		int iNum =in.nextInt();
		if(iNum %2 == 0)
			System.out.println("1");
		else
			System.out.println("0");
		*/
		
		/*
		//Bai 50 -basic part 1
		System.out.println("Divided by 3");
		for (int i = 1; i <100; i++) {
			if(i%3==0)
				System.out.printf("%d, ",i);
		}
		System.out.println("\nDivided by 5");
		for (int i = 1; i <100; i++) {
			if(i%5==0)
				System.out.printf("%d, ",i);
		}
		System.out.println("\nDivided by 15");
		for (int i = 1; i <100; i++) {
			if(i%15==0)
				System.out.printf("%d, ",i);
		}
		*/
		
		/*
		//Bai 51 -basic part 1
		Scanner in = new Scanner(System.in);
		String value = "200";
		System.out.println(Integer.parseInt(value));
		*/
		
		/*
		//Bai 52 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.print("First Number = ");
		int iNum1 =in.nextInt();
		System.out.print("Second Number = ");
		int iNum2 =in.nextInt();
		System.out.print("Third Number = ");
		int iNum3 =in.nextInt();
		int result = Integer.compare(iNum2+iNum1, iNum3);
		if(result == 0)
			System.out.println("true");
		*/
		
		/*
		//Bai 53 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.print("First Number = ");
		int iNum1 =in.nextInt();
		System.out.print("Second Number = ");
		int iNum2 =in.nextInt();
		System.out.print("Third Number = ");
		int iNum3 =in.nextInt();
		if(iNum3>iNum2&&iNum2>iNum1)
			System.out.println("true");
		*/
		
		/*
		//Bai 54 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.print("First Number = ");
		int iNum1 =in.nextInt();
		System.out.print("Second Number = ");
		int iNum2 =in.nextInt();
		System.out.print("Third Number = ");
		int iNum3 =in.nextInt();
		if(iNum1 % 10 == iNum2 % 10 || iNum1 % 10 == iNum3 % 10 || iNum2 % 10 == iNum3 % 10)
			System.out.println("true");
		*/
		
		/*
		//Bai 55 -basic part 1
	    Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
		int iNum = in.nextInt();
		int iSecond = iNum %60;
		int iMin = (iNum /60)%60;
		int iHour = iNum /3600;
		System.out.println(iHour+"."+iMin+"."+iSecond);
		*/

		/*
		//Bai 56 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.println("Input 3 numbers that the first < the second and the third one belongs to these arrage.");
		System.out.print("First Number = ");
		int iNum1 =in.nextInt();
		System.out.print("Second Number = ");
		int iNum2 =in.nextInt();
		System.out.print("Third Number = ");
		int iNum3 =in.nextInt();
		System.out.println(total(iNum1,iNum2,iNum3));
		int count =0;
		
//		public static int total(int iNum1, int iNum2, int iNum3){
//			if(iNum1>iNum2 || iNum3<iNum1||iNum3>iNum2) 
//				System.out.println("Incorrect condition");
//			return 0;
//			count.main();
//			for(int i=iNum1;i<=iNum2;i++) {
//				if(i%iNum3==0)
//					count++;
//			return count;
//		}
		*/
		
		/*
		//Bai 58-basic part 1
		Scanner in = new Scanner(System.in);
	    System.out.print("Input a Sentence: ");
		String line = in.nextLine();
		String upper_case_line = ""; 
	    Scanner lineScan = new Scanner(line); 
	    while(lineScan.hasNext()) {
	    	String word = lineScan.next(); 
	        upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
	    }
	      System.out.println(upper_case_line.trim()); 
		*/
		
		/*
		//Bai 59 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.print("Input uppercase string:");
		String sen = in.nextLine();
		System.out.println(sen.toLowerCase());
		*/
		
		/*
		//Bai60 -basic part 1
		Scanner in = new Scanner(System.in);
		System.out.println("Input string: ");
		String sen =in.nextLine();
		String[] words = sen.split("[ ]+");
		System.out.println("Penultimate word: "+words[words.length - 2]);
		*/
	}
}



















