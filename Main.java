import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "input.txt";
        
        int wordCount = PicnicAnalyzer.countWords(fileName);
        System.out.println("Количество слов в файле: " + wordCount);

        String longestWord = LongestWordFinder.findLongestWord(fileName);
        System.out.println("Самое длинное слово в файле: " + longestWord);

        Map<String, Integer> wordFrequency = WordFrequencyCalculator.calculateWordFrequency(fileName);
        System.out.println("Частота слов в файле:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
