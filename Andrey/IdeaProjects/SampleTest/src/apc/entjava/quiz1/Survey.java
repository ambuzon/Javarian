package apc.entjava.quiz1;

import javax.faces.bean.ManagedBean;

@ManagedBean


public class Survey {

    private String answer1;
    private String answer2;
    private String answer3;

    public Survey(){
        for(int i=0; i<ans1.length; i++){
            String a = ans1[i];
        }

        for(int i=0; i<ans2.length; i++){
            String b = ans2[i];
        }

        for(int i=0; i<ans3.length; i++){
            String c = ans3[i];
        }
    }

    public String[] getAns1() {return ans1;}

    public String[] getAns2() {return ans2;}

    public String[] getAns3() {return ans3;}

    public String getAnswer1() {        return answer1;    }

    public void setAnswer1(String answer1) {        this.answer1 = answer1;    }

    public String getAnswer2() {        return answer2;    }

    public void setAnswer2(String answer2) {        this.answer2 = answer2;    }

    public String getAnswer3() {        return answer3;    }

    public void setAnswer3(String answer3) {        this.answer3 = answer3;    }

    private String[] ans1 = {"(1) Not knowledgeable at all", "(2) Lacks a lot of knowledge", "(3) Quite knowledgeable", "(4) Very knowledgeable"};

    private String[] ans2 = {"(1) No knowledge whatsoever", "(2) Very little knowledge", "(3) Basic knowledge but no mastery", "(4) I have mastery of JSF"};

    private String[] ans3 = {"(1) Not willing to learn new language", "(2) Quite willing, with the right motivation","(3) Willing to learn, as long as someone teaches me", "(4) Very willing, even to self-study"};



    public double getTotalAmount() {
        TotalAmount = TotalKwhConsumed * X;
        return TotalAmount;
    }

    public int getTotalKwhConsumed() {
        TotalKwhConsumed = PresentReading - PreviousReading;
        return TotalKwhConsumed;
    }

    public double getX() {
        return X;
    }

    private double TotalAmount;
    private int TotalKwhConsumed;
    private double X;

    public String submit() {
        if(this.ans1.equals("(1) Not knowledgeable at all")){
            this.X = 1;
        }
        else if(this.ans1.equals("(1) Not knowledgeable at all")){
            this.X = 2;
        }
        else if(this.ans1.equals("(1) Not knowledgeable at all")) {
            this.X = 3;
        }
        else if(this.ans1.equals("(1) Not knowledgeable at all")) {
            this.X = 4;
        }
        if(this.ans2.equals("Commercial")){
            this.X = 2.50;
        }

        return "result";
    }
}
