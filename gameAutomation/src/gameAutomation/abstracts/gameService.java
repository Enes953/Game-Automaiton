package gameAutomation.abstracts;

import gameAutomation.entities.campaign;
import gameAutomation.entities.game;
import gameAutomation.entities.gamer;

public interface gameService {
	void add (game Game);
	void delete (game Game);
	void update (game Game);
	void sale (gamer Gamer, game Game);
	void campaignSale (campaign Campaign, game Game, gamer Gamer);

}
