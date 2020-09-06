class Solution {


  private HashMap<Character, Character> mappings;


  public Solution() {
    this.mappings = new HashMap<Character, Character>();
    this.mappings.put(')', '(');
    this.mappings.put('}', '{');
    this.mappings.put(']', '[');
  }

  public boolean isValid(String s) {


    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);


      if (this.mappings.containsKey(c)) {


        char topElement = stack.empty() ? '#' : stack.pop();


        if (topElement != this.mappings.get(c)) {
          return false;
        }
      } else {

        stack.push(c);
      }
    }

    return stack.isEmpty();
  }
}

"Runtime: 1 ms, faster than 99.05% of Java online submissions for Valid Parentheses."
"Memory Usage: 37.6 MB, less than 60.21% of Java online submissions for Valid Parentheses."
