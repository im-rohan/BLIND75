class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder("");
        for (String str : strs)
        {
            encode.append(Integer.toString(str.length()));
            encode.append("@");
            encode.append(str);
        }
        String encoded = encode.toString();
        return encoded;

    }

    public List<String> decode(String str) {
        ArrayList<String> decode = new ArrayList<>();
        int index = 0;

        while (index < str.length())
        {
            int j = index;
            while(str.charAt(j) != '@')
            j++;
            int length = Integer.valueOf(str.substring(index, j));
            decode.add(str.substring(j+1, j+1+length));
            index = j+1+length;
        }

        return decode;
    }
}
