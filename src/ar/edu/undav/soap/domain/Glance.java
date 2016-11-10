package ar.edu.undav.soap.domain;

import java.util.Date;

/**
 * Juan Lagostena on 07/11/16
 * .
 */
public class Glance {

    private String comment;
    private java.util.Date glanceDate;

    public Glance(String comment, Date glanceDate) {
        this.comment = comment;
        this.glanceDate = glanceDate;
    }

}
