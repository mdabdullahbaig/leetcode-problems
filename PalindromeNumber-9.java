class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        if(x < 0 || x%10 == 0) {
            return false;
        }

        int reverse = 0;
        // x = 1221 {
        //     1   12
        //     122 12
        // } 
        // x = 12121 {
        //     1     12  121
        //     1212  121 12
        // }
        while(x > reverse) {
            reverse = reverse*10 + x%10; 
            x /= 10;                    
        }

        if(x == reverse || x == reverse/10) {
            return true;
        }

        return false;

    }
}