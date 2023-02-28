package com.example.testmaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository ;
    public Question createQuestion(Question question){
        return questionRepository.save(question) ;
    }
    public void deleteQuestion(Question question){
        questionRepository.delete(question);
    }
    public List<Question> getListOfAllQuestions(){
        return (List<Question>) questionRepository.findAll();
    }
    public Question findQuestionById(long id){
        return questionRepository.findById(id).orElse(null) ;
    }
}
