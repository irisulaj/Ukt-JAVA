import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4926FC65-A104-52CD-B294-F726B21607BB]
// </editor-fold> 
public class Kontrata extends Punonjes {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.37B736F0-25D6-88AE-6ECA-9F47051F1DE9]
    // </editor-fold> 
    private String nrfaturave;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D2F25480-EFB7-77D4-1D15-50659AC00A2D]
    // </editor-fold> 
    private String aktive;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D77C77FC-06C2-71AE-9C36-4495266CF48C]
    // </editor-fold> 
    protected String ko_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.27051941-84CC-C0C7-B258-72A862A955BF]
    // </editor-fold> 
    private String nrmatesit;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E1380D18-A2A0-99F5-FC7A-224F7E14D7B6]
    // </editor-fold> 
    private String dataFillimit;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7DB349B5-5D80-EEA4-D063-164FA57CB6B4]
    // </editor-fold> 
    private String dataMbarimit;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3D69C0DF-E868-1BEE-40CC-0B1306B7D1C3]
    // </editor-fold> 
    private String seksioni;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8E024C6E-E5EE-6614-0BAD-CDC1C11702F6]
    // </editor-fold> 
    private Klient klienti;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FE62696A-84BB-9AEB-60BF-187346586C79]
    // </editor-fold> 
    private ArrayList<Fatura> faturat = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1CDE545F-C025-B4CB-9CCD-79C947EBBE04]
    // </editor-fold> 
    public Kontrata () {
    }
    
    public Kontrata(String ko_id, String nrmatesit, String dataFillimit, String dataMbarimit,
            String nrfaturave, String seksioni, String aktive, String kl_id){
    
        this.ko_id=ko_id;
        this.nrmatesit=nrmatesit;
        this.dataFillimit=dataFillimit;
        this.dataMbarimit=dataMbarimit;
        this.nrfaturave=nrfaturave;
        this.seksioni=seksioni;
        this.aktive=aktive;
        this.kl_id=kl_id;
    
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F29C9FD6-22B6-5E0F-20AB-524BB7B1BB8A]
    // </editor-fold> 
    public String getDataFillimit () {
        return dataFillimit;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EAC04887-A9B3-B071-86C6-F261924079A1]
    // </editor-fold> 
    public void setDataFillimit (String val) {
        this.dataFillimit = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.22B791B7-89B3-7625-3F5A-3B1AD705ADAA]
    // </editor-fold> 
    public String getDataMbarimit () {
        return dataMbarimit;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F5BDBD48-0838-5B3A-B17D-29E614EA1D7A]
    // </editor-fold> 
    public void setDataMbarimit (String val) {
        this.dataMbarimit = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7830BD68-6A72-4DBE-681D-B3E51CE796AD]
    // </editor-fold> 
    public ArrayList<Fatura> getFaturat () {
        return faturat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FF58790E-408E-1D36-D43A-E395639FE29A]
    // </editor-fold> 
    public void setFaturat (ArrayList<Fatura> val) {
        this.faturat = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ABAB5014-4C5A-7994-5252-A2904AA1DC51]
    // </editor-fold> 
    public Klient getKlienti () {
        return klienti;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.62BDF090-B417-D402-2AE5-096098DBAA1C]
    // </editor-fold> 
    public void setKlienti (Klient val) {
        this.klienti = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.50B8E18D-3ACF-1E35-2877-34850C7F1DB3]
    // </editor-fold> 
    public String getKo_id () {
        return ko_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F46459BB-69BF-E807-5D06-76EC8D23D8DE]
    // </editor-fold> 
    public void setKo_id (String val) {
        this.ko_id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6FC360B8-DEAA-C092-4260-80ADBCD6062B]
    // </editor-fold> 
    public String getNrmatesit () {
        return nrmatesit;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BD9F5C18-E545-E01C-AE0A-70C2949223E6]
    // </editor-fold> 
    public void setNrmatesit (String val) {
        this.nrmatesit = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.02CB6046-2ACD-666A-4622-C6BD372B0E5A]
    // </editor-fold> 
    public String getSeksioni () {
        return seksioni;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B2BE67B5-C236-5939-DD93-866065107B88]
    // </editor-fold> 
    public void setSeksioni (String val) {
        this.seksioni = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D526A4B0-D270-EB6D-2551-D0B46A0177C1]
    // </editor-fold> 
    public String getAktive () {
        return aktive;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F4068497-7F5A-96C4-602C-32A0365FDB77]
    // </editor-fold> 
    public void setAktive (String val) {
        this.aktive = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DC831250-7F6E-63D2-87DC-848C6D2FD0C7]
    // </editor-fold> 
    public String getNrfaturave () {
        return nrfaturave;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FCE3F9B3-8C3A-D96C-D62B-0503DD470DEA]
    // </editor-fold> 
    public void setNrfaturave (String val) {
        this.nrfaturave = val;
    }

}

