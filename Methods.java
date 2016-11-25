//Calculater-Methods
class Methods{
	public static void main(String[] args){
		System.out.println(" Addition of two number: " + Calculater.Addint(10,10));
		System.out.println(" Addition of two number: " + Calculater.Addint(2,4));
		System.out.println(" Addition of two number: " + Calculater.Adddouble(1.1,100.5));
		System.out.println(" Addition of two number: " + Calculater.Adddouble(5.1,20.5));
		System.out.println(" Spead: " + Calculater.Speed(2.5,100.45));
		System.out.println(" spead: " + Calculater.Speed(60.25,25.66));
		System.out.println(" Area of Circle : " + Calculater.AreaOfCircle(3.2));
		System.out.println(" Area of Circle : " + Calculater.AreaOfCircle(10.9));
		System.out.println(" Factorial of num : " + Calculater.Factorial(5));
		System.out.println(" Factorial of num : " + Calculater.Factorial(9));
		System.out.println(" AreaOfTraingle : " +Calculater.AreaOfTraingle(10,5));
		System.out.println(" Addition of Three numbers: " +Calculater.add(20,30,40));
		System.out.println(" Farenhite to Celciouc: " +Calculater.FToC(86));
		System.out.println(" Celcious to Farenhite: " +Calculater.CToF(30));
		System.out.println(" Rupies to Dollor: "+Calculater.RToD(100));
		System.out.println(" Leap year:" +Calculater.LeapYear(2016));
		System.out.println(" Even or Not:" +Calculater.Even(10));
		System.out.println(" Even or Not:" +Calculater.Even(11));
		System.out.println(" Odd or Not: " +Calculater.Odd(42));
		System.out.println(" Odd or Not: " +Calculater.Odd(41));
		System.out.println(" Pailindrom or Not:" +Calculater.Palindrome(1221));
		System.out.println(" Pailindrom or Not:" +Calculater.Palindrome(1144));
		System.out.println(" Divisible by Six or Not:"+Calculater.DivisionOfSix(24));
		System.out.println(" Divisible by Six or Not:"+Calculater.DivisionOfSix(67));
		System.out.println(" Prime or Not:"+Calculater.Prime(15));
		System.out.println(" Prime or Not:"+Calculater.Prime(23));
		System.out.println("convert Second in to hours: " + Calculater.Hours(3600));
		System.out.println("convert Second in to hours: " + Calculater.Hours(18000));
		System.out.println(" Number of intiger: "+ Calculater.NumerOfDigit(1113));
		System.out.println(" Number of intiger: "+ Calculater.NumerOfDigit(516));
		System.out.println(" Make two digits: " + Calculater.Make2Digits(6));
		System.out.println(" Make two digits: " + Calculater.Make2Digits(123));
		System.out.println(" Hundred number of digit: " + Calculater.HundredsDigit(12345));
		System.out.println(" Hundred number of digit: " + Calculater.HundredsDigit(12345678));
		System.out.println(" RunrateRequired: " + Calculater.RunrateRequired(326,49,210,33));
		System.out.println(" inpur a,b,c and output is a.bc: " + Calculater.MakeDecimal(20,10,6));
		System.out.println(" inpur a,b,c and output is a.bc: " + Calculater.MakeDecimal(0,0,6));
		System.out.println(" sum of the digit: " + Calculater.Sum(57));
		System.out.println(" sum of the digit: " + Calculater.Sum(10));
		System.out.println(" ANDing of input boolean: " + Calculater.AndBool(true,true,true));
		System.out.println(" ANDing of input boolean: " + Calculater.AndBool(false,true,true));
		System.out.println(" Larger then one: " + Calculater.LargerThanOne(24,10,36));
		System.out.println(" Larger then one: " + Calculater.LargerThanOne(100,200,300));
		System.out.println(" Sum of digits: " + Calculater.SumOfDigits(10000));
		System.out.println(" Sum of digits: " + Calculater.SumOfDigits(12345));
		System.out.println(Calculater.AsscendingOrder(2,4,6));
		System.out.println(Calculater.AsscendingOrder(3,1,12));
		System.out.println(" Compute the area of square: " + Calculater.ComputeArea(0,0,5,5));
		System.out.println(" Compute the area of square: " + Calculater.ComputeArea(2,3,8,15));
		System.out.println("Add 4Digit Nums : " + Calculater.Add4DigitNums(123));
		System.out.println("Add 4Digit Nums : " + Calculater.Add4DigitNums(456));
		System.out.println("Add 4Digit Numbers : " + Calculater.Add4DigitNumbers(1,2,3));
		System.out.println("Add 4Digit Numbers : " + Calculater.Add4DigitNumbers(4,5,6));
		System.out.println("Is multiple by 3 and 7 : " + Calculater.IsMultiple(21));
		System.out.println("Is multiple by 3 and 7 : " + Calculater.IsMultiple(37));
		System.out.println(" Largest Number is: " + Calculater.Largest(10,20,15));
		System.out.println(" Largest Number is: " + Calculater.Largest(100,200,300));
		Calculater.NumOfDays(21);
		System.out.println(" Change Case: " + Calculater.ChangeCase('a'));
		System.out.println(" Change Case: " + Calculater.ChangeCase('K'));
		System.out.println(" Change Case: " + Calculater.ChangeCase('1'));
		System.out.println(" Is digit: " + Calculater.IsDigit('a'));
		System.out.println(" Is digit: " + Calculater.IsDigit('2'));
		System.out.println(" Is Same Last Digit: " + Calculater.IsSameLastDigit(1268,80128));
		System.out.println(" Is Same Last Digit: " + Calculater.IsSameLastDigit(901,9010));
		System.out.println(" middle value: " + Calculater.Middle('a','x','X'));
		System.out.println(" middle value: " + Calculater.Middle('5','6','2'));
		System.out.println(" is add of any tow number is equal to third number: " + Calculater.AddThird(12,28,16));
		System.out.println(" is add of any tow number is equal to third number: " + Calculater.AddThird(7,37,10));
		System.out.println(" Lottery Reward: " + Calculater.LotteryReward(22));
		System.out.println(" Lottery Reward: " + Calculater.LotteryReward(56));
		System.out.println(" Lottery Reward: " + Calculater.LotteryReward(16));
		System.out.println(" Lottery Reward: " + Calculater.LotteryReward(21));
		System.out.println(" Reverse of three digit numbers: " + Calculater.Reverse3(183));
		System.out.println(" Reverse of three digit numbers: " + Calculater.Reverse3(123));
		System.out.println(" Reverse of three digit numbers: " + Calculater.Reverse3(440));
		System.out.println("Is Perfect Numbers: " + Calculater.PerfectNumber(6));
		System.out.println("Is Perfect Numbers: " + Calculater.PerfectNumber(28));
		System.out.println("Is Perfect Numbers: " + Calculater.PerfectNumber(496));
		System.out.println(" Even Number Between 10 to 20:" +Calculater.GenrateEvenNumber(10,20));
		System.out.println(" Even Number Between 40 to 50:" +Calculater.GenrateEvenNumber(40,50));
		System.out.println(" Even Number Between 40 to 50:" +Calculater.GenrateOddNumber(10,20));
		System.out.println(" Even Number Between 40 to 50:" +Calculater.GenrateOddNumber(40,50));
		System.out.println(" Prime Number Between 100 to 200:" +Calculater.GenratePrimeNumber(100,200));
		System.out.println(" Pailindrom Number Between 100 to 200:" +Calculater.GenratePalindromeNumber(100,200));
		System.out.println(Calculater.Fibonacci(10));
		System.out.println(Calculater.Fibonacci(6));
		System.out.println(" Check Fibonecci serise: " +Calculater.Checkfibonecci(0));
		System.out.println(" Lottery Reward For 3: " +Calculater.LotteryRewardFor3(22,16,21));
		System.out.println(" Lottery Reward For 3: " +Calculater.LotteryRewardFor3(56,8,49));
		System.out.println("Black Jack: " +Calculater.Blackjack(18,21));
		System.out.println("Black Jack: " +Calculater.Blackjack(22,23));

		int[] array={1,2,3,4,5,6,7,8,9,10};
		int[] myArray={232,34,23,45,23};
		Calculater.printArray(array);
		Calculater.printArray(myArray);
		
		int result1=Calculater.SumOfArray(array);
		int result2=Calculater.SumOfArray(myArray);
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println("Max value of the array " + Calculater.maxElement(myArray));
		System.out.println("\n sorted array ");
		int[] newArray=Calculater.sortArray(myArray);
		for(int a:newArray){
			System.out.println(a);
		}
		//System.out.println(" sort of array " + Calculater.sortArray(myArray));
		System.out.println("Rverse Array " + Calculater.maxElement(myArray));
		int[] reverse=Calculater.reverseArray(myArray);
		for(int b:reverse){
			System.out.println(b);
		}
		System.out.println(Calculater.repeatnumber(myArray));
		
		char[] Carray={'A','E','I','O','U','E','a','e','i','o','u'};
		char [] chart=Calculater.lowerUpper(Carray);
		for(int b:chart){
			char c=(char)b;
			System.out.println(c);
		}
		boolean[] barray={true,false,true,false,false,false};
		Calculater.printArray(barray);
		
		Calculater.change(barray);
		
		int[] array1=Calculater.genrateNeturalNumber(20);
		Calculater.printArray(array1);

		int[] array2=Calculater.genrateRandomNumber(5);
		Calculater.printArray(array2);

		int[] array3=Calculater.genrateEvenNumber(10,20);
		Calculater.printArray(array3);

		int[] array4=Calculater.genrateOddNumber(10,20);
		Calculater.printArray(array4);

		int[] num=Calculater.genratePrimeNumbers(10,20);
		Calculater.printArray(num);

		int[] array6=Calculater.FibonacciSerise(20);
		Calculater.printArray(array6);

		char[] array7=Calculater.genrateRandomCharacter(10);
		//Calculater.printArray(array7);
		System.out.println(array7);

		int[] array8=Calculater.reverseArrays(myArray);
		Calculater.printArray(array8);

		//Calculater.genrateRandomCharacterVowels();
		//char[] array9={'a','b','c','d','e'};

		//System.out.println(Calculater.genrateRandomCharacterVowels(20));
		int[] array9=Calculater.GenratePalindromeNumbers(100,200);
		Calculater.printArray(array9);

		System.out.println(" \n factorial by using recursion \n");
		Calculater f =new Calculater(); 
		System.out.println("Factorial of 3 is " + f.fact(3)); 
		System.out.println("Factorial of 4 is " + f.fact(4)); 
		System.out.println("Factorial of 5 is " + f.fact(5)); 

		  int count=10,n1=0,n2=1;  
		  System.out.println("\n print Fibonacci serise \n "); 
  		System.out.print(n1+" "+n2);    
  		Calculater.printFibonacci(count-2);


	}
	

}