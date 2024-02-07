package com.zeta.zetacarsselling.controller;

import com.zeta.zetacarsselling.model.Favorites;
import com.zeta.zetacarsselling.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/favorites")
public class FavoritesController {

    private FavoritesService favoritesService;

    @Autowired
    public FavoritesController(FavoritesService favoritesService) {
        this.favoritesService = favoritesService;
    }

    @GetMapping("/{favoritesId}")
    public Optional<Favorites> findOne(@PathVariable int favoritesId){
        return favoritesService.findOne(favoritesId);
    }

    @GetMapping("/")
    public List<Favorites> findAll(){
        return favoritesService.findAll();
    }

    @PostMapping("/")
    public void post(@RequestBody Favorites favorites){
        favoritesService.save(favorites);
    }

    @PutMapping("/")
    public void update(@RequestBody Favorites favorites){
        favoritesService.save(favorites);
    }

    @DeleteMapping("/{favoritesId}")
    public void delete(@PathVariable int favoritesId){
        favoritesService.delete(favoritesId);
    }
}
