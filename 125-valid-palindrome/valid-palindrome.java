class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
      String r=s.replaceAll("[\\s\\p{Punct}]","").trim();
      StringBuilder sb = new StringBuilder(r);
      String res=sb.reverse().toString();
      if(res.equals(r)) return true;
      else return false;  
    }
}