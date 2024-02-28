package com.directi.training.ocp.exercice_refactored;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource)
    {
        int resourceId;
        try {
            resourceId = resource.findFreeSlot();
            resource.markSlotBusy(resourceId);
            
        } catch (Exception e) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
        }

        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
       
        try {
            resource.markSlotFree(resourceId);
        } catch (Exception e) {
            System.out.println("ERROR: attempted to free invalid resource");
        }
    
    }

   
}
