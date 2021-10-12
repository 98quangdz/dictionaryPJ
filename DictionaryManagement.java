import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryManagement  {

    public static Dictionary dictionary = new Dictionary();

    /**.
     *them Word tu commandLine
     */
    public static void insertFromCommandline() {
        Scanner input = new Scanner(System.in);
        String word_target = input.next();
        String word_explain = input.next();
        Word word = new Word(word_target, word_explain);
        dictionary.wordList.add(word);
    }

    /**.
     *Them Word tu file
     * voi duong vao la bien final FILE_INPUT
     */
    public static void insertFromFile() {
        Scanner input = null;
        try {
            input = new Scanner(new File(dictionary.FILE_INPUT));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String word_target;
        String word_explain;
        while (input.hasNext()) {
            word_target = input.next();
            word_explain = input.next();
            Word word = new Word(word_target, word_explain);
            dictionary.wordList.add(word);
        }
        System.out.println("----da nhap xong tu file :" + dictionary.FILE_INPUT + "---------");
    }

    /**.
     *VD: home -> nha
     */
    public static void dictionaryLookup() {
        Scanner input = new Scanner(System.in);
        boolean trap = false;
        System.out.print("Tu can tim :");
        String find_word = input.next();
        for (Word word :dictionary.wordList) {
            if (find_word.equals(word.getWord_target())) {
                System.out.println("Translate :" + word.getWord_explain());
                trap = true;
            }
        }
        if (trap == false) {
            System.out.println("Khong tim thay");
        }
    }

    /**.
     *VD : tra -> transaction , transalate ,...
     */
    public static void dictionarySearcher() {
        Scanner input = new Scanner(System.in);
        boolean trap = false;
        System.out.print("Tu can tim :");
        String find_word = input.next();
        for (Word word :dictionary.wordList) {
            if (word.getWord_target().indexOf(find_word) == 0) {
                System.out.print(" - " + word.getWord_target());
                trap = true;
            }
        }

        if (trap == false) {
            System.out.print("Khong tim thay");
        }
        System.out.println();
    }
}
