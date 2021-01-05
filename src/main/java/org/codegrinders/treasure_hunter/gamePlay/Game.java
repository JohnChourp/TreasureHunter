package org.codegrinders.treasure_hunter.gamePlay;

import org.codegrinders.treasure_hunter.model.Puzzle;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Game {

    @Autowired
    Players players;

    @Autowired
    Markers markers;

    @Autowired
    Questions questions;

    public void initLists(){
        markers.fillMarkerList();
        questions.fillQuestionsList();
    }







}
