package com.tyk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tyk.entity.Player;
@Repository
public interface PlayerRepository  extends CrudRepository<Player, Integer>{

}
