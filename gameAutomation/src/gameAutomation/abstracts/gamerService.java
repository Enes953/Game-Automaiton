package gameAutomation.abstracts;

import gameAutomation.entities.gamer;

public interface gamerService {
	void add (gamer Gamer);
	void delete (gamer Gamer);
	void update (gamer Gamer);
	boolean checkIfRealPerson (gamer Gamer);

}
