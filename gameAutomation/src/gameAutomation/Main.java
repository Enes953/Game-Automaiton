package gameAutomation;

import gameAutomation.concrete.campaignManager;
import gameAutomation.concrete.gameManager;
import gameAutomation.concrete.gamerManager;
import gameAutomation.entities.campaign;
import gameAutomation.entities.game;
import gameAutomation.entities.gamer;

public class Main {

	public static void main(String[] args) {
		gamer Gamer = new gamer(1,"Enes","duman","20","12345678912","22/09/2001","ENOFAYN ");
        gamerManager GamerManeger = new gamerManager(Gamer);
        GamerManeger.add(Gamer);
        GamerManeger.delete(Gamer);
        GamerManeger.update(Gamer);
        System.out.println("===============");
        
        game Game = new game (1,"CS:GO ",80);
        gameManager GameManager = new gameManager();
        GameManager.add(Game);
        GameManager.delete(Game);
        GameManager.update(Game);
        System.out.println("===============");
        
        campaign Campaign = new campaign(1, "YeniYýl indirimi", 50 , 20);
        campaignManager CampaignManager = new campaignManager();
        CampaignManager.add(Campaign);
		CampaignManager.delete(Campaign);
		CampaignManager.update(Campaign);
        
		System.out.println("===============");
		
		GameManager.campaignSale(Campaign, Game, Gamer);
		GameManager.sale(Gamer, Game);
		System.out.println(Campaign.getDiscountRate()); 
        
        
	}

}
