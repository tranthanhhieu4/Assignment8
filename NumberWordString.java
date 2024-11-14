package Assignment8;

public class NumberWordString {
    public static int countWords(String str){
        if(str ==null||str.trim().isEmpty()){
            return 0;
        }
        String []words=str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String inputString ="Java is fun";
        int result=countWords(inputString);
        System.out.println("the String: "+inputString+ " has "+result+" words ");
    }
    
}
