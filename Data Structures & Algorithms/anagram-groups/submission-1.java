class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> count = new HashMap <>();

        for (int i=0; i<strs.length; i++)
        {
            String string = strs[i];
            char [] str_arr = string.toCharArray();
            Arrays.sort(str_arr);
            String key = String.valueOf(str_arr);
            count.computeIfAbsent(key, k -> new ArrayList<>()).add(string);
        }

        return new ArrayList <> (count.values());
    }
}
