package org.codegrinders.treasure_hunter.service;

import org.codegrinders.treasure_hunter.model.Marker;
import org.codegrinders.treasure_hunter.repository.MarkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarkerService {

    @Autowired
    MarkerRepository markerRepository;

    public List<Marker> findAll() {
        return markerRepository.findAll();
    }

    public Optional<Marker> findById(String id) {
        return markerRepository.findById(id);
    }
}