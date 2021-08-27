package de.craftlancer.clapi.clcapture;

public enum ArtifactModifier {
    POWERED,
    UNPOWERED;
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    public static ArtifactModifier fromString(String modifier) {
        return modifier == null || !isValidModifier(modifier) || modifier.equalsIgnoreCase("UNPOWERED")
                ? ArtifactModifier.UNPOWERED
                : ArtifactModifier.POWERED;
    }
    
    public static boolean isValidModifier(String string) {
        return string.equalsIgnoreCase("POWERED") || string.equalsIgnoreCase("UNPOWERED");
    }
}
