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
		System.out.println("Y�kseltildi : "+ Game.getGameName());
		
	}

	@Override
	public void sale(gamer Gamer, game Game) {
		System.out.println(Game.getGameName() + "Adl� Oyunu Sat�n ald�n�z " + "�cret: " + Game.getUnitPrice());
		
	}

	@Override
	public void campaignSale(campaign Campaign, game Game, gamer Gamer) {
		System.out.println(Gamer.getUserName() + "Adl� Kullan�c� "+ "�ndirimden Sat�n ald� :" + Game.getGameName());
		
	}

}
