package com.zeta.zetacarsselling.repository;

import com.zeta.zetacarsselling.model.Favorites;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritesRepository extends JpaRepository<Favorites, Integer> {
}
