package Assignment8;

public class RemoveSpaceString {
    public static String removeExtraSpaces(String str) {
        if (str == null) {
            return null;
        }
        return str.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String inputString = "   Hello   World   ";
        String result = removeExtraSpaces(inputString);
        System.out.println("The String: "+inputString+" become "+result);
}
}

