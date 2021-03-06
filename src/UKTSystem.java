import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.90B2E305-78C8-8E9B-B004-37FAAC459326]
// </editor-fold> 
public class UKTSystem {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FF68220E-3A2B-CBC0-90EE-6B946F6B0A4C]
    // </editor-fold> 
    private String Emri;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.56F20B8F-AED7-1C07-A125-879AC436F6E3]
    // </editor-fold> 
    private ArrayList<Fatura> faturat = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A059F59E-35F5-A712-8213-B61CF1411E79]
    // </editor-fold> 
    private ArrayList<Klient> klientet = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.709A3274-9C82-83DD-1189-BC65D1652333]
    // </editor-fold> 
    private ArrayList<Dega> deget = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.88BCE9BD-AC48-BBBC-97C2-422FE24CDFDA]
    // </editor-fold> 
    private ArrayList<Kontrata> kontratat = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8B53CA5E-D53B-3ACA-B1E3-359886D7BCD7]
    // </editor-fold> 
    private ArrayList<Punonjes> punonjesit = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9B40C4F7-606B-09A5-1A30-C4E0CAAA7F50]
    // </editor-fold> 
    public UKTSystem () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5BB72941-9DB3-7F3E-BF2D-EAE18B6B5050]
    // </editor-fold> 
    public ArrayList<Dega> getDeget () {
        return deget;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.556DBDA3-102F-E9AA-1EF2-57F5535DED56]
    // </editor-fold> 
    public void setDeget (ArrayList<Dega> val) {
        this.deget = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.54F51001-7709-2D7D-CE70-2A9FD34D88D3]
    // </editor-fold> 
    public ArrayList<Fatura> getFaturat () {
        return faturat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.31222B11-5131-DC94-118A-58B9F40D9A32]
    // </editor-fold> 
    public void setFaturat (ArrayList<Fatura> val) {
        this.faturat = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.99A2A13A-CBC5-B22F-DE85-668045771D05]
    // </editor-fold> 
    public ArrayList<Klient> getKlientet () {
        return klientet;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7D12B79E-3784-034E-512E-8E63A196D73B]
    // </editor-fold> 
    public void setKlientet (ArrayList<Klient> val) {
        this.klientet = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F83F6077-774C-7474-755A-3B545F0F8070]
    // </editor-fold> 
    public ArrayList<Kontrata> getKontratat () {
        return kontratat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7130094B-0895-7521-FBBE-6FDD12BEB824]
    // </editor-fold> 
    public void setKontratat (ArrayList<Kontrata> val) {
        this.kontratat = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E9967BEA-250A-B5B7-98E5-0691C0FAB5BB]
    // </editor-fold> 
    public ArrayList<Punonjes> getPunonjesit () {
        return punonjesit;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CE0B8154-8611-DAE3-F37D-26CA4FB12918]
    // </editor-fold> 
    public void setPunonjesit (ArrayList<Punonjes> val) {
        this.punonjesit = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1F031A5F-4CD4-E6DA-E862-C2D1D96D094D]
    // </editor-fold> 
    public String getEmri () {
        return Emri;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.03A1A676-382D-A128-4DE0-BC40B802DF83]
    // </editor-fold> 
    public void setEmri (String val) {
        this.Emri = val;
    }

}

