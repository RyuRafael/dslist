package gamelist.dslist.dto.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gamelist.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {


}
