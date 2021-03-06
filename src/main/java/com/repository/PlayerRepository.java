package com.repository;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.Player;

/**
 * MongoRepository for Player collection
 * 
 * @author aditiphadke
 *
 */
public interface PlayerRepository extends MongoRepository<Player, Serializable> {

	public Player findByName(String name);

	public Player findById(ObjectId id);

	public List<Player> findByTournaments(String tournament);
	
	

}
