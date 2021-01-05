package org.codegrinders.treasure_hunter.gamePlay;

import org.codegrinders.treasure_hunter.model.Puzzle;
import org.codegrinders.treasure_hunter.service.PuzzleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Questions {

    @Autowired
    PuzzleService puzzleService;

    private List<Puzzle> questionsList = new ArrayList<>();

    public List<Puzzle> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Puzzle> questionsList) {
        this.questionsList = questionsList;
    }

    public void fillQuestionsList(){
        setQuestionsList(puzzleService.findAll());
    }
}
