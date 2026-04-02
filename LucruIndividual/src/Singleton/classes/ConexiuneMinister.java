package Singleton.classes;

public class ConexiuneMinister {
    private String endpoint;
    private boolean isActive;

    private static ConexiuneMinister instance = null;

    private ConexiuneMinister(String endpoint, boolean isActive) {
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

    public static ConexiuneMinister getInstance(String endpoint, boolean isActive) {
        if(instance == null) {
            instance = new ConexiuneMinister(endpoint, isActive);
        }
        return instance;
    }
}
