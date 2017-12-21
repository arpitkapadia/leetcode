class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;

        for(int i=digits.length-1; i>=0; i--) {
            int temp = 0;
            if(i == digits.length-1) {
                temp = digits[i] + 1 + carry;

            } else {
                temp = digits[i] + carry;

            }
            carry = 0;
            if(temp > 9) {
                carry = (int)temp / 10;
            }
            digits[i] = temp % 10;

        }
        if(carry > 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = carry;
            for(int i=1; i<digits.length+1; i++) {
                arr[i] = digits[i-1];
            }
            return arr;
        }
        return digits;

    }
}
