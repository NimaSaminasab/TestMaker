package com.example.testmaker;

import jakarta.persistence.*;

@Entity
public class PersonQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id ;
    @ManyToOne
    @JoinColumn(name = "Person_id")
    Person person ;
    @ManyToOne
    @JoinColumn(name = "Question_id")
    Question question ;

    String givenAnswer ;
    int numberOfCorrectAnswer ;
    public PersonQuestion(){}

    public PersonQuestion(Person person, Question question, String givenAnswer) {
        this.person = person;
        this.question = question;
        this.givenAnswer = givenAnswer;
    }

    public long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Question getQuestion() {
        return question;
    }

    public String getGivenAnswer() {
        return givenAnswer;
    }

    public void setGivenAnswer(String givenAnswer) {
        this.givenAnswer = givenAnswer;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getNumberOfCorrectAnswer() {
        return numberOfCorrectAnswer;
    }

    public void setNumberOfCorrectAnswer(int numberOfCorrectAnswer) {
        this.numberOfCorrectAnswer = numberOfCorrectAnswer;
    }
}
