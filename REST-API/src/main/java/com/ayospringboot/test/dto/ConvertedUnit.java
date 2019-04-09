/*Use this Model to Wrap the object to be returned after Unit conversion*/
package com.ayospringboot.test.dto;

public class ConvertedUnit {
     
    private String id;
    private String description;
 
    // Default no-argument Constructor required
    public ConvertedUnit() {}
 
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
 
}