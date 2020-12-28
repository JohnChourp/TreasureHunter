package org.codegrinders.treasure_hunter.gamePlay;

import org.codegrinders.treasure_hunter.model.Marker;
import org.codegrinders.treasure_hunter.service.MarkerService;

import java.util.ArrayList;
import java.util.List;

public class Markers {

    MarkerService markerService = new MarkerService();

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
