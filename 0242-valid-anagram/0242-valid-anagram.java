class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }
    public static void main(String[] args)
    {
        Solution st = new Solution();
       boolean value = st.isAnagram("anagram", "nagaram");
       System.out.println(value);
    
    }
}