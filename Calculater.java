//Calculater-Methods
class Calculater{
	public static int Addint(int num1, int num2){
		int sum=num1+num2;
		return sum;
	}
	
	public static double Adddouble(double num1, double num2){
		double sum=num1+num2;
		return sum;
	}
	
	public static double Speed(double time, double distance){
		double Speed=distance/time;
		return Speed;
	}
	
	public static double AreaOfCircle(double redious){
		double Area=3.142*(redious*redious);
		return Area;
	}
	
	public static int Factorial(int num){
		int Fact=1;
		while(num>=1){
			Fact=Fact*num;
			num--;
		}
		return Fact;
	}
	
	public static double AreaOfTraingle(double hight, double base){
		double AreaT=(hight*base)* 0.5;
		return AreaT;
	}
	public static int add(int num1, int num2, int num3){
		int sum=num1+num2+num3;
		return sum;
	}
	public static double FToC(double far ){
		double Cal=(far-32)/1.8;
		return Cal;
	}
	public static double CToF(double Cal){
		double Far=(Cal*1.8)+32;
		return Far;
	}
	public static int RToD( int r){
		int d=r*70;
		return d;
	}
	public static boolean LeapYear( int year){
		boolean LeapYearIs=year%4==0 ||year%400==0 && year%100!=0;
		return LeapYearIs;
	}
	public static boolean Even(int num){
		boolean even=(num%2==0);
		return even;
	}
	
	public static boolean Odd(int num){
		boolean Odd=(num%2!=0);
		return Odd;
	}
	
	public static boolean Palindrome(int num){
		int temp=0,sum=0;
		int n= num;
		while(n!=0){
			temp=n%10;
			sum=sum*10+temp;
			n=n/10;
		}
		if(num==sum)
			return true;
		else
			return false;
	}
	
	public static boolean DivisionOfSix(int num){
		boolean even=(num%6==0);
		return even;
	}
	public static boolean Prime(int num) {
               
    	int t=0;
        int n=num;
        int m=n/2;
        for(int i=2;i<=m;i++){
        	if(n%i==0){
               //System.out.println(n + " is not a aprime number ");
               	t=1;
            }
       	}
	 	if(t==0)
	 		return true;
	 	else
	 		return false;
	 }
	 public static int Hours(int Second){
		int Hours=Second/3600;
		return Hours;
	}
	public static int NumerOfDigit(int num){
		int n = num , sum=0;
		while (n!=0){
			n=n/10;
			sum=sum+1;
		}
		return sum;
	}
	public static int Make2Digits(int num){
		int n = num , temp=1, sum=0;
		while(n!=0){
			n=n/10;
			temp=temp*10;
		}
		sum=num*temp+num;
		return sum;
	}
	public static int HundredsDigit(int num){
		int n = num , temp=0;
		for(int i=1;i<=3;i++){
			temp=n%10;
			n=n/10;
		}
		return temp;
	}
	public static double RunrateRequired(double target,double maxOvers,double currentScore, double oversBowled){
		double R=(target-currentScore)/(maxOvers-oversBowled);
		return R;
	}
	public static double MakeDecimal(double a,double b,double c){
		double sum=0, num=0;
		sum=(((a*10)+b)*10)+c;
		num=sum/100;
		return num;
		
	}
	public static int Sum(int num){
		
		int n=num,temp=0,sum=0;
		while(n!=0){
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		return sum;
	}
	public static int Add4DigitNums( int num){
		int n=num,temp=0,sum=0, add=0;
		while(n!=0){
			temp=n%10;
			sum=(((((temp*10)+temp)*10+temp)*10+temp));
			add=add+sum;
			n=n/10;
		}
		return add;
		
	}
	
	public static boolean IsMultiple( int num){
		if(num%3==0&&num%7==0)
			return true;
		else
			return false;
	}
	public static boolean AndBool( boolean a, boolean b, boolean c){
		
			if((a&&b&&c)==true)

			return true;
		else
			return false;
	}
	public static boolean LargerThanOne( int num, int num1, int num2){
		
		
			if((num>num1)||(num>num2))

			return true;
		else
			return false;
	}
	public static int SumOfDigits( int num){
		int sum=0,temp=0,n=num;
		for(int i=1;i<=4;i++){
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		return sum;
			
	}
	public static int Add4DigitNumbers( int num1, int num2, int num3){
		int sum=0;
		num1=(((((num1*10)+num1)*10+num1)*10+num1));
		num2=(((((num2*10)+num2)*10+num2)*10+num2));
		num3=(((((num3*10)+num3)*10+num3)*10+num3));
		sum=num1+num2+num3;
		return sum;
	}
	public static String FourTimes(String num){
		String n="num";
		n=num+num+num+num;
		return n; 

	}

	public static int Largest( int num1, int num2, int num3){
		if(num1>num2){
			if(num1>num3)
				return num1;
			else
				return num3;
		}
		if(num2>num3)
			return num2;
		else
			return num3;
	}
	
	public static String AsscendingOrder( int num1, int num2, int num3){
		String AsscendingOrder="";
		System.out.print(" Asscending Order: ");
		System.out.print((num1<num2&&num2<num3)&&(num2<num3)?"True":"False");
		return AsscendingOrder;
	}
	public static int ComputeArea( int x1, int y1, int x2, int y2){
		int sum=0;
		sum=(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)))/2;
		return sum;
		
	}
	public static void  NumOfDays( int num1){
		int x=num1;
		System.out.print(" Number of days: ");
		switch(x){
			case 1:
				System.out.println("31");
				break;
			case 2:
				System.out.println("28");
				break;
			case 3:
				System.out.println("31");
				break;
			case 4:
				System.out.println("30");
				break;
			case 5:
				System.out.println("31");
				break;
			case 6:
				System.out.println("30");
				break;
			case 7:
				System.out.println("31");
				break;
			case 8:
				System.out.println("31");
				break;
			case 9:
				System.out.println("30");
				break;
			case 10:
				System.out.println("31");
				break;
			case 11:
				System.out.println("30");
				break;
			case 12:
				System.out.println("31");
				break;
			default:
				System.out.println("you enter a invalide number plz try to enter valide number");
				
		}
	}
	public static char ChangeCase(char ch)
	{
		int sum;
		if((ch>='a')&&(ch<='z')){
			sum=(int)ch;
			sum=sum-32;
			ch=(char)sum;
			return ch;
		}
		else if((ch>='A')&&(ch<='Z')){
			sum=(int)ch;
			sum=sum+32;
			ch=(char)sum;
			return ch;
		}
		  else{
        	System.out.print("");
        }
        return ch;
    }
    public static boolean IsDigit(char ch){
		if (ch>='0'&&ch<='9')
			return true;
		else
			return false;
	}
	public static boolean IsSameLastDigit( int num1, int num2){
		num1=num1%10;
		num2=num2%10;
		if(num1==num2)
			return true;
		else
			return false;
	}
	public static char Middle( char num1, char num2, char num3){
		int n1,n2,n3;
		n1=(int)num1;
		n2=(int)num2;
		n3=(int)num3; 
		if ( n1 < n2 && n1 > n3 || n1 > n2 && n2 < n3 ){
			num1=(char)n1;
         	return num1;
         }
      	else if ( n2 > n1 && n2 < n3 || n2 < n1 && n2>n3 ){
      		num2=(char)n2;
      		return num2;
      	}
      	else //if( n3 < n1 && n3 > n2 && n3 > n1 && n3 < n2 ) 
      		num3=(char)n3;  
      	return num3;
   }
	public static boolean AddThird( int num1, int num2, int num3){
		if ( num2+num3==num1)
			return true;
		else if ( num1+num3==num2 )
      		return true;
    	else if(num1+num2==num3)
      		return true;
    	else 
      		return false;
  	}
  	public static int LotteryReward( int num){
		
		if(num%4==0 && num%7==0)
         	return 20;
      	else if ( num%4==0)
      		return 6;
      	else if ( num%7==0 )
      		return 10;
      	else 
      	return 0;
   }
   public static int LotteryRewardFor3( int num1,int num2,int num3){
		return LotteryReward(num1)+LotteryReward(num2)+LotteryReward(num3);
		 

	}
   public static int Reverse3( int num){
		int n=num,temp=0,sum=0;
		while(n!=0){
			temp=n%10;
			sum=sum*10+temp;
			n=n/10;
		}
      	return sum;
   }
   public static boolean PerfectNumber( int num){
		int n=num/2,m=num,sum=0;
		for(int i=1;i<=n;i++){
			if(m%i==0){
				sum=sum+i;
				
			}
		}
		if (num==sum)
      		return true;
      	else
      		return false;
   	
	}
	public static int Blackjack( int num1,int num2){
		if(num1>21 || num2>21)
			return -1;
		else if(num1==21 && num2==21)
			return -2;
		else if(num1<21 && num2==21 || num2<21 && num2==21)
			return 21;
		else
			return 0;
	}
	 public static String GenrateEvenNumber(int from, int to){
	 	String result="";
	 	for(int i=from; i<=to; i++){
	 		if (Even(i)){
	 			result +=" "+i;
	 		}
	 	}
	 	return result;
	 }
	  public static String GenrateOddNumber(int from, int to){
	 	String result="";
	 	for(int i=from; i<=to; i++){
	 		if (Odd(i)){
	 			result +=" "+i;
	 		}
	 	}
	 	return result;
	 }
	 public static String GenratePrimeNumber(int from, int to){
	 	String result="";
	 	for(int i=from; i<=to; i++){
	 		if (Prime(i)){
	 			result +=" "+i;
	 		}
	 	}
	 	return result;
	 }
	 public static String GenratePalindromeNumber(int from, int to){
	 	String result="";
	 	for(int i=from; i<=to; i++){
	 		if (Palindrome(i)){
	 			result +=" "+i;
	 		}
	 	}
	 	return result;
	 }
	 public static String Fibonacci(int num ){
	 	System.out.println(" Fibonecci serise:");
	 	String Fib="";
		int n1=0,n2=1,n3;
		System.out.print(""+n1);
		System.out.print(" "+n2);
		for(int i=3; i<=num; i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		return Fib;
	}
	public static String Checkfibonecci(int num){
		int a=0, b=1, c;
		if(num==0)
			return " Yes";
		while (true){
			c=a+b;
			a=b;
			b=c;
			if(c==num)
				return " Yes";
			if(c>=num)
				return " No";
		}
	}
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
	public static int SumOfArray(int[] array){
		int sum=0;
		for(int i=0;i<array.length;i++){
			//System.out.println(array[i]);
			sum+=array[i];
		}
		return sum;
	}
	public static int maxElement(int array[]){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if (array[i]>array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[array.length-1];
	}
	public static int[] sortArray(int array[]){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if (array[i]>array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	public static int[] reverseArray(int array[]){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if (array[i]<array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	public static boolean repeatnumber(int array[]){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if (array[i]==array[j])
					return true;
				// System.out.println("true");
			}
		}
		return false;
	}
	public static char[] lowerUpper(char array[]){
		
		for(int i=0;i<array.length; i++){
			int sum=0;
			if((array[i]>='a')&&(array[i]<='z')){
				sum=(int)array[i];
				sum=sum-32;
				array[i]=(char)sum;
				//return array;

			}
			else if((array[i]>='A')&&(array[i]<='Z')){
				sum=(int)array[i];
				sum=sum+32;
				array[i]=(char)sum;
				//return array;
			}
		  	else
        	System.out.print("");
        }
        return array;
       
       
	}
	public static void printArray(boolean[] barray){
		for(int i=0;i<barray.length;i++)
			System.out.println(barray[i]);

	}
	public static void change(boolean[] barray){
		System.out.println("\n  change");
		for(int i=0;i<barray.length; i++){	
			barray[i]=true;
			System.out.println(barray[i]);
		}
	}
	public static int[] genrateNeturalNumber(int howMany){
		System.out.println("\n  genrateNeturalNumber");
		int[] array1=new int[howMany];
		for(int i=0;i<array1.length;i++){
			array1[i]=i+1;
		}
		return array1;
	}
	public static int[] genrateRandomNumber(int howMany){
		System.out.println("\n  genrateRandomNumber");
		int[] array2=new int[howMany];
		for(int i=0;i<array2.length;i++){
			array2[i]=(int)(Math.random()*1000);
		}
		return array2;
	}
	public static int[] genrateEvenNumber(int from, int to){
		System.out.println("\n  genrateEvenNumber");
		int[] array3=new int[((to-from)/2)+1];
		int index=0;
		for(int i=from;i<=to;i++){
			if(Even(i)){
				array3[index ++]=i;
			}
		}
		return array3;
	}
	public static int[] genrateOddNumber(int from, int to){
		System.out.println("\n  genrateOddNumber");
		int[] array4=new int[(to-from)/2];
		int index=0;
		for(int i=from;i<to;i++){
			if(Odd(i)){
				array4[index ++]=i;
			}
		}
		return array4;
	}
	public static int countPrime(int from, int to){
		System.out.println("\n  countPrime");
		int count=0;
		for(int i= from; i<=to;i++){
			if(Prime(i)){
				count++;
			}
		}
		return count;
	}
	public static int[] genratePrimeNumbers(int from, int to){
		System.out.println("\n  genratePrimeNumbers");
		int[] NUM =new int[to-from];
		int[] array5 =new int[countPrime(from,to)];
		int p = 0;
		for(int i=0;i<NUM.length;i++){
			NUM[i]=from+i;
		}
		
		for(int j=0; j<NUM.length;j++){

				if(Prime(NUM[j])){
					array5[p]=NUM[j];
					p++;
				}
			
      	 }
		return array5;
	}
	public static int[] FibonacciSerise(int howMany ){
	 	System.out.println("\n Fibonecci serise:");
	 	int[] array6=new int[howMany];;
	 	//String Fib="";
		int n1=0,n2=1,n3;
		array6[0]=0;
		array6[1]=1;
		for(int i=2; i<howMany; i++){
			n3=n1+n2;
			array6[i]=n3;
			//System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		return array6;
	}
	public static char[] genrateRandomCharacter(int howMany){
		System.out.println("\n genrateRandomCharacter:");
		char[] array7=new char[howMany];
		int n=0;
		int count=0;
		for(int i=0;i<array7.length;){
			n=(int)(Math.random()*1000);
			if(n>=65&&n<=91||n>=97&&n<=122){
				array7[i]=(char)n;
				i++;
			}
			
		}
		for(int i=0;i<array7.length;i++)
		if(array7[i]=='a'||array7[i]=='e'||array7[i]=='i'||array7[i]=='o'||array7[i]=='u'||array7[i]=='A'||array7[i]=='E'||array7[i]=='I'||array7[i]=='O'||array7[i]=='U'){
			count++;
			System.out.println(array7[i]);
		}
		System.out.println("number of vowels is"+"\t"+count);
			//System.out.println(count);
		return array7;
	}
	
	public static int[] reverseArrays(int array[]){
		System.out.println("\n reverseArrays:");
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if (array[i]<array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	public static int countPalindrome(int from, int to){
		System.out.println("\n countPalindrome ");
		int count=0;
		for(int i= from; i<=to;i++){
			if(Palindrome(i)){
				count++;
			}
		}
		return count;
	}

	 public static int[] GenratePalindromeNumbers(int from, int to){
	 	System.out.println("\n GenratePalindromeNumbers:");
	 	//String result="";
	 	int [] array9=new int[to-from];
	 	int[] array10 =new int[countPalindrome(from,to)];
	 	int index=0;
	 	for(int i=from; i<=to; i++){
	 		if (Palindrome(i)){
	 			array10[index++]=i;
	 			//result +=" "+i;
	 		}
	 	}
	 	
	 		return array10;
	 }
	public static int fact(int n) { 
		int result; 
		if ( n ==1) 
		return 1; 
		result = fact (n-1) * n; 
		return result; 
		
	}	 
	 
 	static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count){    
    	if(count>0){    
        	 n3 = n1 + n2;    
         	n1 = n2;    
        	 n2 = n3;    
        	 System.out.print(" "+n3);   
        	 printFibonacci(count-1);    
     	}    
 	}    

}
