/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author MSI LAPTOP
 */
public class Journal extends Book {
    private String ConferenceName;
    private int conferenceNO;

    public Journal(String ConferenceName, int conferenceNO, String title, Auther a1, int no, Date d1, int genere, int edition) {
        super(title, a1, no, d1, genere, edition);
        this.ConferenceName = ConferenceName;
        this.conferenceNO = conferenceNO;
    }
    
    public String getConferenceName() {
        return ConferenceName;
    }

    public void setConferenceName(String ConferenceName) {
        this.ConferenceName = ConferenceName;
    }

    public int getConferenceNO() {
        return conferenceNO;
    }

    public void setConferenceNO(int conferenceNO) {
        this.conferenceNO = conferenceNO;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"conference name: "+this.getConferenceName()+", conference no: "+this.getConferenceNO();
    }
    
    
    
    
    
    
       
    
}
