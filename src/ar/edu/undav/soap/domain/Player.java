package ar.edu.undav.soap.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Player {

    private Date glancedUpDate;
    private String name;
    private String club;
    private float valuation;
    private String position;
    private String comments;

    private List<Glance> glanceList;

    public Player() {}

    public Player(String name, String club, float valuation, String position,
                  String comments) {
        this.glancedUpDate = new java.util.Date();
        this.name = name;
        this.club = club;
        this.valuation = valuation;
        this.position = position;
        this.comments = comments;
        this.glanceList = new ArrayList<Glance>();
    }

    public void glanceUp(String comentario) {
        Glance glance = new Glance(comentario, new java.util.Date());
        this.glanceList.add(glance);
    }

    public boolean isGlancedUp() {
        return !this.glanceList.isEmpty();
    }
    
    public float getValuation(){
    	return this.valuation;
    }
    
    public String getClub(){
    	return this.club;
    }

}
