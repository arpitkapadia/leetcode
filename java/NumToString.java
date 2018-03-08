class NumToString {
    public String numberToWords(int num) {
        String [] numInWords = {"dummy", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String [] tenPositionInWords = {"dummy", "dummy", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String [] thousandPosition = {"" , "Hundred", "Thousand", "Million", "Billion"};
        int temp = 0, count = 0;
        int hundredDigit = 0;
        String output = "";
        int lastTwoDigits = 0;


        while(num > 0) {
        	String temp_str = "";
        	System.out.println(num);
        	temp = num % 1000;
        	count += 1;
        	lastTwoDigits = temp % 100;

        	hundredDigit = (int)temp / 100;

        	temp_str += hundredDigit>0 ? (numInWords[hundredDigit] +" "+ thousandPosition[1]) : "";


        	output = (temp_str +" "+ ((lastTwoDigits < 20) ? numInWords[lastTwoDigits] : (tenPositionInWords[(int)lastTwoDigits / 10] + " " +
        			  numInWords[lastTwoDigits % 10])) + (count > 1 ? " " + thousandPosition[count]	 : "")	 + " " + output);

        	num = (int)num / 1000;


        }
        return output.trim();
        
        
    }

    public static void main(String args[]) {
    	NumToString st = new NumToString();
    	System.out.println(st.numberToWords(1234567));
    }
}			