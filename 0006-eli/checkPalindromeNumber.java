class Solution {
    public boolean isPalindrome(int x) {
    if(x==0) return true;
    
      int rem=0;
      boolean isNegative=false;

      if(x<0){
        isNegative=true;  
      }

      int temp = Math.abs(x);
      StringBuffer reversed= new StringBuffer("");

        while(temp!=0){
            rem=temp%10;
            reversed.append(String.valueOf(rem));
            temp=temp/10;
        }
        if(isNegative) reversed.append("-");
        System.out.println(reversed);
         System.out.println(x);

      return String.valueOf(x).equals(reversed.toString());
    }
}