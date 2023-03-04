import React from 'react';
import './test.css' ;
import { useState, useEffect} from 'react';
import { QuestionModel } from '../Model/question.model';
import { Button } from '@mui/material';
import { RadioButtonsGroup } from '../Components/radioButton';




const Test = ()=> {
  
  const[questionList, setquestionList]  =useState<QuestionModel[]>([
    {id : 1 ,
    question : "",
    answerAlternative1 : "" ,
    answerAlternative2 : "",
    answerAlternative3 : "",
    rightAnswer : ""}
])
 useEffect(() => {
     fetch("http://localhost:8080/getAllQuestions")
     .then(res=>res.json())
     .then((result)=>{
          setquestionList(result)
         
     }
)
},[])
  return (
  
    <div className='Test'>
       <table>
       <tbody>
       <thead>
       {questionList.map(item => <tr>
            <td> <RadioButtonsGroup question={item.question} 
            answerAlternative1 = {item.answerAlternative1}
            answerAlternative2 = {item.answerAlternative2}
            answerAlternative3 = {item.answerAlternative3}></RadioButtonsGroup>
                </td>
               </tr>)}
                </thead>
               

          </tbody>
       </table>
    </div>
  );
}

export default Test;

