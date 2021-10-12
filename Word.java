public class Word {
    private String word_target;
    private String word_explain;

    /**.
     *
     */
    Word() {
        this.word_explain = null;
        this.word_target = null;
    }

    /**
     *
     * @param word_explain
     * @param word_target
     */
    Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
    /**.
     *
     * @param word_explain
     */
    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    /**.
     *
     * @param word_target
     */
    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    /**.
     *
     * @return
     */
    public String getWord_explain() {
        return word_explain;
    }

    /**.
     *
     * @return
     */
    public String getWord_target() {
        return word_target;
    }
}
