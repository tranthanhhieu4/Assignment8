
package Assignment8;


public class ConverString {
    public static String coverChar(String str){
        char[]chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            if(Character.isUpperCase(ch)){
                chars[i]=Character.toLowerCase(ch);
            } else if(Character.isLowerCase(ch)){
                chars[i]=Character.toUpperCase(ch);
            }
        }return new String (chars);
    }
    public static void main(String[] args) {
        String inputString="Hello World";
        String result=coverChar(inputString);
        System.out.println("The String "+inputString+" become: "+result);
        
        
    }
    
}
