import java.util.ArrayList;

public class HelperMethods {
    public void startOfWordExcludingNumbers(){

    }
    // Finds indexes of the first letter in every word in the given text
    static ArrayList<Integer> startOfWordIncludingNumbers(String text){
        ArrayList<Integer> indexArrayList = new ArrayList<>();
        text = text.toLowerCase();
        String alphabetString = "abcdefghijklmnopqrstuvwxyzåäö0123456789";
        char[] alphabet = alphabetString.toCharArray();
        //Finding out if the text starts with a word
        for (char letter : alphabet){
            if (text.charAt(0) == letter){
                indexArrayList.add(0);
                break;
            }
        }
        for (int i = 1; i < text.trim().length(); i++){
            if (text.charAt(i) == ' '){
                for (char letter : alphabet){
                    if (text.charAt(i+1) == letter){
                        indexArrayList.add(i+1);
                        i++;
                        break;
                    }
                }
            }
        }
        return indexArrayList;
    }
}
