
package com.mycompany.clinicm;

class Client {
    private String clientName;
    private String contactNumber;

    public Client(String clientName, String contactNumber) {
        this.clientName = clientName;
        this.contactNumber = contactNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
