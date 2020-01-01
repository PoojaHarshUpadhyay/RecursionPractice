int[] arr = new int[10];

Int Fibonacci(int n) {
fillArr(n);
int res = fib(n);
}

void fillArr(int n) {
for(int i = 0; i < n; i++) {
arr[i] = -1;
  }
}

int fib(int n) {

if(n <= 1) {
  arr[n] = n;
  return n;
}
else {
  if(arr[n-2] == -1) {
    arr[n-2] = fib(n-2);
  }
  if(arr[n-1] == -1) {
    arr[n-1] = fib(n-1);
  }
  return arr[n-2] + arr[ n-1];
}
}
