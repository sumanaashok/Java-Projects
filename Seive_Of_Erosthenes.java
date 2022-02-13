//First name : Sumana. Last Name: Bangalore Ashok
// Section : CS 505852
// Student ID : 31536751
// Project 3 : The Sieve of Eratosthenes and Goldbach's Conjecture.

public class Main {
	public static void initialize(int[] array) {
		// Initializing the array starting from 2 since we know that 0,1 are not primes.
		array[0]=0;
		array[1]=0;
		for (int i = 2; i < array.length; ++i) {
			array[i] = i;
		}
	}

	public static void seive(int[] array) {

		// modifying the array so that all other values except the prime numbers are
		// zeroed out.(updating all multiples of i)
		for (int i = 2; i * i < array.length; ++i) {
			for (int j = (i * i); j < array.length; j = j + i) {
				array[j] = 0;
			}
		}

		System.out.println("The Prime numbers between 1 and " + (array.length - 1) + " are");

		// Printing out only the prime numbers within the required range.
		for (int i = 2; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.println(array[i]);
			}
		}
	}

	public static void goldbach(int[] array) {
		// starting the even numbers from 4;
		int i = 4;

		System.out.println("The even numbers starting from " + i + " to " + ((array.length) - 1)
				+ " and the two prime numbers that add up to it are ");

		while (i < array.length) {
			for (int j = 2; j < i; j++) {
				if (array[j] + array[i - j] == i) {
					System.out.println(i + " = " + j + " + " + (i - j));
					break;
				}
			}
			// increment to the next even number.
			i += 2;
		}
	}

	public static void main(String[] args) {
		// Taking the length of array from user. if the user does not input any
		// arguments then use 1000000 as length of array.
		int length_of_array = args.length == 1 ? Integer.parseInt(args[0]) : 1000000;

		// Instantiating an array and its reference 'numbers' , and setting the size of
		// array to the length of array + 1 (to include the last value of array).
		int[] numbers = new int[length_of_array + 1];

		// calling the function to assign values to the array
		initialize(numbers);

		// calling the function to print prime numbers
		seive(numbers);

		// calling the function to print even numbers and the two prime numbers that add
		// up to it.
		goldbach(numbers);

	}

}
