package com.example.demo.Controller;

import com.example.demo.Model.Team;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TrelloController {
    public static List<Team> lista = new ArrayList<Team>();

    @RequestMapping(value="/grupo", method=RequestMethod.GET)
    public List<Team> getTeams() {
        return lista;
    }

    @RequestMapping(value="/grupo", method=RequestMethod.POST)
    public List<Team> addTeam(Team team) {
        return lista;
    }
}