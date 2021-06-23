import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

interface Printable{  
public void print(); 
}  
		final class variance extends LR{   //INHERITANCE
			private double sum_x=0;
			private  double sum_y=0;
		
			void 	 mean1 (double x[],double y[])
			{
			for (int i=0;i<n;i++)
				{
				sum_x+=x[i];
				sum_y+=y[i];
				}
			 avgx=sum_x/n; 
			avgy=sum_y/n;
			//System.out.println(avgx);
			//System.out.println(avgy);
			}	
			void mean1 (int x[],double y[])
			{
			for (int i=0;i<n;i++)
				{
				sum_x+=x[i];
				sum_y+=y[i];
				}
			 avgx=sum_x/n;
			avgy=sum_y/n;
			//System.out.println(avgx);
			//System.out.println(avgy);
			}
			void variance1 (double x[],double y[]) {
			
			for(int i=0;i<n;i++) 
			 Sx_1+=((x[i]-avgx)*(x[i]-avgx));
			 Sy_1+=((y[i]-avgy)*(y[i]-avgy));
				
		//System.out.println(Sx_1);
		     Sx=Math.sqrt(Sx_1/(n-1));
		     Sy=Math.sqrt(Sy_1/(n-1));
		      //System.out.println(Sx);
		 }
		 void variance1 (int x[],double y[]) {
				for(int i=0;i<n;i++) {
				 Sx_1+=((x[i]-avgx)*(x[i]-avgx));
				 Sy_1+=((y[i]-avgy)*(y[i]-avgy));
				}	
				//System.out.println(Sx_1);
			     Sx=Math.sqrt(Sx_1/(n-1));
			     Sy=Math.sqrt(Sy_1/(n-1));
			     // System.out.println(Sx);
			       r1=Sx/Sy;
				
		 }
			       void	b1(double x[],double y[]){
			    	   b=r*(Sy/Sx);
					  // System.out.println(b);
					  // System.out.println(Sy);
					  // System.out.println(Sx);
					   }
				  
		void	b1(int x[],double y[]){
					   b=r*(Sy/Sx);
					  // System.out.println(b);
					  // System.out.println(Sy);
					  // System.out.println(Sx);
					   }
		
	void a(double x[],double y[]) {
			   a=avgy-b*avgx;
			   ///System.out.println(a);
		   }
		void a(int x[],double y[]) {
			   a=avgy-b*avgx;
			  // System.out.println(a);
		  }
		private double r_1;
		private  double r_2;
	 void r(double x[],double y[]) {
				   for( i=0;i<n;i++) 
				   r_1+=((x[i]-avgx))*(y[i]-avgy);
				   r_2=Math.sqrt(Sx_1*Sy_1);
				   r=r_1/r_2;
				  // System.out.println(r);
				  
			 }
			 void r(int x[],double y[]) {
					   for( i=0;i<n;i++) 
					   r_1+=((x[i]-avgx))*(y[i]-avgy);
					   r_2=Math.sqrt(Sx_1*Sy_1);
					   r=r_1/r_2;
					   //System.out.println(r);
				   }
		}
		
public class LR implements Printable {
	
protected static int n;         ///ENCAPTULATION
	  Integer  i=0;            ///WRAPPER CLASSES
	  Double avgx=0.0;        
	 Double avgy=0.0;
static Double Sx_1=0.0;      ///NON ACCESS MODIFIER
	  static  Double Sy_1=0.0;
public Double Sx;
public Double Sy;
public Double r;
public static  Double b=0.0;
	static Double a=0.0;
	static Double skinconductance=0.0;
	static Double heartrate=0.0;
	static Integer v=0;
	double r1=0.0;
	static String space;
	
void length_array(double x[],double y[])
		{
			 n=x.length;
			 //POLYMORPHISM

	}
void length_array(int x[],double y[])
{
	 n=x.length;
	 //POLYMORPHISM

}
public void print() {
	System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT + " ⃝  ⃝  ⃝  ⃝        ⃝  ⃝  ⃝  ⃝        ⃝  ⃝  ⃝  ⃝       ");
	System.out.print(ConsoleColors.WHITE_BRIGHT + ConsoleColors.YELLOW_BOLD_BRIGHT +"⃝  ⃝  ⃝  ⃝ ");
	System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT + ConsoleColors.TEAL_BACKGROUND + " WELCOME TO LIE DETECTOR ");
	System.out.print(ConsoleColors.WHITE_BRIGHT + ConsoleColors.YELLOW_BOLD_BRIGHT +" ⃝  ⃝  ⃝  ⃝");
	System.out.println("      ⃝  ⃝  ⃝  ⃝      ⃝  ⃝  ⃝  ⃝      ⃝  ⃝  ⃝  ⃝");
}


public static void main(String[] args) throws InputMismatchException, IOException {
	 int count2=0;//ERROR COUNTERS
	 int count1=0;
	 int count=0;
	 int count21=0;
	 int count11=0;
	
	LR obj8=new LR();
	 obj8.print();///INTERFACE
	 
	Scanner f=new Scanner(System.in);
	System.out.println(ConsoleColors.FOREST_GREEN + " Enter 1 if you wanna use the preset defined values \n Enter 2 for try experimenting with newset of data:");
	int A=f.nextInt();
	
	switch(A){	
case 1: 
			   Scanner factor=new Scanner(System.in);
			    System.out.println( ConsoleColors.WHITE_BRIGHT + ConsoleColors.RED_ITALIC+ "\n❤ Enter Heartrate:");
			    try {
				heartrate=factor.nextDouble();
			    }
				catch (InputMismatchException e1) {
					System.out.println(ConsoleColors.PURPLE + "Your selection should be an integer so the default value is being kept");
					 
					count2++;
					//System.out.println(count2);
				}
				
				try {
					System.out.println(ConsoleColors.CYAN_ITALIC + "\n✐ Enter Skin Conductance:");
				skinconductance= factor.nextDouble();
				}
				
				catch (InputMismatchException e2) {
					//System.out.println(ConsoleColors.PURPLE + "Your selection should be an integer so the default value is being kept");
					count1++;
					//System.out.println(count1);
				}
			    
				
				try {
					System.out.print(ConsoleColors.LIGHT_PINK + "\n☞ Choose ");
					System.out.print(ConsoleColors.RED_ITALIC + "1");
					System.out.println(ConsoleColors.LIGHT_PINK + " if the age is between 6 to 15 years");	
					System.out.print(ConsoleColors.LIGHT_PINK + "☞ Choose ");
					System.out.print(ConsoleColors.RED_ITALIC + "2");
					System.out.println(ConsoleColors.LIGHT_PINK + " if the age is between 15 to 60");
					System.out.print(ConsoleColors.LIGHT_PINK + "☞ Choose ");
					System.out.print(ConsoleColors.RED_ITALIC + "3");
					System.out.println(ConsoleColors.LIGHT_PINK + " if the age is above 60");
					v=factor.nextInt();
				}
				catch (InputMismatchException e) {
					//System.out.println(ConsoleColors.PURPLE + "Your selection should be an integer so the default value is being kept ");
				count++;
					//System.out.println(count);
				}
					
				finally {
					
					do  {
						if(count2>0) {
							heartrate=100.00; 
							System.out.println(ConsoleColors.RED_UNDERLINED  +ConsoleColors.RED_BOLD + "\n✐ Since you gave wrong input , the particular value has been set to default ,you are given a chance again be carfull!!!!!!:");
							Scanner h1= new Scanner(System.in);
							System.out.println(ConsoleColors.ERASE +ConsoleColors.CYAN_ITALIC +"\n✐ Enter Skin Conductance:");
							skinconductance= h1.nextDouble();
							System.out.print(ConsoleColors.LIGHT_PINK + "\n☞ Choose ");
							System.out.print(ConsoleColors.RED_ITALIC + "1");
							System.out.println(ConsoleColors.LIGHT_PINK + " if the age is between 6 to 15 years");	
							System.out.print(ConsoleColors.LIGHT_PINK + "☞ Choose ");
							System.out.print(ConsoleColors.RED_ITALIC + "2");
							System.out.println(ConsoleColors.LIGHT_PINK + " if the age is between 15 to 60");
							System.out.print(ConsoleColors.LIGHT_PINK + "☞ Choose ");
							System.out.print(ConsoleColors.RED_ITALIC + "3");
							System.out.println(ConsoleColors.LIGHT_PINK + " if the age is above 60");
							v=h1.nextInt();
						
						}
						if(count1>0&&count2==0) {
							skinconductance=2600.00;
							System.out.println(ConsoleColors.RED_UNDERLINED  +ConsoleColors.RED_BOLD + "\n✐ Since you gave wrong input , the particular value has been set to default ,you are given a chance again be carfull!!!!!!:");
							System.out.print(ConsoleColors.LIGHT_PINK + "\n☞ Choose ");
							System.out.print(ConsoleColors.RED_ITALIC + "1");
							System.out.println(ConsoleColors.LIGHT_PINK + " if the age is between 6 to 15 years");	
							System.out.print(ConsoleColors.LIGHT_PINK + "☞ Choose ");
							System.out.print(ConsoleColors.RED_ITALIC + "2");
							System.out.println(ConsoleColors.LIGHT_PINK + " if the age is between 15 to 60");
							System.out.print(ConsoleColors.LIGHT_PINK + "☞ Choose ");
							System.out.print(ConsoleColors.RED_ITALIC + "3");
							System.out.println(ConsoleColors.LIGHT_PINK + " if the age is above 60");
							Scanner h= new Scanner(System.in);
							v=h.nextInt();
							
						}
						if(count>0&&count1==0&&count2==0) {
							 v=2;
							 
						}
						
					switch(v) {
					   case 1:
						 {
							 double[] y1 = {750,2135,55,3258,3103,440,55,136,4429};//skin conductance
								double[] x1 = {83.109,94.749,81.793,107.724,92.316,88.1523,83.801,78.1123,104.263};  //heart rate
								 
								LR obj1=new LR();
								
								obj1.length_array(x1,y1);
						
								variance obj2=new variance();
								obj2.variance1(x1,y1);
							obj2.r(x1,y1);
							obj2.mean1(x1,y1);
							
							obj2.b1(x1,y1);
							obj2.a(x1,y1);
						
								System.out.println("y"+" "+ "="+ a+" "+"+"+b+"x");
								if(skinconductance>a+b*heartrate ) 
									System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND + ConsoleColors.RED_BOLD + "Lie detected!");
								else
									System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND + ConsoleColors.RED_BOLD + "True!");
							break;	
				}
					  case 2:
						 {
							 double[] y1 = {153,3374,891,3600,3661,1381,9956,1312,2167};//skin conductance
						 int[] x1 = {62,100,75,101,91,74,72,66,63};  //heart rate
						 LR obj1=new LR();
						 
							obj1.length_array(x1,y1);
					
							variance obj2=new variance();
							obj2.variance1(x1,y1);
						obj2.r(x1,y1);
						obj2.mean1(x1,y1);
						
						obj2.b1(x1,y1);
						obj2.a(x1,y1);
					
							System.out.println("y"+" "+ "="+ a+" "+"+"+b+"x");
							if(skinconductance>a+b*heartrate ) 
								System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND + ConsoleColors.RED_BOLD + "Lie detected");
							else
								System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND + ConsoleColors.RED_BOLD + "true");
						break;	
						
						 }
						 case 3:
						 {
							 double[] y1 = {4515,1119,421,1081,4883,9576,2255,4076,3392};//skin conductance
								double[] x1 = {106.3033,52.815,90.24695,66.7695,61.8014,57.7964,93.7245,82.7480,96.84451};  //heart rate
								LR obj1=new LR();
								
								obj1.length_array(x1,y1);
						
								variance obj2=new variance();
								obj2.variance1(x1,y1);
							obj2.r(x1,y1);
							obj2.mean1(x1,y1);
							
							obj2.b1(x1,y1);
							obj2.a(x1,y1);
						
							System.out.println("y"+" "+ "="+ a+" "+"+"+b+"x");
							if(skinconductance>a+b*heartrate ) 
								System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND + ConsoleColors.RED_BOLD + "Lie detected");
							else
								System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND + ConsoleColors.RED_BOLD + "true");
						break;	
						
						  }
					 }
				}
					while(false);
				} 
				break;

case 2:
    Scanner O=new Scanner(System.in);
    System.out.println(ConsoleColors.FOREST_GREEN + "\nEnter the number of values:");
    //int n=S.nextInt();
    try {
		 n=O.nextInt();
		}
		catch (InputMismatchException e) {
			n=5;
			System.out.println(ConsoleColors.RED + "Default value  has been kept as 5");
			
		}
    Scanner S=new Scanner(System.in);
    double []x1 =new double[n];
    System.out.print(ConsoleColors.PURPLE_BOLD_BRIGHT + ConsoleColors.BLUE_BOLD_BRIGHT + "\nEnter the file name for");
    System.out.print(ConsoleColors.PURPLE_BOLD_BRIGHT + ConsoleColors.RED_BOLD + " heartrate❤ ");
    System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + ConsoleColors.BLUE_BOLD_BRIGHT + "values:");
    String q =S.next();
    File obj =new File(q);

    if(obj.createNewFile()) {
    System.out.println(ConsoleColors.BROWN+"file has been created"+" "+obj.getName());
    }
    System.out.println(ConsoleColors.LIGHT_PINK+"\nEnter the heartrate values:");
    for(int i=0;i<n;i++) {
        x1[i]=S.nextInt();
    }
    PrintWriter u1=new PrintWriter(q);

    for(int i=0;i<n;i++) {
        u1.println(x1[i]);

    }
    u1.close();
     System.out.println(ConsoleColors.BROWN+"CHANGES SAVED");
    u1.close();
    double []y1 =new double[n];
    System.out.print(ConsoleColors.PURPLE_BOLD_BRIGHT + ConsoleColors.BLUE_BOLD_BRIGHT + "\nEnter the file name for");
    System.out.print(ConsoleColors.PURPLE_BOLD_BRIGHT + ConsoleColors.RED_BOLD + " skin conductances✐ ");
    System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + ConsoleColors.BLUE_BOLD_BRIGHT + "values:");
    String q1 =S.next();
    File obj1 =new File(q1);
    if(obj1.createNewFile()) {
    System.out.println(ConsoleColors.BROWN+"file has been created"+" "+obj1.getName());
    }
    System.out.println(ConsoleColors.LIGHT_PINK+"\nEnter the skin conductance values:");
    for(int i=0;i<n;i++) {
        y1[i]=S.nextInt();
    }
    PrintWriter u11=new PrintWriter(q1);

    for(int i=0;i<n;i++) {
        u11.println(y1[i]);

    }
    u11.close();
     System.out.println(ConsoleColors.BROWN+"CHANGES SAVED");
    u11.close();
    LR ob1=new LR();
    ob1.length_array(x1,y1);
    variance obj2=new variance();
    obj2.variance1(x1,y1);
obj2.r(x1,y1);
obj2.mean1(x1,y1);
obj2.b1(x1,y1);
obj2.a(x1,y1);
Scanner factor1=new Scanner(System.in);
System.out.println( ConsoleColors.WHITE_BRIGHT + ConsoleColors.RED_ITALIC+ "\n❤ Enter Heartrate:");
try {
heartrate=factor1.nextDouble();
}
catch (InputMismatchException e1) {
	System.out.println(ConsoleColors.PURPLE + "Your selection should be an integer so the default value is being kept");
	 
	count21++;
	//System.out.println(count2);
}

try {
	System.out.println(ConsoleColors.CYAN_ITALIC + "\n✐ Enter Skin Conductance:");
skinconductance= factor1.nextDouble();
}

catch (InputMismatchException e2) {
	//System.out.println(ConsoleColors.PURPLE + "Your selection should be an integer so the default value is being kept");
	count11++;
	//System.out.println(count1);
}
if(count21>0) {
	heartrate=100.00; 
	System.out.println(ConsoleColors.RED_UNDERLINED  +ConsoleColors.RED_BOLD + "\n✐ Since you gave wrong input , the particular value has been set to default ,you are given a chance again be carfull!!!!!!:");
	Scanner h1= new Scanner(System.in);
	System.out.println(ConsoleColors.ERASE +ConsoleColors.CYAN_ITALIC +"\n✐ Enter Skin Conductance:");
	skinconductance= h1.nextDouble();}
	if(count11>0&&count21==0) {
		System.out.println(ConsoleColors.RED_UNDERLINED  +ConsoleColors.RED_BOLD + "\n✐ Since you gave wrong input , the particular value has been set to default ");
		skinconductance=2600.00;
	}
System.out.println(ConsoleColors.ORANGE+"\ny"+" "+ "="+ a+" "+"+"+b+"x");
if(skinconductance>a+b*heartrate ) 
    System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND + ConsoleColors.RED_BOLD + "\nLie detected!");
else
    System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND + ConsoleColors.RED_BOLD + "\nTrue!");
 break;

}
}
}