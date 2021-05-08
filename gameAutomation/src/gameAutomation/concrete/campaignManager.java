package gameAutomation.concrete;

import gameAutomation.abstracts.campaignService;
import gameAutomation.entities.campaign;

public class campaignManager implements campaignService {

	public void add(campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampaingName());
	}

	@Override
	public void delete(campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaingName());
	}

	@Override
	public void update(campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getCampaingName());
	}
	}


