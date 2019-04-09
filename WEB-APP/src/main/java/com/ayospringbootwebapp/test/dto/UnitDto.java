/*Use this Model to Wrap the object to be returned after Unit conversion*/
package com.ayospringbootwebapp.test.dto;

public class UnitDto {
     
    private String id;
    private String description;
 
    // Default no-argument Constructor required
    public UnitDto() {}
 
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