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
public class Magazine extends Book {
    private Date releaseDate;
    private int issueNo;

    
    public Magazine(Date releaseDate, int issureNo, String title, Auther a1, int no, Date d1, int genere, int edition) {
        super(title, a1, no, d1, genere, edition);
        this.releaseDate = releaseDate;
        this.issueNo = issureNo;
    }

    
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issureNo) {
        this.issueNo = issureNo;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"release date: "+this.getReleaseDate().getDay()+"/"+this.getReleaseDate().getMonth()+
                "/"+this.getReleaseDate().getYear()+", issue no: "+this.getIssueNo();
    }
}
