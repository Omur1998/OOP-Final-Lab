
package com.mycompany.clinicm;
class Session {
    private Physician physician;
    private Client client;
    private String sessionDate;

    public Session(Physician physician, Client client, String sessionDate) {
        this.physician = physician;
        this.client = client;
        this.sessionDate = sessionDate;
    }

    public void showSessionDetails() {
        System.out.println("Session Details: ");
        System.out.println("Client: " + client.getClientName() + " has a session with Dr. " + physician.getPhysicianName() + " on " + sessionDate);
    }
}