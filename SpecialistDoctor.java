
package com.mycompany.clinicm;

class SpecialistDoctor extends Physician {
    public SpecialistDoctor(String physicianName, String expertise, String availableTime) {
        super(physicianName, expertise, availableTime);
    }

    @Override
    public void showAvailability() {
        System.out.println(getPhysicianName() + " (Specialist in " + getExpertise() + ") is available by appointment at " + getAvailableTime());
    }
}
