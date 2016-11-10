package ar.edu.undav.soap.ws;

import ar.edu.undav.soap.domain.Player;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.ArrayList;

@WebService
@SOAPBinding(style=Style.RPC)
public interface PlayerService {

	@WebMethod
	void addPlayer(Player player);
	
	@WebMethod
	void addGlance(Player player, String comment);
	
	@WebMethod
	void removePlayer(Player player);
	
	@WebMethod
	ArrayList<Player> getPlayers();
	

}
