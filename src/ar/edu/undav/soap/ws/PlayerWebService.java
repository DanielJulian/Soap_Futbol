package ar.edu.undav.soap.ws;
import ar.edu.undav.soap.domain.Player;

import java.util.ArrayList;

//import PlayerService;

import javax.jws.WebService;

@WebService(endpointInterface = "ar.edu.undav.soap.ws.PlayerService")
public class PlayerWebService implements PlayerService {

	private ArrayList<Player> players = new java.util.ArrayList<>();

    public PlayerWebService() {}

    @Override
	public void addPlayer(Player player) {
		players.add(player);
	}

	@Override
	public void addGlance(Player player, String comment) {
		player.glanceUp(comment);
	}

	@Override
	public void removePlayer(Player player) {
		players.remove(player);
	}

	@Override
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	

}
