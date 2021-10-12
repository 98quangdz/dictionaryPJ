import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryCommandline extends DictionaryManagement {

    /**.
     *
     */
    public static void showAllWord() {
        int  i = 1;
        System.out.println("English         |VietNamese");
        for (Word d : dictionary.wordList) {
            System.out.println(d.getWord_target() + "        |" + d.getWord_explain());
        }
    }

    /**.
     *
     */
    public static void dictionaryBasic() {
        String val = "read";
        Scanner input = new Scanner(System.in);
        while (val.compareTo("end") != 0) {
            val = input.nextLine();
            if (val.equals("nhap")) {
                insertFromCommandline();
            } else if (val.equals("show")) {
                showAllWord();
            }
        }
    }

    /**.
     *
     */
    public static void dictionaryAddvanced() {
        String read = "read";
        Scanner input = new Scanner(System.in);
        while (read.compareTo("end") != 0) {
            System.out.print("nhap tuy chon :");
            read = input.next();
            if (read.equals("insert")) {
                insertFromFile();
            } else if (read.equals("lookup")) {
                dictionaryLookup();
            } else if (read.equals("show")) {
                showAllWord();
            } else if (read.equals("search")) {
                dictionarySearcher();
            }
        }
    }
    public static void main(String[] args) {
        dictionaryBasic();
        //dictionaryAddvanced();
    }
}
