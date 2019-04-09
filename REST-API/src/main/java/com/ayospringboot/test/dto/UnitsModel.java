/*This Model will only be used for allowed UNITS conversion Lookups*/
package com.ayospringboot.test.dto;

public class UnitsModel {
     
    private String id;
    private String description;
    private String usagedescription;
    private String comment;
 
    // Default no-argument Constructor required
    public UnitsModel() {}
 
    public UnitsModel(String id, String description, String usagedescription, String comment) {
        this.id = id;
    	this.description = description;
        this.usagedescription = usagedescription;
        this.comment = comment;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public String getUsageDescription() {
        return usagedescription;
    }
 
    public void setUsageDescription(String usagedescription) {
        this.usagedescription = usagedescription;
    }
 
    public String getComment() {
        return comment;
    }
 
    public void setComment(String comment) {
        this.comment = comment;
    }
}