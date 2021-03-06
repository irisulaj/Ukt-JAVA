import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.926BFF4D-C233-1B49-DE36-C7335FD8B07E]
// </editor-fold> 
public class Punonjes extends Dega {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2F9340F8-8F94-B3BF-2B50-085703F91564]
    // </editor-fold> 
    protected String pu_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BF641900-0685-4AD5-62B3-A4532D4CBB9E]
    // </editor-fold> 
    private String Emri;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D7BEFA63-7A94-B066-ECD8-AEFAF8CD762F]
    // </editor-fold> 
    private String Mbiemri;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CA0FE2D7-F0E5-4F1B-D3CB-ED5A089B7D9E]
    // </editor-fold> 
    private String Gjinia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DC000A71-E803-5E30-FD11-30BFFE30C1BC]
    // </editor-fold> 
    private String Dob;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.64DBD82F-B8C3-CD7D-4A04-656710DC27D6]
    // </editor-fold> 
    private String Email;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.484A47E4-C3D9-36C5-93FE-78DB52D9FB7A]
    // </editor-fold> 
    private String Telefon;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D97708F4-EED4-2DB4-4D1F-D485AE086F85]
    // </editor-fold> 
    private String Adresa;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F9D72973-0F7C-1353-4A76-04606BD727BC]
    // </editor-fold> 
    private String Paga;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2ABCC5C6-5A9D-0238-3D90-2AC0CC1C39EF]
    // </editor-fold> 
    private Dega dega;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DA58E19E-7A0F-3D2C-92F7-874C8619B89E]
    // </editor-fold> 
    private ArrayList<Fatura> faturat = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F8CA9109-F704-FA46-572A-5B73D4477E0F]
    // </editor-fold> 
    public Punonjes () {
    }
    
    public Punonjes(String pu_id, String Emri, String Mbiemri, String Gjinia, String Dob, String Email,
            String Telefon, String Adresa, String Paga, String dega_id ){
    
    this.pu_id=pu_id;
    this.Emri=Emri;
    this.Mbiemri=Mbiemri;
    this.Gjinia=Gjinia;
    this.Dob=Dob;
    this.Email=Email;
    this.Telefon=Telefon;
    this.Adresa=Adresa;
    this.Paga=Paga;
    this.dega_id=dega_id;
   
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CAEDB380-3CCA-E7CB-A498-8D2EBC332B57]
    // </editor-fold> 
    public String getAdresa () {
        return Adresa;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.66FDE40C-F956-76F6-2C71-C3221BD5ED95]
    // </editor-fold> 
    public void setAdresa (String val) {
        this.Adresa = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7F6C5B2C-FE5A-AA5E-DDC7-6395B9592F38]
    // </editor-fold> 
    public String getDob () {
        return Dob;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DF612D55-B77C-75D5-31D6-4D2B91018169]
    // </editor-fold> 
    public void setDob (String val) {
        this.Dob = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5198B43C-B36B-5630-327F-40267CBD1FFF]
    // </editor-fold> 
    public String getEmail () {
        return Email;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E0FE30EB-247B-C7D3-5EB3-5C3B584C30B5]
    // </editor-fold> 
    public void setEmail (String val) {
        this.Email = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A10F4327-CC75-451D-86ED-E24504D8A28C]
    // </editor-fold> 
    public String getEmri () {
        return Emri;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7F23FEC6-A8DE-68D0-F952-B77FB2DFB9A4]
    // </editor-fold> 
    public void setEmri (String val) {
        this.Emri = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CCE09AB3-4997-E6C7-F723-B9DA18517D56]
    // </editor-fold> 
    public String getGjinia () {
        return Gjinia;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0C319116-9405-6C78-D089-ADCF4E35A1BB]
    // </editor-fold> 
    public void setGjinia (String val) {
        this.Gjinia = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.47BAB7D1-EFDA-05BA-6169-CD18A025B1F0]
    // </editor-fold> 
    public String getMbiemri () {
        return Mbiemri;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D5F51247-D6F5-2F26-5D70-7261E7048E9A]
    // </editor-fold> 
    public void setMbiemri (String val) {
        this.Mbiemri = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B7B132F9-3D51-1294-0444-C078D5C52243]
    // </editor-fold> 
    public String getPaga () {
        return Paga;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4E94959A-DF20-B8B7-B105-82053DE27333]
    // </editor-fold> 
    public void setPaga (String val) {
        this.Paga = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DC7ACD7C-F588-73CD-4A74-350CA49296FC]
    // </editor-fold> 
    public String getTelefon () {
        return Telefon;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.04DACC63-423E-6C3D-6A4C-51357F5D7731]
    // </editor-fold> 
    public void setTelefon (String val) {
        this.Telefon = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.07DE1B83-0339-99C6-7D42-D267206A64F1]
    // </editor-fold> 
    public Dega getDega () {
        return dega;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D0B1B3DC-9F39-14A2-E9B8-7E5DFAD55992]
    // </editor-fold> 
    public void setDega (Dega val) {
        this.dega = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7D3E373F-9B54-3718-419A-A09861C85ED8]
    // </editor-fold> 
    public ArrayList<Fatura> getFaturat () {
        return faturat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C35077E2-519C-EF44-D055-E3F33E2FF2ED]
    // </editor-fold> 
    public void setFaturat (ArrayList<Fatura> val) {
        this.faturat = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6D3B0DCE-E2B7-997B-E90B-380C25E7910C]
    // </editor-fold> 
    public String getPu_id () {
        return pu_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3C898991-340A-875D-8849-4932F0E3D39A]
    // </editor-fold> 
    public void setPu_id (String val) {
        this.pu_id = val;
    }

}

