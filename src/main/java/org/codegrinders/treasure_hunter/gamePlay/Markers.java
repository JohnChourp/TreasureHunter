package org.codegrinders.treasure_hunter.gamePlay;

import org.codegrinders.treasure_hunter.model.Marker;
import org.codegrinders.treasure_hunter.service.MarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Markers {

    @Autowired
    MarkerService markerService;

    private List<Marker> markerList = new ArrayList<>();

    public List<Marker> getMarkerList() {
        return markerList;
    }

    public void setMarkerList(List<Marker> markerList) {
        this.markerList = markerList;
    }

    public void fillMarkerList(){
        setMarkerList(markerService.findAll());
    }



}
