package de.craftlancer.clapi.clstuff.heroes;

public abstract class AbstractHeroesCategory implements HeroesCategory {
    
    private final boolean calculateAsync;
    private final String categoryName;
    private final boolean hasHead;
    private final boolean hasBanner;
    
    public AbstractHeroesCategory(String categoryName, boolean calculateAsync, boolean hasHead, boolean hasBanner) {
        this.categoryName = categoryName;
        this.calculateAsync = calculateAsync;
        this.hasBanner = hasBanner;
        this.hasHead = hasHead;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public boolean isCalculateAsync() {
        return calculateAsync;
    }
    
    public boolean hasHead() {
        return hasHead;
    }
    
    public boolean hasBanner() {
        return hasBanner;
    }
}
