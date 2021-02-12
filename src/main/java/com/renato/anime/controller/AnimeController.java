package com.renato.anime.controller;

import com.renato.anime.domain.Anime;
import com.renato.anime.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {
    @Autowired
    private DateUtil dateUtil;
    @GetMapping(path = "list")
    public List<Anime> list(){
        return List.of(new Anime("isekai houkai"),new Anime("black clover"));
    }
}
