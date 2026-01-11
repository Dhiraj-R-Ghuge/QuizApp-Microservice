package com.Dhiraj.question_service.controller;


import com.Dhiraj.question_service.model.Question;
import com.Dhiraj.question_service.model.QuestionWrapper;
import com.Dhiraj.question_service.model.Response;
import com.Dhiraj.question_service.service.questionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    questionservice questionser;
    @Autowired
    Environment environment;


    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return  questionser.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionbyCategory(@PathVariable String category){
        return questionser.getQuestionBycategory(category);
    }
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return  questionser.addQuestion(question);
    }
    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryname,@RequestParam Integer Numofquestions){
        return questionser.getQuestionsForQuiz(categoryname,Numofquestions);
    }
    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds){
        System.out.println(environment.getProperty("local.server.port"));
        return questionser.getQuestionsFromId(questionIds);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses)
    {
        return questionser.getScore(responses);
    }
 }
