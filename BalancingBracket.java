public class BalancingBracket {
        public static boolean isBalanced(String s) {
        int count1 = 0; // count for '(''
        int count2 = 0; // count for '['
        int count3 = 0; // count for '!'
        for (int i= 0;i< s.length(); i++){
        char c = s.charAt(i);
        if(c=='('){
        count1++;
        }
        else if (c==')'){count1--;
        }else if (c =='['){count2++;}
        else if (c==']'){
        count2--;
        } else if (c =='{'){
        count3++;
        }else if(c=='}'){
        count3--;
        }
        if (count1 < 0 || count2 < 0 || count3 < 0)
        {
        return false; // More closing brackets than opening ones
        }
        }
        return count1 == 0 && count2 == 0 && count3 == 0;
     } // Check if all opening brackets are closed
        public static void main(String[] args){
        String testString ="{[()]}";
        System.out.println("Is balanced:"+isBalanced(testString));
        }
 }

