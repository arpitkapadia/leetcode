class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        try {
            for(int i = 0; i < s.length(); i++) {
                System.out.println("**" +s+ "**");
                if(Character.isWhitespace(s.charAt(i)) || (!Character.isDigit(s.charAt(i)) && ((s.charAt(i) != 'e') || (s.charAt(i) != '.')))) {
                    return false;
                } 
            }
            double d = Double.parseDouble(s);
            
        } catch(Exception e) {
            return false;
        }
        return true;
        
    }
}