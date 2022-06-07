class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1; // increment last element by 1
        
        // check if any element from i=digits.length-1 to i=1 is equal to 10 after increment
        // if found then replace 10 by 0 and add 1 to its previous element
        for(int i = digits.length - 1; i> 0; i--){
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i-1] += 1;
            }
        }
        
        // if first element becomes 10 on adding then a new array needs to be created with first element = 1 and second element = 0
        if(digits[0] == 10 ){
            int [] digits2 = new int[digits.length+1];
            digits2[0]= 1; 
            digits2[1]= 0;

            // other elements, if present, are added to the new array(digits2)
            int i = 2;
            while(i<digits.length){
                digits2[i] = digits[i-1];
                i++;
            }
            return digits2;
        }
        return digits;
    }
}
