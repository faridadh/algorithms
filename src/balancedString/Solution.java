package balancedString;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String S) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        for( Character c : S.toCharArray()){
            if(map.containsKey(c)){
                stack.addFirst(c);
            } else {
                Character ops = stack.pollFirst();
                if(map.get(ops) != c){
                    return 0;
                }
            }
        }

        return (stack.peekFirst()!=null) ? 0 : 1;
    }
}