package com.directi.training.ocp.exercice_refactored;

public interface Resource {

    public void markSlotFree(int resourceId);
    
    public void markSlotBusy(int resourceId);
    
    public int findFreeSlot();
}
