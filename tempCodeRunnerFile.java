

// // 2️⃣ Find Second Largest Element
// public class Second_Largest {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 5, 8, 25};

//         int largest = Integer.MIN_VALUE;
//         int second = Integer.MIN_VALUE;

//         for (int num : arr) {
//             if (num > largest) {
//                 second = largest;
//                 largest = num;
//             } else if (num > second && num != largest) {
//                 second = num;
//             }
//         }

//         System.out.println("Second Largest: " + second);
//     }
// }

// // 3️⃣ Remove Duplicates from Array
// public class Remove_Duplicates {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 4, 4};

//         for (int i = 0; i < arr.length; i++) {
//             boolean isDuplicate = false;
//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     isDuplicate = true;
//                     break;
//                 }
//             }
//             if (!isDuplicate) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }



// // 4️⃣ Find Missing Number (1 to N)
// public class Missing_Number {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 5};
//         int n = 5;

//         int total = n * (n + 1) / 2;
//         int sum = 0;

//         for (int num : arr) sum += num;

//         System.out.println("Missing Number: " + (total - sum));
//     }
// }



// // 5️⃣ Move All Zeros to End
// public class Move_Zeros {
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 0, 3, 12};
//         int index = 0;

//         for (int num : arr) {
//             if (num != 0) arr[index++] = num;
//         }
//         while (index < arr.length) arr[index++] = 0;

//         for (int num : arr) System.out.print(num + " ");
//     }
// }



// // 6️⃣ Reverse a String
// public class Reverse_String {
//     public static void main(String[] args) {
//         String s = "hello";
//         String rev = "";

//         for (int i = s.length() - 1; i >= 0; i--) {
//             rev += s.charAt(i);
//         }

//         System.out.println(rev);
//     }
// }




// // 7️⃣ Palindrome String

// public class Palindrome_String {
//     public static void main(String[] args) {
//         String s = "madam";
//         String rev = "";

//         for (int i = s.length() - 1; i >= 0; i--)
//             rev += s.charAt(i);

//         System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
//     }
// }



// // 8️⃣ Reverse Number (Without String)

// public class Reverse_Number {
//     public static void main(String[] args) {
//         int num = 1234, rev = 0;

//         while (num != 0) {
//             rev = rev * 10 + num % 10;
//             num /= 10;
//         }

//         System.out.println(rev);
//     }
// }


// // 9️⃣ Prime Number Check


// public class Prime_Number {
//     public static void main(String[] args) {
//         int n = 29;
//         boolean isPrime = true;

//         if (n <= 1) isPrime = false;

//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         System.out.println(isPrime ? "Prime" : "Not Prime");
//     }
// }



// // 🔟 Fibonacci Series

// public class Fibonacci {
//     public static void main(String[] args) {
//         int a = 0, b = 1, n = 10;

//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int c = a + b;
//             a = b;
//             b = c;
//         }
//     }
// }




// // 1️⃣1️⃣ Factorial

// public class Factorial {
//     public static void main(String[] args) {
//         int n = 5, fact = 1;

//         for (int i = 1; i <= n; i++)
//             fact *= i;

//         System.out.println(fact);
//     }
// }




// // 1️⃣2️⃣ Armstrong Number

// public class Armstrong {
//     public static void main(String[] args) {
//         int num = 153, temp = num, sum = 0;

//         while (temp != 0) {
//             int r = temp % 10;
//             sum += r * r * r;
//             temp /= 10;
//         }

//         System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
//     }
// }



// // 1️⃣3️⃣ Linear Search

// public class Linear_Search {
//     public static void main(String[] args) {
//         int[] arr = {5, 8, 2, 9};
//         int key = 2;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 System.out.println("Found at index " + i);
//                 return;
//             }
//         }
//         System.out.println("Not Found");
//     }
// }



// // 1️⃣4️⃣ Binary Search

// public class Binary_Search {
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 5, 7, 9};
//         int key = 7;

//         int low = 0, high = arr.length - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (arr[mid] == key) {
//                 System.out.println("Found");
//                 return;
//             } else if (key < arr[mid]) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         System.out.println("Not Found");
//     }
// }



// // 1️⃣5️⃣ Swap Two Numbers (No Third Variable)

// public class Swap_No_Temp {
//     public static void main(String[] args) {
//         int a = 5, b = 10;

//         a = a + b;
//         b = a - b;
//         a = a - b;

//         System.out.println(a + " " + b);
//     }
// }




// // 1️⃣6️⃣ Bubble Sort (BEST)

// public class Bubble_Sort {
//     static void bubbleSort(int[] arr) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {5, 1, 4, 2, 8};

//         bubbleSort(arr);

//         for (int num : arr)
//             System.out.print(num + " ");
//     }
// }