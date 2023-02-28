package com.example.testmaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonQuestionService {
    @Autowired
    PersonQuestionRepository personQuestionRepository ;

    public PersonQuestion getOnePersonQuestion(long id){
        return personQuestionRepository.findById(id).orElse(null) ;
    }
    public List<PersonQuestion> getAllPersonQuestion(){
        return (List<PersonQuestion>) personQuestionRepository.findAll();
    }
    public PersonQuestion registerPersonQuestion(Person person,Question question, String givenAnswer){
        PersonQuestion personQuestion = new PersonQuestion(person,question,givenAnswer);
        if(givenAnswer.equals(question.getRightAnswer()) )
            personQuestion.setNumberOfCorrectAnswer(personQuestion.getNumberOfCorrectAnswer()+1 );
        return personQuestionRepository.save(personQuestion) ;
    }



}
