package Assignment8;

public class SplitWordString {
    public static String[] splitWords(String str){
        return str.split(" ");
    }
    public static void main(String[] args) {
        String inputString="Java is fun";
        String[]wordArray=splitWords(inputString);
        for(String word:wordArray){
            System.out.println(word);
        }
        
    }
}
