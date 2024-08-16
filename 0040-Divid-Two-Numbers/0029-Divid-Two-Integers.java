class Solution {
    public int divide(long  dividend, long divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1 ){
            return Integer.MAX_VALUE ;
        }


        long dvd = Math.abs(dividend);
        long dvs = Math.abs(divisor);

        long result = 0 ;
        //int temp = dvs;
        final int  sign = dividend > 0 ^ divisor > 0 ? -1 : 1;

        while(dvd >= dvs){
            long  multiple = 1  ;
            while(multiple * 2 * dvs <= dvd ){
                multiple *= 2;
            }
            dvd = dvd - multiple * dvs ;
            result += multiple ;


        }
        return (int)result  * sign ;


    }
}