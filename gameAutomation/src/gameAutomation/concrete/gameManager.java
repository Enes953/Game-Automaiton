package gameAutomation.concrete;

import gameAutomation.abstracts.gameService;
import gameAutomation.entities.campaign;
import gameAutomation.entities.game;
import gameAutomation.entities.gamer;

public class gameManager implements gameService {

	@Override
	public void add(game Game) {
		System.out.println("eklendi : "+ Game.getGameName());
		
	}

	@Override
	public void delete(game Game) {
		System.out.println("Silindi : "+ Game.getGameName());
		
	}

	@Override
	public void update(game Game) {
		System.out.println("Yükseltildi : "+ Game.getGameName());
		
	}

	@Override
	public void sale(gamer Gamer, game Game) {
		System.out.println(Game.getGameName() + "Adlý Oyunu Satýn aldýnýz " + "Ücret: " + Game.getUnitPrice());
		
	}

	@Override
	public void campaignSale(campaign Campaign, game Game, gamer Gamer) {
		System.out.println(Gamer.getUserName() + "Adlý Kullanýcý "+ "Ýndirimden Satýn aldý :" + Game.getGameName());
		
	}

}
