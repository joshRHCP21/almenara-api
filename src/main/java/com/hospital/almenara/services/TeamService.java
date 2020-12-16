package com.hospital.almenara.services;

import com.hospital.almenara.entity.Team;
import com.hospital.almenara.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamRepository repository;

    public List<Team> findAll(){
        return repository.findAll();
    }
}
