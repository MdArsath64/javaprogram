public class String_Split {
    public static void main(String[] args){
    String str = "Hello World!";
    String[] parts = str.split(" "); // Split the string by space
    // StringBuilder sb=new StringBuilderO);
    for (int i= 0; i< parts.length; i++){
    System.out.println("Part"+i+":"+parts[i]);
    String word=parts[i];
    String few=word.substring(0,2)+" "+word.substring(2);
    System.out.println(few);
    }
    }
    }