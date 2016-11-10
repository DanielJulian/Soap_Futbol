package ar.edu.undav.soap.client;

import java.net.URL;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ar.edu.undav.soap.domain.Player;
import ar.edu.undav.soap.ws.*;
public class Client{

	public static void main(String[] args) throws Exception {

	URL url = new URL("http://localhost:9999/ws/player");

        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.soap.undav.edu.ar/","PlayerWebServiceService");

        Service service = Service.create(url, qname);

        PlayerService hello = service.getPort(PlayerService.class);

    }
	
	/* Hice todo esto para el server pero lo tengo que hacer en el cliente.
	 * 
	 * 
	@Override
	public ArrayList<Player> getOverOneMillionRatedPlayers() {
		ArrayList<Player> millionPlayers = new java.util.ArrayList<>();
		for (int i=0; i<players.size();i++){
			if(players.get(i).getValuation()>1000000){
				millionPlayers.add(players.get(i));
			}
		}
		return millionPlayers;
	}

	@Override
	public ArrayList<Player> getClubPlayers(String club) {
		ArrayList<Player> clubPlayers = new java.util.ArrayList<>();
		for (int i=0; i<players.size();i++){
			if(players.get(i).getClub().equalsIgnoreCase(club)){
				clubPlayers.add(players.get(i));
			}
		}	
		return clubPlayers;
	}
	
	@Override
	public void deleteOverOneMillionRatedPlayers() {
		for (int i=0; i<players.size();i++){
			if(players.get(i).getValuation()>1000000){
				players.remove(i);
			}
		}
	}

	@Override
	public void deleteClubPlayers(String club) {
		for (int i=0; i<players.size();i++){
			if(players.get(i).getClub().equalsIgnoreCase(club)){
				players.remove(i);
			}
		}	
	}
	
	@Override
	public void addGlancedPlayer(Player player,String comment){
		player.glanceUp(comment);
	}
	
	*/
	 

}