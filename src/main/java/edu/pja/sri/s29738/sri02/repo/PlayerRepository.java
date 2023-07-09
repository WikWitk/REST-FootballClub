package edu.pja.sri.s29738.sri02.repo;

import edu.pja.sri.s29738.sri02.model.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findAll();
}
