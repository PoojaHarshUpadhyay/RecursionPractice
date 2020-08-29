class Solution {
    public int tribonacci(int n) {
       if (n == 0) {
           return 0;
       }
        if(n == 1 || n == 2) {
            return 1; 
        }
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        
        return calculate(n, arr);
        
    }
    public int calculate(int n, int[] arr) {
     if(n <= 2) {
            return arr[n];
        }
        if(arr[n] == 0) {
            arr[n] = calculate(n-1, arr) + calculate(n-2, arr) + calculate(n-3,                             arr);
           
        }
         return arr[n];
    }
}
