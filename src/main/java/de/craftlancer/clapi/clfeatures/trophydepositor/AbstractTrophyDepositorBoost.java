package de.craftlancer.clapi.clfeatures.trophydepositor;

public interface AbstractTrophyDepositorBoost {
    double apply(double trophy);
    
    int getTrophiesLeft();
    
    double getBoost();
    
    void addTrophiesLeft(int size);
}
