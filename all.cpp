1️⃣ Reverse an Array
#include <iostream>
using namespace std;

void reverseArray(int arr[], int n) {
    int start = 0, end = n - 1;
    while(start < end) {
        swap(arr[start], arr[end]);
        start++;
        end--;
    }
}

int main() {
    int arr[] = {1,2,3,4,5};
    int n = 5;

    reverseArray(arr, n);

    for(int i=0;i<n;i++)
        cout << arr[i] << " ";
}






2️⃣ Second Largest Element in Array
#include <iostream>
using namespace std;

int secondLargest(int arr[], int n) {
    int largest = -1, second = -1;

    for(int i=0;i<n;i++) {
        if(arr[i] > largest) {
            second = largest;
            largest = arr[i];
        } else if(arr[i] > second && arr[i] != largest) {
            second = arr[i];
        }
    }
    return second;
}

int main() {
    int arr[] = {10, 20, 4, 45, 99};
    cout << secondLargest(arr, 5);
}





3️⃣ Remove Duplicates from Array (Sorted)
#include <iostream>
using namespace std;

int removeDuplicates(int arr[], int n) {
    int j = 0;
    for(int i=0;i<n-1;i++) {
        if(arr[i] != arr[i+1]) {
            arr[j++] = arr[i];
        }
    }
    arr[j++] = arr[n-1];
    return j;
}

int main() {
    int arr[] = {1,1,2,2,3,4,4};
    int n = removeDuplicates(arr, 7);

    for(int i=0;i<n;i++)
        cout << arr[i] << " ";
}





4️⃣ Find Missing Number (1 to N)

#include <iostream>
using namespace std;

int missingNumber(int arr[], int n) {
    int sum = n * (n + 1) / 2;
    int currSum = 0;

    for(int i=0;i<n-1;i++)
        currSum += arr[i];

    return sum - currSum;
}

int main() {
    int arr[] = {1,2,3,5};
    cout << missingNumber(arr, 5);
}




5️⃣ Move All Zeros to End
#include <iostream>
using namespace std;

void moveZero(int arr[], int n) {
    int index = 0;

    for(int i=0;i<n;i++) {
        if(arr[i] != 0)
            arr[index++] = arr[i];
    }

    while(index < n)
        arr[index++] = 0;
}

int main() {
    int arr[] = {0,1,0,3,12};
    moveZero(arr, 5);

    for(int i=0;i<5;i++)
        cout << arr[i] << " ";
}





6️⃣ Reverse a String
#include <iostream>
using namespace std;

void reverseString(string &s) {
    int start = 0, end = s.length() - 1;
    while(start < end) {
        swap(s[start], s[end]);
        start++;
        end--;
    }
}

int main() {
    string s = "hello";
    reverseString(s);
    cout << s;
}




7️⃣ Palindrome Check (String)
#include <iostream>
using namespace std;

bool isPalindrome(string s) {
    int start = 0, end = s.length() - 1;
    while(start < end) {
        if(s[start] != s[end])
            return false;
        start++;
        end--;
    }
    return true;
}

int main() {
    string s = "madam";
    cout << isPalindrome(s);
}





8️⃣ Reverse Number (Without String)
#include <iostream>
using namespace std;

int reverseNumber(int n) {
    int rev = 0;
    while(n > 0) {
        rev = rev * 10 + n % 10;
        n /= 10;
    }
    return rev;
}

int main() {
    cout << reverseNumber(1234);
}





9️⃣ Prime Number Check
#include <iostream>
using namespace std;

bool isPrime(int n) {
    if(n <= 1) return false;

    for(int i=2;i*i<=n;i++) {
        if(n % i == 0)
            return false;
    }
    return true;
}

int main() {
    cout << isPrime(13);
}






🔟 Fibonacci Series
#include <iostream>
using namespace std;

void fibonacci(int n) {
    int a = 0, b = 1;
    cout << a << " " << b << " ";

    for(int i=2;i<n;i++) {
        int c = a + b;
        cout << c << " ";
        a = b;
        b = c;
    }
}

int main() {
    fibonacci(10);
}





1️⃣1️⃣ Factorial
#include <iostream>
using namespace std;

int factorial(int n) {
    int fact = 1;
    for(int i=1;i<=n;i++)
        fact *= i;
    return fact;
}

int main() {
    cout << factorial(5);
}





1️⃣2️⃣ Armstrong Number
#include <iostream>
using namespace std;

int power(int x, int y) {
    int res = 1;
    while(y--)
        res *= x;
    return res;
}
int main() {
    int n = 153, temp = n, sum = 0, digits = 0;

    int t = n;
    while(t) {
        digits++;
        t /= 10;
    }

    while(n) {
        int r = n % 10;
        sum += power(r, digits);
        n /= 10;
    }

    cout << (sum == temp);
}




1️⃣3️⃣ Swap Without Third Variable
#include <iostream>
using namespace std;

int main() {
    int a = 5, b = 10;

    a = a + b;
    b = a - b;
    a = a - b;

    cout << a << " " << b;
}




1️⃣4️⃣ Odd or Even
#include <iostream>
using namespace std;

int main() {
    int n = 7;
    if(n % 2 == 0)
        cout << "Even";
    else
        cout << "Odd";
}




1️⃣5️⃣ Bubble Sort (Best & Optimized)
#include <iostream>
using namespace std;

void bubbleSort(int arr[], int n) {
    for(int i=0;i<n-1;i++) {
        bool swapped = false;
        for(int j=0;j<n-i-1;j++) {
            if(arr[j] > arr[j+1]) {
                swap(arr[j], arr[j+1]);
                swapped = true;
            }
        }
        if(!swapped) break;
    }
}

int main() {
    int arr[] = {5,1,4,2,8};
    bubbleSort(arr, 5);

    for(int i=0;i<5;i++)
        cout << arr[i] << " ";
}