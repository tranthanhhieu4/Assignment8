
package Assignment8;

public class ReverseaString {
    public static String reverseString(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        String inputString="hello";
        String reverseChar=reverseString(inputString);
        System.out.println("the reverse of the string "+inputString+" Is: "+reverseChar);
        
    }
}
