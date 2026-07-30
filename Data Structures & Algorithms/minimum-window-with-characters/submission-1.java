class Solution {
    public String minWindow(String s, String t) {
        if (s == "")
        return "";

        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i< t.length(); i++)
        count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) + 1);

        int left = 0;
        int [] sub = {-1, -1};
        int subLen = Integer.MAX_VALUE;
        int have = 0;
        int need = count.size();

        for (int right = 0; right < s.length(); right ++)
        {
            char str = s.charAt(right);
            window.put(str, window.getOrDefault(str, 0) + 1);

            if (count.containsKey(str) && count.get(str) == window.get(str))
            have++;

            while (have == need)
            {
                if ((right - left + 1) < subLen)
                {
                    subLen = right - left + 1;
                    sub[0] = left;
                    sub[1] = right;
                }

                char start = s.charAt(left);

                window.put(start, window.get(start) - 1);

                if (count.containsKey(start) && count.get(start) > window.get(start))
                have--;

                left ++;
            }
        }

        return (subLen != Integer.MAX_VALUE) ? s.substring(sub[0], sub[1] + 1) : "";
    }
}
