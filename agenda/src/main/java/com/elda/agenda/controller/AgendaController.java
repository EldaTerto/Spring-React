package com.elda.agenda.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elda.agenda.controller.model.AgendaModel;



@CrossOrigin
@RestController
@RequestMapping("agenda")
public class AgendaController {
    @GetMapping
    public List<AgendaModel> getAgenda(){
        List<AgendaModel>list = new ArrayList<AgendaModel>();
        list.add(new AgendaModel("Elda", "81996636058", "eldaterto@gmail.com", "50711-280"));
        list.add(new AgendaModel("Elda", "81996636058", "eldaterto@gmail.com", "50711-280"));
        list.add(new AgendaModel("Elda", "81996636058", "eldaterto@gmail.com", "50711-280"));
        list.add(new AgendaModel("Elda", "81996636058", "eldaterto@gmail.com", "50711-280"));
        return list;
    }

}