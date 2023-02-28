package com.example.testmaker;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id ;
    private String question ;
    private String answerAlternative1 ;
    private String answerAlternative2 ;
    private String answerAlternative3 ;
    private String rightAnswer ;
    @OneToMany(mappedBy = "question",cascade= CascadeType.ALL)
    Set<PersonQuestion> PersonQuestionList ;


    public Question(){}
    public Question(String question, String answerAlternative1, String answerAlternative2, String answerAlternative3, String rightAnswer) {
        this.question = question;
        this.answerAlternative1 = answerAlternative1;
        this.answerAlternative2 = answerAlternative2;
        this.answerAlternative3 = answerAlternative3;
        this.rightAnswer = rightAnswer;
    }

    public long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerAlternative1() {
        return answerAlternative1;
    }

    public void setAnswerAlternative1(String answerAlternative1) {
        this.answerAlternative1 = answerAlternative1;
    }

    public String getAnswerAlternative2() {
        return answerAlternative2;
    }

    public void setAnswerAlternative2(String answerAlternative2) {
        this.answerAlternative2 = answerAlternative2;
    }

    public String getAnswerAlternative3() {
        return answerAlternative3;
    }

    public void setAnswerAlternative3(String answerAlternative3) {
        this.answerAlternative3 = answerAlternative3;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
