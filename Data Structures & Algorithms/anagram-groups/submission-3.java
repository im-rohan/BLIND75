class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> anagrams = new HashMap <>();

        for (int i=0; i<strs.length; i++)
        {
            String string = strs[i];
            char [] str_arr = string.toCharArray();

            int [] count = new int [26];
            Arrays.fill(count, 0);

            for (char ch: str_arr)
            {

                count[(int)ch - (int)'a'] += 1;
            }
            String key = Arrays.toString(count);
            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(string);
        }

        return new ArrayList <> (anagrams.values());
    }
}
