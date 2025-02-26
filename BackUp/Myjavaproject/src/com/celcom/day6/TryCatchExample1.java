package com.celcom.day6;

public class TryCatchExample1 {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			// Uncomment one of the lines below to test different exceptions

			// int a = 10 / 0; // ArithmeticException
			// int b = Integer.parseInt("ABC"); // NumberFormatException
			// int arr[] = new int[-5]; // NegativeArraySizeException
			// int arr[] = { 10, 20, 30 };
			// System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e);
		} catch (NumberFormatException e) {
			System.out.println("Caught NumberFormatException: " + e);
		} catch (NegativeArraySizeException e) {
			System.out.println("Caught NegativeArraySizeException: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
		}
//        catch (Exception e) {  
//            System.out.println("Caught Exception: " + e);
//        }

		System.out.println("After Exception");
	}
}
