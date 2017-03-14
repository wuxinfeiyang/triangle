package cn.scs.st;

public class PrintPrime {
	public static String printPrimes (int n) 
	{ 
		int MAXPRIMES = 10;
		int curPrime; // Value currently considered for primeness 
		int numPrimes; // Number of primes found so far. 
		boolean isPrime; // Is curPrime prime? 
		int [] primes = new int [MAXPRIMES]; // The list of prime numbers. 
		// Initialize 2 into the list of primes. 
		primes [0] = 2; 
		numPrimes = 1; 
		curPrime = 2; 
		while (numPrimes < n) 
		{ 
			curPrime++; // next number to consider ... 
			isPrime = true; 
			for (int i = 0; i <= numPrimes-1; i++) 
			{ // for each previous prime. 
				if (curPrime%primes[i]==0) 
				{ // Found a divisor, curPrime is not prime. 
					isPrime = false; 
					break; // out of loop through primes. 
				} 
			} 
			if (isPrime) 
			{ // save it! 
				primes[numPrimes] = curPrime; 
				numPrimes++; 
			} 
		} // End while 

		// Print all the primes out. 
		String s = null;
		for (int i = 0; i <= numPrimes-1; i++) 
		{ 
			System.out.println ("Prime: " + primes[i]); 
			s += primes[i];
		} 
		return s;
	} // end printPrimes
	
	
}

