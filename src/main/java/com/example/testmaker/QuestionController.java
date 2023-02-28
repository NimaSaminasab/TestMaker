package com.example.testmaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    QuestionService questionService ;

    @GetMapping("/getAllQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getListOfAllQuestions();
    }
    @PostMapping("/createQuestion")
    @ResponseBody
    public void createQuestion(@RequestBody Question question){
        questionService.createQuestion(question) ;
    }

    @DeleteMapping("/deleteQuestion/{id}")
    @ResponseBody
    public void deleteQuestion(@PathVariable long id){
        Question question = questionService.findQuestionById(id);
        questionService.deleteQuestion(question);
    }

    @PutMapping("/editQuestion/{id}")
    @ResponseBody
    public void editQuestion(@PathVariable long id,@RequestBody Question question){
        Question questionOriginal = questionService.findQuestionById(id);
        questionOriginal.setQuestion(question.getQuestion());
        questionOriginal.setAnswerAlternative1(question.getAnswerAlternative1());
        questionOriginal.setAnswerAlternative2(question.getAnswerAlternative2());
        questionOriginal.setAnswerAlternative3(question.getAnswerAlternative3());
        questionOriginal.setRightAnswer(question.getRightAnswer());
        questionService.createQuestion(questionOriginal) ;
    }
}
