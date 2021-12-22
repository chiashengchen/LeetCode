package String;

import java.util.LinkedList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		test test1 = new test();
		String a = "abc";
		String b = new String("abc");
		System.out.println("b == a = " + (b == a));
		System.out.println("b.equals(a) = " + b.equals(a));
//		System.out.println("a.intern() == b = " + (a.intern() == b));
		System.out.println("a.hashCode() = " + a.hashCode());
		System.out.println("b.hashCode() = " + b.hashCode());
//		System.out.println(test1.generateParenthesis(1));
	}
	public List<String> generateParenthesis(int n) {
        LinkedList<String> ans = new LinkedList<String>();
        LinkedList<String> tmp = new LinkedList<String>();
        tmp.add("(");
        while(!tmp.isEmpty()) {
            String str = tmp.remove();
            if(isOpenParenthesisLimit(str, n)) {
                for(int i = 0; i < n*2 - str.length(); i++) {
                    str = str + ")";
                }
                ans.add(str);
            }
        }
        return ans;
    }
    
    private boolean isOpenParenthesisLimit(String str, int n) {
        int open_num = 0;
        for(int i = 0; i < str.length(); i++) {
        	var asd = String.valueOf(str.charAt(i));
        	if(String.valueOf(str.charAt(i)).equals("("))
                open_num++;
        }
        return n == open_num;
    }
}
