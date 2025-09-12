public class Exercise3_1 {
    String reversedText;

    public String reverseString(String text){
        text = text.trim();
        reversedText = "";
        char[] letterArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++){
            reversedText += letterArray[text.length() - 1 - i];
        }
        return reversedText;
    }
}
