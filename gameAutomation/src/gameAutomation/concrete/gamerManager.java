package gameAutomation.concrete;

import gameAutomation.abstracts.gamerService;
import gameAutomation.entities.gamer;

public class gamerManager implements gamerService {
	
	private boolean check;
	public gamerManager(gamer Gamer) {
		checkIfRealPerson(Gamer);
	}

	@Override
	public void add(gamer Gamer) {
		if(check) {
			System.out.println("�ye olundu : " + Gamer.getUserName());
		}
		else {
			System.out.println(Gamer.getUserName() + " �ye olamaz.");
		}
		
	}

	@Override
	public void delete(gamer Gamer) {
		System.out.println(Gamer.getUserName() + " silindi.");
		
	}

	@Override
	public void update(gamer Gamer) {
		if(check) {
			System.out.println("G�ncellendi : " + Gamer.getFirstName());
		}
		else {
			System.out.println(Gamer.getUserName() + "Eklendi");
		}
		
	}

	@Override
	public boolean checkIfRealPerson(gamer Gamer) {
			return true;	
		}

}
