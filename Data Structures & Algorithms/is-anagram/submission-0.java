class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        return false;

        String s_array [] = s.split("");
        String t_array [] = t.split("");
        Arrays.sort(s_array);
        Arrays.sort(t_array);

        String s_sort = String.join("", s_array);
        String t_sort = String.join("", t_array);

        if(s_sort.equals(t_sort))
        return true;

        return false;

    }
}
