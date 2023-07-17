package com.example.testmaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PersonQuestionController {
    @Autowired
    PersonQuestionService personQuestionService;

    @Autowired
    UserService userService;

    @Autowired
    QuestionService questionService;


    @GetMapping("/getAllQuestionPerson")
    public List<PersonQuestion> getAllQuestionPerson(){
        return personQuestionService.getAllPersonQuestion();
    }
    @PostMapping("registerAnswerToQuestion/{questionId}/{personId}/{givenAnswer}")
    public void registerAnswerToQuestion(@PathVariable long questionId,@PathVariable long personId,@PathVariable String givenAnswer){
        Person person = userService.findUserById(personId) ;
        Question question = questionService.findQuestionById(questionId);
        personQuestionService.registerPersonQuestion(person,question,givenAnswer) ;
    }

}
