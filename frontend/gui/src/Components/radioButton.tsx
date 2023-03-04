import * as React from 'react';
import Radio from '@mui/material/Radio';
import RadioGroup from '@mui/material/RadioGroup';
import FormControlLabel from '@mui/material/FormControlLabel';
import FormControl from '@mui/material/FormControl';
import FormLabel from '@mui/material/FormLabel';
import './radioButton.css'


  type RadioButtonsGroupProps={
    question: string ;
    answerAlternative1 : string ;
    answerAlternative2 : string ;
    answerAlternative3 : string ;
    
};


export function RadioButtonsGroup ({question, answerAlternative1,answerAlternative2, answerAlternative3} : RadioButtonsGroupProps){
  return (
    <FormControl>
      <FormLabel id="demo-radio-buttons-group-label">{question}</FormLabel>
      <RadioGroup
        aria-labelledby="demo-radio-buttons-group-label"
        defaultValue="female"
        name="radio-buttons-group"
      >
        <FormControlLabel value="alt1" control={<Radio />} label={answerAlternative1} />
        <FormControlLabel value="alt2" control={<Radio />} label={answerAlternative2} />
        <FormControlLabel value="alt3" control={<Radio />} label={answerAlternative3} />
      </RadioGroup>
    </FormControl>
  );
  
}
