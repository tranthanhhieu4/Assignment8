package Assignment8;

public class CountString {
 public static int countCharacter(String str ,char target){
     int count =0;
     for(int i=0;i<str.length();i++){
         if(str.charAt(i)==target){
             count ++;
             
         }
     } return count;
     
 }

    public static void main(String[] args) {
        String inputString="hello world";
        char charTocount='o';
        int result=countCharacter(inputString,charTocount);
        System.out.println("The character "+charTocount+" appears "+result+ " times");
        
    }
    
}
