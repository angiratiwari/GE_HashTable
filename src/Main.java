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
    }
}