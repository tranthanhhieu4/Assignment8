/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment8;

public class StringPalindrome {
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        
         return true;       
    }
    public static void main(String[] args) {
        String inputString="madam";
        boolean result=isPalindrome(inputString);
        System.out.println(inputString+" is palindrome: "+result);
        
    }
    
}
