import React from 'react';
import './test.css' ;
import {useState, useEffect} from 'react';
import {QuestionModel} from '../Model/question.model';
import {Button} from '@mui/material';
import {RadioButtonsGroup} from '../Components/radioButton';
import TestPagination from "../Components/testPagination";
import { test } from 'node:test';


const Test = () => {

    const [questionList, setquestionList] = useState<QuestionModel[]>([
        {
            id: 1,
            question: "",
            answerAlternative1: "",
            answerAlternative2: "",
            answerAlternative3: "",
            rightAnswer: ""
        }
    ])
    const [currentQuestionIndex, setCurrentQuestionIndex] = useState(0);
    

    useEffect(() => {
        fetch("http://localhost:8080/getAllQuestions")
            .then(res => res.json())
            .then((result) => {
                    setquestionList(result)
                }
            )
    }, [])

    function handleFinish() {
    }

    function handleNext() {
        setCurrentQuestionIndex(currentQuestionIndex + 1);
         
        
    }

    function handleLast() {
        setCurrentQuestionIndex(currentQuestionIndex - 1);


    }

    return (
        <div className='Test'>
            <div className="questionList">
                <RadioButtonsGroup  index={currentQuestionIndex} question={questionList[currentQuestionIndex].question}
                                   answerAlternative1={questionList[currentQuestionIndex].answerAlternative1}
                                   answerAlternative2={questionList[currentQuestionIndex].answerAlternative2}
                                   answerAlternative3={questionList[currentQuestionIndex].answerAlternative3}></RadioButtonsGroup>
                <div className="buttonContainer">
                    {currentQuestionIndex !== 0 && <Button onClick={handleLast}>Privous</Button>}
                    {currentQuestionIndex < questionList.length - 1 && <Button onClick={handleNext}>Next</Button>}
                    {currentQuestionIndex === questionList.length - 1 && <Button onClick={handleFinish}>Finish</Button>}
                </div>
                <TestPagination totalPages={questionList.length} currentIndex={currentQuestionIndex}/>
            </div>

        </div>

    );
}

export default Test;

