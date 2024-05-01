public class FindFrequencyOfString {
        public static void main(String[] args) {
        String s="abbdoyyzz";
        int i=0;
        while(i<s.length()){
        char c=s.charAt(i);
        int one=s.indexOf(c);
        int two=s.lastIndexOf(c);
        i=two;
        int tot=two-one+1;
        System.out.println(s.charAt(i)+"->"+tot);
        i++;
        }
        }
        }
