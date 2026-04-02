package Singleton.classes;

public class ConexiuneMinisterThreadSafe {
    private String endpoint;
    private boolean isActive;

    private static ConexiuneMinisterThreadSafe instance = null;

    private ConexiuneMinisterThreadSafe(String endpoint, boolean isActive) {
        this.endpoint = endpoint;
        this.isActive = isActive;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static synchronized ConexiuneMinisterThreadSafe getInstance(String endpoint, boolean isActive) {
        if(instance == null) {
            instance = new ConexiuneMinisterThreadSafe(endpoint, isActive);
        }
        return instance;
    }
}
