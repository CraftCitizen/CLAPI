package de.craftlancer.clapi.clstuff.heroes;

public abstract class AbstractHeroesCategory implements HeroesCategory {
    
    private final boolean calculateAsync;
    private final String categoryName;
    
    public AbstractHeroesCategory(String categoryName, boolean calculateAsync) {
        this.categoryName = categoryName;
        this.calculateAsync = calculateAsync;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public boolean isCalculateAsync() {
        return calculateAsync;
    }
}
