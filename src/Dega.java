import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.30BF4733-286E-05A9-DF07-DADE66CE3EBA]
// </editor-fold> 
public class Dega extends Klient {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6D14EF09-ACD3-0FE2-0D04-487414A2435B]
    // </editor-fold> 
    private String nrpunonjesve;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.680916EE-DB1B-B3F9-76DB-5E6F7849D897]
    // </editor-fold> 
    protected String dega_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C3507C0E-84C0-CC97-9495-F72195C457C7]
    // </editor-fold> 
    private String Emri;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D7EF7CC7-3FE1-A5A3-4487-8C0DB4D66415]
    // </editor-fold> 
    private String Adresa;
    
    private String idmenaxheri;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9E310A93-EFF7-EBDD-E151-5DC196867FF9]
    // </editor-fold> 
    private ArrayList<Punonjes> punonjesit = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F415166D-5FC0-5268-0864-6F5C9B611FB5]
    // </editor-fold> 
    public Dega () {
    }
    public Dega(String dega_id,String Emri, String Adresa, String nrpunonjesve, String idmenaxheri){
    this.dega_id=dega_id;
    this.Emri=Emri;
    this.Adresa=Adresa;
    this.nrpunonjesve=nrpunonjesve;
    this.idmenaxheri=idmenaxheri;
    }
   
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9C399D6A-746E-86D9-8E9A-6F7B813172AC]
    // </editor-fold> 
    public String getAdresa () {
        return Adresa;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F8DEE175-1218-EF30-00C9-BAB8CA86D767]
    // </editor-fold> 
    public void setAdresa (String val) {
        this.Adresa = val;
    }
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.238881DB-73B0-79FD-0557-40E08DCCEBE1]
    // </editor-fold> 
    public String getEmri () {
        return Emri;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8072401C-82DC-606D-58EB-DA69BC3EEE2E]
    // </editor-fold> 
    public void setEmri (String val) {
        this.Emri = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A89ACA89-0708-21BA-0982-65CBA485B981]
    // </editor-fold> 
    public String getDega_id () {
        return dega_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F4959C12-19CF-4A76-81D8-F3487CEC8309]
    // </editor-fold> 
    public void setDega_id (String val) {
        this.dega_id = val;
    }
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0D0C4BE4-94E4-E7E6-AD76-F2B84FE19F1E]
    // </editor-fold> 
    public ArrayList<Punonjes> getPunonjesit () {
        return punonjesit;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C48A094B-A066-C914-B75E-C7E09B34B1CC]
    // </editor-fold> 
    public void setPunonjesit (ArrayList<Punonjes> val) {
        this.punonjesit = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B392FBD4-E1DA-20F5-E023-432F856EF850]
    // </editor-fold> 
    public String getNrpunonjesve () {
        return nrpunonjesve;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2645A469-3FE9-F410-8B50-93E1EDBF89CE]
    // </editor-fold> 
    public void setNrpunonjesve (String val) {
        this.nrpunonjesve = val;
    }
    
         public String getIdmenaxheri () {
        return idmenaxheri;
    }

    public void setIdmenaxheri (String val) {
        this.idmenaxheri = val;
    }

}

