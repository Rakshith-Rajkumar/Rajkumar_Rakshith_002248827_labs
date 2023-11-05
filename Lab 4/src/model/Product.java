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
public class Product {
    private String name;
    private int price;
    private int id;
    private ArrayList<Feature> features;
    private static int count = 0;
    
    //CONSTRUCTOR FUNCTION.
    public Product() {
        count++;
        id = count;
        features = new ArrayList<Feature>();
    }

    //GETTERS AND SETTERS.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    //CUSTOM METHODS.
    public Feature addNewFeature() {
        Feature newFeature = new Feature(this);
        features.add(newFeature);
        return newFeature;
    }    
    
    @Override
    public String toString() {
        return name;
    }
     
}
