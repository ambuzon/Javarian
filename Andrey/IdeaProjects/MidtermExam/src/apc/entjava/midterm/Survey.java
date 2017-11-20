package apc.entjava.midterm;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Survey {

    public String[] getFirstSet() {
        return firstSet;
    }

    private String[] firstSet = {"Not knowledgeable at all", "Lacks a lot of knowledge", "Quite knowledgeable", "Very knowledgeable"};
    private String[] secondSet = {"No knowledge whatsoever", "Very little knowledge", "Basic knowledge but no mastery", "I have mastery of JSF"};
    private String[] thirdSet = {"Not willing to learn new language", "Quite willing, with the right motivation", "Willing to learn, as long as someone teaches me", "Very willing, even to self-study"};

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    private String answer1;
    private String answer2;
    private String answer3;


    public int getQuestionOne() {
        return questionOne;
    }

    public int getQuestionTwo() {

        return questionTwo;
    }

    public int getQuestionThree() {

        return questionThree;
    }


    private int questionOne;
    private int questionTwo;
    private int questionThree;
    private double meanScore;

    public double getMeanScore() {
        meanScore = questionOne + questionTwo + questionThree;
        meanScore = meanScore/3;
        return meanScore;
    }

    public String[] getSecondSet() {
        return secondSet;
    }

    public String[] getThirdSet() {
        return thirdSet;
    }

    public String submit() {
        if(answer1.equals("Not knowledgeable at all")){
            this.questionOne = 1;
        }
        else if(answer1.equals("Lacks a lot of knowledge")){
            this.questionOne = 2;
        }
        else if(answer1.equals("Quite knowledgeable")){
            this.questionOne = 3;
        }
        else if(answer1.equals("Very knowledgeable")){
            this.questionOne = 4;
        }

        if(answer2.equals("No knowledge whatsoever")){
            this.questionTwo = 1;
        }
        else if(answer2.equals("Very little knowledge")){
            this.questionTwo = 2;
        }
        else if(answer2.equals("Basic knowledge but no mastery")){
            this.questionTwo = 3;
        }
        else if(answer2.equals("I have mastery of JSF")){
            this.questionTwo = 4;
        }

        if(answer3.equals("Not willing to learn new language")){
            this.questionThree = 1;
        }
        else if(answer3.equals("Quite willing, with the right motivation")){
            this.questionThree = 2;
        }
        else if(answer3.equals("Willing to learn, as long as someone teaches me")){
            this.questionThree = 3;
        }
        else if(answer3.equals("Very willing, even to self-study")){
            this.questionThree = 4;
        }
        return "result";
    }
}
