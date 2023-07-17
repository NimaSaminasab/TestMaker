package com.example.testmaker;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    private String question;
    private String answerAlternative1;
    private String answerAlternative2;
    private String answerAlternative3;
    private String rightAnswer;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    Set<PersonQuestion> PersonQuestionList;


    public Question() {
    }

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

}
