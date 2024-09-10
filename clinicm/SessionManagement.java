package com.mycompany.clinicm;
import java.util.ArrayList;
import java.util.List;
class SessionManagement {
    private List<Physician> physicianList;
    private List<Client> clientList;
    private List<Session> sessionList;

    public SessionManagement() {
        physicianList = new ArrayList<>();
        clientList = new ArrayList<>();
        sessionList = new ArrayList<>();
    }
    public void registerPhysician(Physician physician) {
        physicianList.add(physician);
    }
    public void registerClient(Client client) {
        clientList.add(client);
    }
    public void displayPhysicians() {
        System.out.println("Available Physicians:");
        for (Physician physician : physicianList) {
            physician.showAvailability();
        }}
   public void bookSession(Client client, Physician physician, String sessionDate) {
        Session session = new Session(physician, client, sessionDate);
        sessionList.add(session);
        System.out.println("Session booked successfully!"); }
    public void displaySessions() {
        System.out.println("All Sessions:");
        for (Session session : sessionList) {
            session.showSessionDetails();  }
    }
    public List<Client> getClientList() {
        return clientList;
    }
    public List<Physician> getPhysicianList() {
        return physicianList;  }}
