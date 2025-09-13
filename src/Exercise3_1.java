import java.util.ArrayList;

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
    // Supposed to count the amount of vowels there are in a given text(string)
    public int countVowels(String text){
        int vowelCount = 0;
        String vowels = "aeiouy";
        for (int letterIndex = 0; letterIndex < text.trim().length(); letterIndex++){
            char charInText = text.trim().charAt(letterIndex);
            for (int vowelIndex = 0; vowelIndex < vowels.length() - 1; vowelIndex++){
                if (charInText == vowels.charAt(vowelIndex)){
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }

    // Supposed to count the amount of words there are in a given text(string)
    // Including numbers eg.(year 1993 was good) is 4 words
    public int countWords(String text){
        text = text.trim().toLowerCase();
        String alphabetString = "abcdefghijklmnopqrstuvwxyzåäö0123456789";
        char[] alphabet = alphabetString.toCharArray();
        int wordCount = 0;
        //Finding out if the text starts with a word
        for (char letter : alphabet){
            if (text.charAt(0) == letter){
                wordCount++;
                break;
            }
        }
        for (int i = 1; i < text.trim().length(); i++){
            if (text.charAt(i) == ' '){
                for (char letter : alphabet){
                    if (text.charAt(i+1) == letter){
                        wordCount++;
                        i++;
                        break;
                    }
                }
            }
        }
        return wordCount;
    }

    public String capitalizeWords(String text){
        text = text.trim().toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        ArrayList<Integer> firstLetterOfWordsIndex = HelperMethods.startOfWordIncludingNumbers(text);
        for (int i = 0; i < firstLetterOfWordsIndex.size(); i++){
            int arrayIndex = firstLetterOfWordsIndex.get(i);
            sb.setCharAt(arrayIndex, Character.toUpperCase(text.charAt(arrayIndex)));
        }
        return sb.toString();
    }
}
