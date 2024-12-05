/*
 * Written By Samirah Anderson
 */

import java.util.Scanner;

public class SortRectangle {

	public static void main(String[] args) {
		//this is to create the size of the array
		Scanner k = new Scanner(System.in);

		System.out.println("Enter the amount of rectangles:");

		int size = k.nextInt();
		double[]array = new double[size];
		System.out.println("First you will type the lengths of all rectangles than the width..."+"\n");

		//this is so that the user can input the lengths of each rectangle
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Insert the length "+(i+1)+": ");
			double length1 =k.nextDouble();
			//			k.next();
			array[i]=length1;
		}

		//this is so that the user can insert the widths of each rectangle
		double[] width = new double[size];
		for(int i=0; i<width.length; i++)
		{
			System.out.println("Insert the width "+(i+1)+": ");
			double width2 =k.nextDouble();
			width[i]=width2;
		}

		//this is the array that calculates the area of each rectangle
		double []area = new double [size];
		for(int i=0; i<area.length; i++)
		{
			//			System.out.println("The area is: "+ area1);
			double area1 = width[i]*array[i];
			area[i] = area1;
			System.out.println("The area is: "+ area1);

		}
		
		//so that the user knows they'll be prompted with the options again unless they select quit
		System.out.println("\n");
		System.out.println("You will be able to do all options with the same data"+"\n"+"type 6 to quit!");
		
		//i did the do while loop so that it would repeat the options
		//as well as give me the option to break when the user selects 6
		do
		{
			System.out.println("\n");
			System.out.println("Choose the number you would like to do: ");
			System.out.println("1. Sort smallest to largest"+"\n"+
					"2. Sort largest to smallest"+"\n"+
					"3. Get maximum area"+"\n"+
					"4. Get minimum area"+"\n"+
					"5. Get average area"+"\n"+
					"6. Quit program");

			int choice = k.nextInt();
			
			//for each choice i did an if statement
			if(choice == 1)
			{
				//I honestly still struggle with understanding bubble sort
				//but this as well as option 2 are to sort them in order
				boolean hasSwapped = false;

				do 
				{

					
					hasSwapped=false;
					for(int i=0; i<area.length-1;i++) 
					{
						if(area[i]>area[i+1])
						{
							hasSwapped=true;
							double rectArea = area[i];
							area[i]=area[i+1];
							area[i+1]=rectArea;
						}
					}
				}while(hasSwapped);

				
				for(int i=0;i<area.length;i++)
				{
					System.out.println(area[i]);
				}
			}

			//same as choice 1
			if(choice==2)
			{
				
				boolean hasSwapped = false;

				do 
				{

					//int[] array2 = new int [length];
					hasSwapped=false;
					for(int i=0; i<area.length-1;i++) 
					{
						if(area[i]<area[i+1])
						{
							hasSwapped=true;
							double rectArea = area[i];
							area[i]=area[i+1];
							area[i+1]=rectArea;
						}
					}
				}while(hasSwapped);

				
				for(int i=0;i<area.length;i++)
				{
					System.out.println(area[i]);
					
				}
			}
			
			//this one is to determine the max; I also struggle with understanding the code for this
			if(choice==3)
			{

				double max = area[0]; 
				for(int i=1;i<area.length;i++)
				{
					if(area[i] > max)
					{
						max = area[i];
					}
				}

				System.out.println(max);

			}
			
			//same as 3 but for the min
			if(choice==4)
			{
				double min = area[0]; 
				for(int i=1;i<area.length;i++)
				{
					if(area[i] < min)
					{
						min = area[i];
					}
				}

				System.out.println(min);

			}
			
			//this is for the average area which i just created a total
			//and then divided that by whatever the user made the size
			if(choice==5)
			{
				double total= 0.0;
				for(int i=0; i<area.length;i++)
				{
					total=area[i]+total;
					//				
				}
				System.out.println("the average area is: "+total/size);
			}
			
			//this is to quit 
			if(choice==6)
			{
				System.out.println("Goodbye");
				break;
			}
			
			//this is if the user chooses anything but the choices
			if(choice>6 || choice<1)
			{
				System.out.println("That option is invalid, choose again...");

			}



		}while(true);
	}

}
