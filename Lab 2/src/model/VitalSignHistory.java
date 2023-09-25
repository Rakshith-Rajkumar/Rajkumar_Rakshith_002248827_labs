/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> history;
    
    public VitalSignHistory(){
        this.history = new ArrayList<VitalSigns>();
    }

    //Getters and Setters.
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    //Method to create a new VitalSigns object and add it to History arrayList and returns a reference to the newly created vitalSigns.
    public VitalSigns addNewVitals(){
        
        VitalSigns newVitals = new VitalSigns();
        history.add(newVitals);
        return newVitals;
    }   
    
    //Method to delete the VitalSigns Object that is selected.
    public void deleteVitals(VitalSigns newVitalSigns){
        history.remove(newVitalSigns);
    }
}
