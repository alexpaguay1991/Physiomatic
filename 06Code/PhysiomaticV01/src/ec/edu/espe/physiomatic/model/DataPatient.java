/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class DataPatient {

    private Patient patientData;
    private float weight, height, pulse;
    private String patologhy, allergies, familyBackground, personalHistory;

   /**
     * @return the patientData
     */
    public Patient getPatientData() {
        return patientData;
    }

    /**
     * @param patientData the patientData to set
     */
    public void setPatientData(Patient patientData) {
        this.patientData = patientData;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the pulse
     */
    public float getPulse() {
        return pulse;
    }

    /**
     * @param pulse the pulse to set
     */
    public void setPulse(float pulse) {
        this.pulse = pulse;
    }

    /**
     * @return the patologhy
     */
    public String getPatologhy() {
        return patologhy;
    }

    /**
     * @param patologhy the patologhy to set
     */
    public void setPatologhy(String patologhy) {
        this.patologhy = patologhy;
    }

    /**
     * @return the allergies
     */
    public String getAllergies() {
        return allergies;
    }

    /**
     * @param allergies the allergies to set
     */
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    /**
     * @return the familyBackground
     */
    public String getFamilyBackground() {
        return familyBackground;
    }

    /**
     * @param familyBackground the familyBackground to set
     */
    public void setFamilyBackground(String familyBackground) {
        this.familyBackground = familyBackground;
    }

    /**
     * @return the personalHistory
     */
    public String getPersonalHistory() {
        return personalHistory;
    }

    /**
     * @param personalHistory the personalHistory to set
     */
    public void setPersonalHistory(String personalHistory) {
        this.personalHistory = personalHistory;
    }

    

}
