package com.alterra.apachePoi.repositories;

import com.alterra.apachePoi.entities.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepo extends JpaRepository<Coin, Long> {
}
