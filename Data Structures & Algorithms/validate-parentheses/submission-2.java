class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Hashtable<Character, Character> openToClose = new Hashtable<>();
        openToClose.put(')', '(');
        openToClose.put(']', '[');
        openToClose.put('}', '{');

        for (int i=0; i<s.length(); i++)
        {
            if (openToClose.containsKey(s.charAt(i)))
            {
                if (!stack.isEmpty() && stack.peek() == openToClose.get(s.charAt(i)))
                stack.pop();
                else
                return false;
            }
            else
            stack.push(s.charAt(i));
        }

        if (stack.isEmpty())
        return true;
        else
        return false;
    }
}
