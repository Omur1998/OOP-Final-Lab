
package com.mycompany.clinicm;

    class GeneralDoctor extends Physician {
    public GeneralDoctor(String physicianName, String availableTime) {
        super(physicianName, "General Medicine", availableTime);
    }

    @Override
    public void showAvailability() {
        System.out.println(getPhysicianName() + " (General Medicine) is available at " + getAvailableTime());
    }
}

