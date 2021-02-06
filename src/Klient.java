import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3BD41D5B-278D-194A-3E3B-25AD9897C980]
// </editor-fold> 
public class Klient {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.81E4E4F3-36DD-A76C-F18B-D4008FD7D014]
    // </editor-fold> 
    protected String kl_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C16DBF0B-94EB-CB6A-D50F-09F3702AC002]
    // </editor-fold> 
    private String Emri;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6E55611B-B5BF-5477-719F-70623325439D]
    // </editor-fold> 
    private String Mbiemri;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3C0EED8E-5ED3-CB2E-B9E8-C9C4E238250D]
    // </editor-fold> 
    private String Gjinia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F752AE20-CBC8-AFEF-B3C0-9FC4B7C1B523]
    // </editor-fold> 
    private String Dob;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C9D4E346-5410-651B-FCEE-5A339D9DEBB3]
    // </editor-fold> 
    private String Email;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.588F33F3-EDF0-2264-4500-F3FBD88501C7]
    // </editor-fold> 
    private String Telefoni;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1DD7597E-A255-6770-DF30-B837CF3DEF93]
    // </editor-fold> 
    private String Adresa;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9D54C750-278F-2CC2-E1F8-6486E12A2961]
    // </editor-fold> 
    private ArrayList<Kontrata> kontratat = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E4C571EE-E7F4-FC4E-1F96-4373C8FB9F4C]
    // </editor-fold> 
    public Klient () {
    }

      public Klient(String kl_id, String Emri, String Mbiemri,String Gjinia,String Dob, String Email, String Telefoni, String Adresa){
    
    this.kl_id=kl_id;
    this.Emri=Emri;
    this.Mbiemri=Mbiemri;
    this.Gjinia=Gjinia;
    this.Dob=Dob;
    this.Email=Email;
    this.Telefoni=Telefoni;
    this.Adresa=Adresa;      
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.57725FF3-C439-E2B3-A55A-DF7B18D49E13]
    // </editor-fold> 
    public String getAdresa () {
        return Adresa;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.149D8179-A8DC-78B6-C9F1-1B61A34FBCC2]
    // </editor-fold> 
    public void setAdresa (String val) {
        this.Adresa = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1C360B59-A1E8-0791-DDF1-7A6FBEF53EFF]
    // </editor-fold> 
    public String getDob () {
        return Dob;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E16FBD11-0EDD-436E-4F07-4D6DE7176C28]
    // </editor-fold> 
    public void setDob (String val) {
        this.Dob = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.277133AF-3695-499C-3FDD-120D3169A573]
    // </editor-fold> 
    public String getEmail () {
        return Email;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.532D1481-18C2-A41C-8A51-060039928645]
    // </editor-fold> 
    public void setEmail (String val) {
        this.Email = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.23F1450C-DF33-B494-39E3-DC7C49C93288]
    // </editor-fold> 
    public String getEmri () {
        return Emri;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.124131D5-78DB-B139-F6A9-65620510AC5C]
    // </editor-fold> 
    public void setEmri (String val) {
        this.Emri = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3F9D6B32-6A23-6226-AE31-F4D657C95F35]
    // </editor-fold> 
    public String getGjinia () {
        return Gjinia;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4052A203-7A00-4EF7-1981-30D3FF7D0F50]
    // </editor-fold> 
    public void setGjinia (String val) {
        this.Gjinia = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F8E13097-EF7B-5801-E991-2E179AE299F8]
    // </editor-fold> 
    public String getMbiemri () {
        return Mbiemri;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.684F64D7-0B18-0563-983D-88B04A7FCA53]
    // </editor-fold> 
    public void setMbiemri (String val) {
        this.Mbiemri = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A01CE63D-09DB-89BA-2EF4-F2B5CC6A14AD]
    // </editor-fold> 
    public String getTelefoni () {
        return Telefoni;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.261AE05B-6096-F137-381E-A27E7CB9F1F4]
    // </editor-fold> 
    public void setTelefoni (String val) {
        this.Telefoni = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4A8E21E4-D807-7A3F-CD29-A144D5AC5E49]
    // </editor-fold> 
    public String getKl_id () {
        return kl_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2D8D6916-3D6E-2215-9ABB-B25776D5441C]
    // </editor-fold> 
    public void setKl_id (String val) {
        this.kl_id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9669A981-1446-844E-25BB-AC5C5FBA5DF7]
    // </editor-fold> 
    public ArrayList<Kontrata> getKontratat () {
        return kontratat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E434810F-85A7-79B5-9073-94BD482C6E4C]
    // </editor-fold> 
    public void setKontratat (ArrayList<Kontrata> val) {
        this.kontratat = val;
    }
    
  

}

