package PA9;
public class Recursion {
	public static int tribonacci(int n) {
		int fin = 0;
		if(n == 0 || n == 1){
			fin = 1;
		}
		else if (n == 2) {
			fin = 2;
		}
		else {
			fin = tribonacci(n-1) + tribonacci(n-2)+ tribonacci(n-3);
		}
		
		return fin;
	}
	public static boolean isPowerOf2(int n) {
		boolean ans = false;
		if(n == 1) {
			return true;
		}
		if(n % 2 == 1) {
			return false;
		}
		else{
			ans = isPowerOf2(n/2);
			return ans;
		}
	}
	public static int countEvenDigits(int n) {
		if(n / 10 == 0) {
			return n % 2 == 0 ? 1 : 0;
		}
		else {
			return (n % 10 % 2 == 0 ? 1 : 0) + countEvenDigits(n / 10);
		}
	}
	public static int sumPosIntegersDivk(int n, int k) {
		if(n < k) {
			return 0;
		}
		else {
			if(0 == n % k) {
				return n + sumPosIntegersDivk(n - k, k);
			}
			else {
				return sumPosIntegersDivk(n - n % k, k);
			}
		}
	}
	private static boolean searchArrayHelper(int[] A, int k, int key) { // complete this method
		 if (k == 1) {
	            if (A[0] == key) {
	                return true;
	            }
	            else {
	                return false;
	            }
	     }
		 else if(k != 1) {
	            if (A[k-1] == key) {
	                return true;
	            }
	            else {
	                return searchArrayHelper(A, k-1, key);
	            }
	     }
		 else {
	            return false;
	     }

	        }
	public static boolean searchArray(int[] A, int key) {
		return searchArrayHelper(A, A.length, key);
	}
	public static int determinant(int[][] matrix) {
		 int rowl = matrix[0].length; 
         int det = 0;
         if (rowl == 1) {
             det = matrix[0][0];
         }
         else if(rowl == 2) {
             det = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
         }
         else {
            for (int i = 0; i < matrix[0].length; i++) {
                int [][]temporary = new int[matrix.length - 1][matrix[0].length - 1];

                for (int j = 1; j < matrix.length; j++) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        if (k < i) {
                            temporary[j - 1][k] = matrix[j][k];
                        } 
                        else if (k > i) {
                            temporary[j - 1][k - 1] = matrix[j][k];
                        }
                    }
                }
                det += matrix[0][i] * Math.pow (-1, (int) i) * determinant (temporary);
            }
        }
         return det;
	}
}