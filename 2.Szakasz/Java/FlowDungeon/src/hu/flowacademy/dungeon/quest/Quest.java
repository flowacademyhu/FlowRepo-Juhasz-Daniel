package hu.flowacademy.dungeon.quest;

import java.util.List;

public class Quest {

    private String question;

    private Options rightOption;

    private List<Options> options;

    public Quest(String question, Options rightOption, List<Options> options) {
        this.question = question;
        this.rightOption = rightOption;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Options getRightOption() {
        return rightOption;
    }

    public void setRightOption(Options rightOption) {
        this.rightOption = rightOption;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }
}
