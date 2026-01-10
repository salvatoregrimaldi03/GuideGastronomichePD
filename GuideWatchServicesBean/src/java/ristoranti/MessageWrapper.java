package ristoranti;

import java.io.Serializable;


public class MessageWrapper implements Serializable {
    private static final long serialVersionUID = 1L;
    private int ID;
    private boolean ancoraPresenteinGuida;
    
    public MessageWrapper() {
        
    }

    public MessageWrapper(int ID, boolean ancoraPresenteinGuida) {
        this.ID = ID;
        this.ancoraPresenteinGuida = ancoraPresenteinGuida;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isAncoraPresenteinGuida() {
        return ancoraPresenteinGuida;
    }

    public void setAncoraPresenteinGuida(boolean ancoraPresenteinGuida) {
        this.ancoraPresenteinGuida = ancoraPresenteinGuida;
    }
}