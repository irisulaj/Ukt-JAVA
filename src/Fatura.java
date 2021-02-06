

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.15ED7A78-9AB5-6F22-DDAF-407C4C4C6CE9]
// </editor-fold> 
public class Fatura extends Kontrata {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.13CDC437-4438-F7E0-3B1A-179C7B96F449]
    // </editor-fold> 
    private String dataPageses;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.954C4ABE-2B57-D37B-FF63-6EC2F028B8D3]
    // </editor-fold> 
    private String fa_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E5B790CC-D753-1638-FE12-5213F47D02BD]
    // </editor-fold> 
    private String sasia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.467D1568-98E2-E88E-3397-DA22FC85C1ED]
    // </editor-fold> 
    private String dataFillimit;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2EA14312-6F62-116A-B36E-AC4E0BDCF5A9]
    // </editor-fold> 
    private String dataMbarimit;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C44FF067-21EE-D3F9-5C27-58627DEEC60E]
    // </editor-fold> 
    private String afatiPageses;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.18D4C006-5C4B-F05C-271C-01A6AA6C3473]
    // </editor-fold> 
    private String shuma;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E1A7A047-E9F0-E6E7-079C-1C591696B2BC]
    // </editor-fold> 
    private String statusi;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.558FC00E-264A-D6D2-94D2-4C6BEC7411AF]
    // </editor-fold> 
    private Kontrata kontrates;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BAF2CDA2-25BD-CB74-A38A-51078C8F5F19]
    // </editor-fold> 
    private Punonjes punonjesi;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.44B674A0-C484-D899-9849-6614A440B2F5]
    // </editor-fold> 
    public Fatura () {
    }

    public Fatura(String fa_id, String sasia,String dataFillimit,String dataMbarimit, String dataPageses,
            String afatiPageses, String shuma,String statusi, String pu_id, String ko_id){
        this.fa_id=fa_id;
        this.sasia=sasia;
        this.dataFillimit=dataFillimit;
        this.dataMbarimit=dataMbarimit;
        this.afatiPageses=afatiPageses;
        this.dataPageses=dataPageses;
        this.shuma=shuma;
        this.statusi=statusi;
        this.pu_id=pu_id;
        this.ko_id=ko_id;
    
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1AA1188A-0026-55C2-89FD-6CD47D534498]
    // </editor-fold> 
    public String getAfatiPageses () {
        return afatiPageses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.94711C1F-2CBD-0C30-A5CF-E0A2123BAA29]
    // </editor-fold> 
    public void setAfatiPageses (String val) {
        this.afatiPageses = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB5B3E4D-48EB-8333-547B-0CCC9EED51B0]
    // </editor-fold> 
    public String getDataFillimit () {
        return dataFillimit;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1A381D55-D89D-42E7-D138-E0FE32926D4B]
    // </editor-fold> 
    public void setDataFillimit (String val) {
        this.dataFillimit = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9B5449EB-AAAA-FCF9-6BBD-2D4747D4FEF8]
    // </editor-fold> 
    public String getDataMbarimit () {
        return dataMbarimit;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.83A99F5C-C505-B3CD-CE9C-C6C450006E7A]
    // </editor-fold> 
    public void setDataMbarimit (String val) {
        this.dataMbarimit = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B952EAEA-EC44-CA20-85AB-B3F5208BEE56]
    // </editor-fold> 
    public String getFa_id () {
        return fa_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7FDE9001-A125-E941-4856-930016131C1D]
    // </editor-fold> 
    public void setFa_id (String val) {
        this.fa_id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C5C49478-A89D-5F6C-B20D-67EA96E7FCE8]
    // </editor-fold> 
    public Kontrata getKontrates () {
        return kontrates;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.089C83F2-6787-F9F5-2293-5A5841BDF4BC]
    // </editor-fold> 
    public void setKontrates (Kontrata val) {
        this.kontrates = val;
    }

    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.35028FB9-39E7-34B9-8A0A-E7FF80E38109]
    // </editor-fold> 
    public Punonjes getPunonjesi () {
        return punonjesi;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.78AD8751-521B-103A-FF35-326B1159CB26]
    // </editor-fold> 
    public void setPunonjesi (Punonjes val) {
        
      this.punonjesi = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CC4B308C-740F-F3C1-3B92-634BF01573FC]
    // </editor-fold> 
    public String getSasia () {
        return sasia;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B068441-5864-1FA6-9843-C61B3BF33274]
    // </editor-fold> 
    public void setSasia (String val) {
        this.sasia = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8BC16B64-E447-1526-34A2-A9EDF35B71DE]
    // </editor-fold> 
    public String getShuma () {
        return shuma;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2A68F2A3-7B33-E33F-7922-B1D3B396F2F3]
    // </editor-fold> 
    public void setShuma (String val) {
        this.shuma = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.093A2714-1D88-153D-73BD-1235E566CE80]
    // </editor-fold> 
    public String getStatusi () {
        return statusi;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4A58BBA3-FC27-1C8B-5B6D-53CB74096686]
    // </editor-fold> 
    public void setStatusi (String val) {
        this.statusi = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5D4CF834-DBE9-2DCA-3064-7053EC4CCACD]
    // </editor-fold> 
    public String getDataPageses () {
        return dataPageses;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9450CE69-9CD0-7ED2-E6A7-6B2CDFF57E8D]
    // </editor-fold> 
    public void setDataPageses (String val) {
        this.dataPageses = val;
    }

}

