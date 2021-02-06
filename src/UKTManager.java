
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iri_s
 */
public class UKTManager {
    public static void main(String[] args) {
        UKTSystem ukt = new UKTSystem();
        ukt.setEmri("Ujesjelles Kanalizime Tirane");
        
        //krijo deget
        
        Dega dg = new Dega();
        dg.setDega_id("10002");
        dg.setEmri("UKT Brryli");
        dg.setAdresa("Rruga Xhanfize Keko");
        dg.setNrpunonjesve("3");
        ukt.getDeget().add(dg);
        
                
        Dega dg1 = new Dega();
        dg1.setDega_id("10001");
        dg1.setEmri("UKT Vasil Shanto");
        dg1.setAdresa("Blv. Gjergj Fishta");
        dg1.setNrpunonjesve("2");
        ukt.getDeget().add(dg1);
        
        //krijo punonjesit
        
        Punonjes pn = new Punonjes();
        pn.setPu_id("e6789r");
        pn.setEmri("Eneid");
        ukt.getPunonjesit().add(pn);
        
        Punonjes pn1 = new Punonjes();
        pn1.setPu_id("m6789m");
        pn1.setEmri("Mira");
        ukt.getPunonjesit().add(pn1);
        
        Punonjes pn2 = new Punonjes();
        pn2.setPu_id("b6789sh");
        pn2.setEmri("Beni");
        ukt.getPunonjesit().add(pn2);
           
        Punonjes pn3 = new Punonjes();
        pn3.setPu_id("b6789h");
        pn3.setEmri("Bardhyl");
        ukt.getPunonjesit().add(pn3);
           
        Punonjes pn4 = new Punonjes();
        pn4.setPu_id("d6789k");
        pn4.setEmri("Dorian");
        ukt.getPunonjesit().add(pn4);
        
        
        //krijo klientet
        
        Klient kln = new Klient();
        kln.setKl_id("a12345p");
        kln.setEmri("Andrew");
        ukt.getKlientet().add(kln);
        
        Klient kln1 = new Klient();
        kln1.setKl_id("a12345t");
        kln1.setEmri("Allison");
        ukt.getKlientet().add(kln1);
        
         Klient kln2 = new Klient();
        kln2.setKl_id("d12345j");
        kln2.setEmri("Daniel");
        ukt.getKlientet().add(kln2);
        
         Klient kln3 = new Klient();
        kln3.setKl_id("j12345g");
        kln3.setEmri("Jack");
        ukt.getKlientet().add(kln3);
        
         Klient kln4 = new Klient();
        kln4.setKl_id("j12345h");
        kln4.setEmri("Jessica");
        ukt.getKlientet().add(kln4);
        
         Klient kln5 = new Klient();
        kln5.setKl_id("j12345n");
        kln5.setEmri("Jacqueline");
        ukt.getKlientet().add(kln5);
        
         Klient kln6 = new Klient();
        kln6.setKl_id("j12345s");
        kln6.setEmri("John");
        ukt.getKlientet().add(kln6);
        
         Klient kln7 = new Klient();
        kln7.setKl_id("m12345b");
        kln7.setEmri("Mary");
        ukt.getKlientet().add(kln7);
        
         Klient kln8 = new Klient();
        kln8.setKl_id("s12345j");
        kln8.setEmri("Samantha");
        ukt.getKlientet().add(kln8);
        
         Klient kln9 = new Klient();
        kln9.setKl_id("t12345b");
        kln9.setEmri("Tom");
        ukt.getKlientet().add(kln9);
        
        //create contract
        
        Kontrata kon = new Kontrata();
        kon.setKo_id("145001");
        kon.setNrmatesit("298001");
        ukt.getKontratat().add(kon);
        
         Kontrata kon1 = new Kontrata();
        kon1.setKo_id("145002");
        kon1.setNrmatesit("298002");
        ukt.getKontratat().add(kon1);
        
         Kontrata kon2 = new Kontrata();
        kon2.setKo_id("145003");
        kon2.setNrmatesit("298003");
        ukt.getKontratat().add(kon2);
        
         Kontrata kon3 = new Kontrata();
        kon3.setKo_id("145004");
        kon3.setNrmatesit("298004");
        ukt.getKontratat().add(kon3);
        
         Kontrata kon4 = new Kontrata();
        kon4.setKo_id("145005");
        kon4.setNrmatesit("298005");
        ukt.getKontratat().add(kon4);
        
         Kontrata kon5 = new Kontrata();
        kon5.setKo_id("145006");
        kon5.setNrmatesit("298006");
        ukt.getKontratat().add(kon5);
        
         Kontrata kon6 = new Kontrata();
        kon6.setKo_id("145007");
        kon6.setNrmatesit("298007");
        ukt.getKontratat().add(kon6);
        
         Kontrata kon7 = new Kontrata();
        kon7.setKo_id("145008");
        kon7.setNrmatesit("298008");
        ukt.getKontratat().add(kon7);
        
         Kontrata kon8 = new Kontrata();
        kon8.setKo_id("145009");
        kon8.setNrmatesit("298009");
        ukt.getKontratat().add(kon8);
        
         Kontrata kon9 = new Kontrata();
        kon9.setKo_id("1450010");
        kon9.setNrmatesit("2980010");
        ukt.getKontratat().add(kon9);
        
         Kontrata kon10 = new Kontrata();
        kon10.setKo_id("1450011");
        kon10.setNrmatesit("2980011");
        ukt.getKontratat().add(kon10);
        
         Kontrata kon11 = new Kontrata();
        kon11.setKo_id("1450012");
        kon11.setNrmatesit("2980012");
        ukt.getKontratat().add(kon11);
        
        //create bills
        
        Fatura ft = new Fatura();
        ft.setFa_id("1");
        ft.setSasia("20");
        ft.setShuma("600");
        ukt.getFaturat().add(ft);
        
        Fatura ft1 = new Fatura();
        ft1.setFa_id("2");
        ft1.setSasia("21");
        ft1.setShuma("630");
        ukt.getFaturat().add(ft1);
      
         Fatura ft2 = new Fatura();
        ft2.setFa_id("3");
        ft2.setSasia("30");
        ft2.setShuma("900");
        ukt.getFaturat().add(ft2);
        
         Fatura ft3 = new Fatura();
        ft3.setFa_id("4");
        ft3.setSasia("32");
        ft3.setShuma("960");
        ukt.getFaturat().add(ft3);
        
         Fatura ft4 = new Fatura();
        ft4.setFa_id("5");
        ft4.setSasia("33");
        ft4.setShuma("990");
        ukt.getFaturat().add(ft4);
        
         Fatura ft5 = new Fatura();
        ft5.setFa_id("6");
        ft5.setSasia("15");
        ft5.setShuma("450");
        ukt.getFaturat().add(ft5);
        
         Fatura ft6 = new Fatura();
        ft6.setFa_id("7");
        ft6.setSasia("20");
        ft6.setShuma("600");
        ukt.getFaturat().add(ft6);
        
         Fatura ft7 = new Fatura();
        ft7.setFa_id("8");
        ft7.setSasia("22");
        ft7.setShuma("660");
        ukt.getFaturat().add(ft7);
        
         Fatura ft8 = new Fatura();
        ft8.setFa_id("9");
        ft8.setSasia("20");
        ft8.setShuma("600");
        ukt.getFaturat().add(ft8);
        
         Fatura ft9 = new Fatura();
        ft9.setFa_id("10");
        ft9.setSasia("15");
        ft9.setShuma("450");
        ukt.getFaturat().add(ft9);
        
         Fatura ft10 = new Fatura();
        ft10.setFa_id("11");
        ft10.setSasia("25");
        ft10.setShuma("750");
        ukt.getFaturat().add(ft10);
        
         Fatura ft11 = new Fatura();
        ft11.setFa_id("12");
        ft11.setSasia("30");
        ft11.setShuma("900");
        ukt.getFaturat().add(ft11);
        
         Fatura ft12 = new Fatura();
        ft12.setFa_id("13");
        ft12.setSasia("25");
        ft12.setShuma("750");
        ukt.getFaturat().add(ft12);
        
         Fatura ft13 = new Fatura();
        ft13.setFa_id("14");
        ft13.setSasia("30");
        ft13.setShuma("900");
        ukt.getFaturat().add(ft13);
        
         Fatura ft14 = new Fatura();
        ft14.setFa_id("15");
        ft14.setSasia("15");
        ft14.setShuma("450");
        ukt.getFaturat().add(ft14);
        
         Fatura ft15 = new Fatura();
        ft15.setFa_id("16");
        ft15.setSasia("20");
        ft15.setShuma("600");
        ukt.getFaturat().add(ft15);
        
         Fatura ft16 = new Fatura();
        ft16.setFa_id("17");
        ft16.setSasia("15");
        ft16.setShuma("450");
        ukt.getFaturat().add(ft16);
        
         Fatura ft17 = new Fatura();
        ft17.setFa_id("18");
        ft17.setSasia("35");
        ft17.setShuma("1050");
        ukt.getFaturat().add(ft17);
        
         Fatura ft18 = new Fatura();
        ft18.setFa_id("19");
        ft18.setSasia("25");
        ft18.setShuma("750");
        ukt.getFaturat().add(ft18);
        
         Fatura ft19 = new Fatura();
        ft19.setFa_id("20");
        ft19.setSasia("45");
        ft19.setShuma("1350");
        ukt.getFaturat().add(ft19);
        
        
        //lidh degen punonjesit
        dg1.getPunonjesit().add(pn);
        dg1.getPunonjesit().add(pn1);
        
        dg.getPunonjesit().add(pn2);
        dg.getPunonjesit().add(pn3);
        dg.getPunonjesit().add(pn4);
        
        //lidh punonjesit me degen
        
            pn.setDega(dg1);
            pn1.setDega(dg1);
            
            pn2.setDega(dg);
            pn3.setDega(dg);
            pn4.setDega(dg);
      
            //lidh punonjesit me faturat
            
            pn.getFaturat().add(ft);
            pn.getFaturat().add(ft1);
            pn.getFaturat().add(ft2);
            pn.getFaturat().add(ft3);
            
            pn1.getFaturat().add(ft4);
            pn1.getFaturat().add(ft5);
            pn1.getFaturat().add(ft6);
            pn1.getFaturat().add(ft7);
            
            pn2.getFaturat().add(ft8);
            pn2.getFaturat().add(ft9);
            pn2.getFaturat().add(ft10);
            pn2.getFaturat().add(ft11);
            
             pn3.getFaturat().add(ft12);
             pn3.getFaturat().add(ft13);
             pn3.getFaturat().add(ft14);
             pn3.getFaturat().add(ft15);
             
             pn4.getFaturat().add(ft16);
             pn4.getFaturat().add(ft17);
             pn4.getFaturat().add(ft18);
             pn4.getFaturat().add(ft19);
             
             //lidh faturen me punonjesit
             
             ft.setPunonjesi(pn);
             ft1.setPunonjesi(pn);
             ft2.setPunonjesi(pn);
             ft3.setPunonjesi(pn);

             ft4.setPunonjesi(pn1);
             ft5.setPunonjesi(pn1);
             ft6.setPunonjesi(pn1);
             ft7.setPunonjesi(pn1);
             
            ft8.setPunonjesi(pn2);
            ft9.setPunonjesi(pn2);
            ft10.setPunonjesi(pn2);
            ft11.setPunonjesi(pn2);
            
            ft12.setPunonjesi(pn3);
            ft13.setPunonjesi(pn3);
            ft14.setPunonjesi(pn3);
            ft15.setPunonjesi(pn3);
            
            ft16.setPunonjesi(pn4);
            ft17.setPunonjesi(pn4);
            ft18.setPunonjesi(pn4);
            ft19.setPunonjesi(pn4);
             
            //lidh klientet me kontratat
            
            kln.getKontratat().add(kon);
            kln1.getKontratat().add(kon1);
            kln2.getKontratat().add(kon2);
            kln3.getKontratat().add(kon3);
            kln4.getKontratat().add(kon4);
            kln5.getKontratat().add(kon5);
            kln6.getKontratat().add(kon6);
            kln7.getKontratat().add(kon7);
            kln8.getKontratat().add(kon8);
            kln9.getKontratat().add(kon9);
            kln.getKontratat().add(kon10);
            kln1.getKontratat().add(kon11);
            
            
            //lidh kontratat me klientet
            kon.setKlienti(kln);
            kon1.setKlienti(kln1);
            kon2.setKlienti(kln2);
            kon3.setKlienti(kln3);
            kon4.setKlienti(kln4);
            kon5.setKlienti(kln5);
            kon6.setKlienti(kln6);
            kon7.setKlienti(kln7);
            kon8.setKlienti(kln8);
            kon9.setKlienti(kln9);
            kon10.setKlienti(kln);
            kon11.setKlienti(kln1);
                        
            
            //lidh kontratat me faturat
            kon.getFaturat().add(ft);
            kon1.getFaturat().add(ft1);
            kon2.getFaturat().add(ft2);
            kon3.getFaturat().add(ft3);
            kon4.getFaturat().add(ft4);
            kon5.getFaturat().add(ft5);
            kon6.getFaturat().add(ft6);
            kon7.getFaturat().add(ft7);
            kon8.getFaturat().add(ft8);
            kon9.getFaturat().add(ft9);
            kon10.getFaturat().add(ft10);
            kon11.getFaturat().add(ft11);
            kon.getFaturat().add(ft12);
            kon1.getFaturat().add(ft13);
            kon2.getFaturat().add(ft14);
            kon.getFaturat().add(ft15);
            kon3.getFaturat().add(ft16);
            kon4.getFaturat().add(ft17);
            kon5.getFaturat().add(ft18);
            kon6.getFaturat().add(ft19);
        
            
            // lidh faturat me kontratat
            ft.setKontrates(kon);
            ft1.setKontrates(kon1);
            ft2.setKontrates(kon2);
            ft3.setKontrates(kon3);
            ft4.setKontrates(kon4);
            ft5.setKontrates(kon5);
            ft6.setKontrates(kon6);
            ft7.setKontrates(kon7);
            ft8.setKontrates(kon8);
            ft9.setKontrates(kon9);
            ft10.setKontrates(kon10);
            ft11.setKontrates(kon11);
            ft12.setKontrates(kon);
            ft13.setKontrates(kon1);
            ft14.setKontrates(kon2);
            ft15.setKontrates(kon);
            ft16.setKontrates(kon3);
            ft17.setKontrates(kon4);
            ft18.setKontrates(kon5);
            ft19.setKontrates(kon6);
        /*
        System.out.println("==================================================================");
        //lista e degeve te sistemit
        
        System.out.println("Lista e degeve: ");
        Iterator dgt = ukt.getDeget().iterator();
      
        while (dgt.hasNext()){
            
            // I have student
            Dega deget = (Dega)dgt.next();
            
            System.out.println("Emri : " + deget.getEmri());
        }
        
      
              System.out.println("==================================================================");
      
        System.out.println("Lista e punonjesve");
        
      for ( int i=0; i<ukt.getPunonjesit().size(); i++ ) {
          
          // punonjes
          
          Punonjes punonjes = ukt.getPunonjesit().get(i);
          
          System.out.println("ID: " + punonjes.getPu_id() + " dhe Emri: " + punonjes.getEmri());
      }
      
      System.out.println("==================================================================");
      
        System.out.println("Lista e klienteve");
        
      for ( int i=0; i<ukt.getKlientet().size(); i++ ) {
          
          // klient
          
          Klient klient = ukt.getKlientet().get(i);
          
          System.out.println("ID: " + klient.getKl_id()+ " dhe Emri: " + klient.getEmri());
      }
      
      
      System.out.println("==================================================================");
      
        System.out.println("Lista e kontratave");
        
      for ( int i=0; i<ukt.getKontratat().size(); i++ ) {
          
          // kontrata
          
          Kontrata kontrate = ukt.getKontratat().get(i);
          
          System.out.println("NR: " + kontrate.getKo_id()+ "     dhe Nr matesit: " + kontrate.getNrmatesit());
      }
      
      
       System.out.println("==================================================================");
      //faturat
      
        System.out.println("Lista e faturave");
        
     
            ukt.getFaturat().forEach(fatura->System.out.println("Fatura ID: " + fatura.getFa_id() + 
                    
                    "  Sasia: "+ fatura.getSasia() + "  Shuma: "+fatura.getShuma()));
            
                   System.out.println("==================================================================");
                   
                   */
            System.out.println("Lista e degeve dhe punonjesve perkates ");
            
            Iterator deg = ukt.getDeget().iterator();
            
            while(deg.hasNext()) {
                
                Dega d = (Dega)deg.next();
                
                System.out.println("Dega " + d.getEmri()+" ka keto punonjes: ");
                Iterator degt= d.getPunonjesit().iterator();
                
                while(degt.hasNext()){
                    
                    Punonjes punonjes = (Punonjes)degt.next();
                    System.out.println("Punonjes: " + punonjes.getEmri());
                }
            }
            
            
            
            System.out.println("==================================================================");
      
        System.out.println("Dega qe ka secili punonjes");
        
      for ( int i=0; i<ukt.getPunonjesit().size(); i++ ) {
          
          // kontrata
          
          Punonjes punonjes = ukt.getPunonjesit().get(i);
          
          System.out.println("Emri: " + punonjes.getEmri()+ "     dhe Dega: " + punonjes.getDega().getEmri());
      }
            
    
     System.out.println("==================================================================");
      
      System.out.println("Lista e punonjesve dhe faturat qe kane vendosur: ");
            
            Iterator pun = ukt.getPunonjesit().iterator();
            
            while(pun.hasNext()) {
                
                Punonjes p = (Punonjes)pun.next();
                System.out.println("--------------------------------------------------------------");
                System.out.println("Punonjesi " + p.getEmri()+ " ka vendosur keto fatura: ");
                Iterator punjs= p.getFaturat().iterator();
                
                while(punjs.hasNext()){
                    
                    Fatura fatura = (Fatura)punjs.next();
                    System.out.println("Fatura ID: " + fatura.getFa_id() + " Sasia: " + fatura.getSasia() + " Shuma: " + fatura.getShuma());
                }
            }
            
      
               System.out.println("==================================================================");
      
        System.out.println("Punonjesi qe ka vendosur secilen fature");
        
      for ( int i=0; i<ukt.getFaturat().size(); i++ ) {
          
          System.out.println("--------------------------------------------------------------");
          // kontrata
          
          Fatura fatura = ukt.getFaturat().get(i);
          
          System.out.println("Fatura ID: " + fatura.getFa_id()+ " Sasia: " + fatura.getSasia() 
                  + " Shuma: " + fatura.getShuma()  + " dhe Punonjesi: " + fatura.getPunonjesi().getEmri());
      }
      
        System.out.println("==================================================================");
      
      System.out.println("Lista e klienteve dhe kontratat perkatese ");
            
            Iterator kli = ukt.getKlientet().iterator();
            
            while(kli.hasNext()) {
                
                Klient k = (Klient)kli.next();
                System.out.println("--------------------------------------------------------------");
                System.out.println("Klienti " + k.getEmri()+ " ka hapur keto kontrata: ");
                Iterator klien= k.getKontratat().iterator();
                
                while(klien.hasNext()){
                    
                    Kontrata kontrata = (Kontrata)klien.next();
                    System.out.println("Nr Kontrate: " + kontrata.getKo_id() 
                            + " Nr Matesit: " + kontrata.getNrmatesit());
                }
            }
      
              System.out.println("==================================================================");
      
        System.out.println("Klienti qe ka hapur secilen kontrate");
        
      for ( int i=0; i<ukt.getKontratat().size(); i++ ) {
          
          System.out.println("--------------------------------------------------------------");
          // kontrata
          
          Kontrata kontrata= ukt.getKontratat().get(i);
          
          System.out.println("Nr Kontrate: " + kontrata.getKo_id()+ " Nr Matesit: " + kontrata.getNrmatesit()
                  + " dhe Klienti: " + kontrata.getKlienti().getEmri());
      }
      
        System.out.println("=================================================================="); 
            
          
              System.out.println("==================================================================");
      
      System.out.println("Lista e kontratave dhe faturat perkatese ");
            
            Iterator kont = ukt.getKontratat().iterator();
            
            while(kont.hasNext()) {
                
                Kontrata ko = (Kontrata)kont.next();
                System.out.println("--------------------------------------------------------------");
                System.out.println("Kontrata " + ko.getKo_id()+ " ka keto fatura: ");
                Iterator kontr= ko.getFaturat().iterator();
                
                while(kontr.hasNext()){
                    
                    Fatura fatura = (Fatura)kontr.next();
                    System.out.println("Fatura ID: " + fatura.getFa_id()
                            + " Sasia: " + fatura.getSasia()+" Shuma: "+fatura.getShuma());
                }
            }
        
                   System.out.println("==================================================================");
      
        System.out.println("Faturat dhe kontratat respektive");
        
      for ( int i=0; i<ukt.getKontratat().size(); i++ ) {
          
          System.out.println("--------------------------------------------------------------");
          // kontrata
          
          Kontrata kontrata= ukt.getKontratat().get(i);
          
          System.out.println("Nr Kontrate: " + kontrata.getKo_id()+ " Nr Matesit: " + kontrata.getNrmatesit()
                  + " dhe Klienti: " + kontrata.getKlienti().getEmri());
      }
        
        
    }
    
  
}
