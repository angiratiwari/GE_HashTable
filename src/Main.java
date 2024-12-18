public class Main {
    public static void main(String[] args) {

        // UC 1: Find the Frequency of Words in a Sentence
        String sentence = "To be or not to be";
        String[] words = sentence.split(" ");
        HashTable<String, Integer> hashTable = new HashTable<>(10);

        for (String word : words) {
            Integer count = hashTable.get(word);
            if (count == null) {
                count = 0;
            }
            hashTable.insert(word, count + 1);
        }

        // Display frequencies for UC 1
        System.out.println("Word frequencies in sentence:");
        for (String word : words) {
            System.out.println(word + ": " + hashTable.get(word));
        }

        // UC 2: Find the Frequency of Words in a Large Paragraph
        String paragraph = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid " +
                "avoidable situations";
        String[] largeWords = paragraph.split(" ");
        HashTable<String, Integer> largeTextHashTable = new HashTable<>(50);

        for (String word : largeWords) {
            Integer count = largeTextHashTable.get(word);
            if (count == null) {
                count = 0;
            }
            largeTextHashTable.insert(word, count + 1);
        }

        // Display frequencies for UC 2
        System.out.println("\nWord frequencies in paragraph:");
        for (String word : largeWords) {
            System.out.println(word + ": " + largeTextHashTable.get(word));
        }
    }
}