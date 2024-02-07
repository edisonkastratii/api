package com.zeta.zetacarsselling.service;

import com.zeta.zetacarsselling.model.Favorites;
import com.zeta.zetacarsselling.repository.FavoritesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoritesService {
    private FavoritesRepository favoritesRepository;

    @Autowired
    public FavoritesService(FavoritesRepository favoritesRepository) {
        this.favoritesRepository = favoritesRepository;
    }

    public Optional<Favorites> findOne(int id){
        return favoritesRepository.findById(id);
    }

    public List<Favorites> findAll(){
        return favoritesRepository.findAll();
    }

    public void save(Favorites favorites){
        favoritesRepository.save(favorites);
    }

    public void delete(int id){
        favoritesRepository.deleteById(id);
    }
}
