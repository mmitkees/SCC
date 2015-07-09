package Template_Bean;

import java.util.HashMap;
import java.util.Map;

import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.RichMenu;
import oracle.adf.view.rich.component.rich.RichMenuBar;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichGoLink;
import oracle.adf.view.rich.component.rich.output.RichActiveImage;
import oracle.adf.view.rich.component.rich.output.RichInlineFrame;

import org.apache.myfaces.trinidad.component.UIXGroup;


public class MyBean {

    private RichActiveImage pt_copy_right;
    private RichActiveImage pt_footer;
    private RichInlineFrame iframe_static_container;
    private  RichGoLink cmi13;
    private  RichGoLink cmi12;
    private  RichGoLink cmi11;
    private  RichGoLink cmi10;
    private  RichGoLink cmi9;
    private RichMenu menu4;
    private RichMenuBar mb5;
    private RichGoLink cmi8;
    private  RichGoLink cmi425;
    private RichMenu submenu17;
    private  RichGoLink cmi424;
    private RichMenu submenu16;
    private  RichGoLink cmi423;
    private RichMenu submenu15;
    private  RichGoLink cmi422;
    private RichMenu submenu14;
    private  RichGoLink cmi421;
    private RichMenu submenu13;
    private  RichGoLink cmi420;
    private RichMenu submenu12;
    private  RichGoLink cmi419;
    private RichMenu submenu11;
    private  RichGoLink cmi418;
    private RichMenu submenu10;
    private  RichGoLink cmi417;
    private RichMenu submenu9;
    private  RichGoLink cmi416;
    private RichMenu submenu8;
    private  RichGoLink cmi415;
    private RichMenu submenu7;
    private  RichGoLink cmi414;
    private RichMenu submenu6;
    private  RichGoLink cmi413;
    private RichMenu submenu5;
    private  RichGoLink cmi412;
    private RichMenu submenu4;
    private RichMenu submenu00;
    private  RichGoLink cmi325;
    private  RichGoLink cmi324;
    private  RichGoLink cmi323;
    private  RichGoLink cmi322;
    private  RichGoLink cmi321;
    private  RichGoLink cmi320;
    private  RichGoLink cmi319;
    private  RichGoLink cmi318;
    private  RichGoLink cmi317;
    private  RichGoLink cmi316;
    private  RichGoLink cmi315;
    private  RichGoLink cmi314;
    private  RichGoLink cmi313;
    private RichMenu submenu3;
    private RichMenu menu3;
    private RichMenuBar mb4;
    private  RichGoLink cmi5;
    private  RichGoLink cmi4;
    private  RichGoLink cmi3;
    private  RichGoLink cmi2;
    private  RichGoLink cmi1;
    private RichMenu menu2;
    private RichMenuBar mb3;
    private  RichGoLink cmi30;
    private  RichGoLink cmi29;
    private  RichGoLink cmi28;
    private  RichGoLink cmi27;
    private  RichGoLink cmi26;
    private RichMenu subMenu3;
    private  RichGoLink cmi25;
    private  RichGoLink cmi24;
    private RichMenu subMenu0;
    private  RichGoLink cmi23;
    private RichMenu menu0;
    private RichMenuBar mb1;
    private  RichGoLink cmi22;
    private RichMenuBar mb8;
    private  RichGoLink cmi21;
    private  RichGoLink cmi120;
    private  RichGoLink cmi19;
    private RichMenu menu6;
    private RichMenuBar mb7;
    private  RichGoLink cmi18;
    private  RichGoLink cmi17;
    private RichMenu subMenu1;
    private  RichGoLink cmi16;
    private  RichGoLink cmi15;
    private  RichGoLink cmi14;
    private RichMenu menu5;
    private RichMenuBar mb6;
    private  RichGoLink cmi04;
    private  RichGoLink cmi03;
    private  RichGoLink cmi02;
    private  RichGoLink cmi01;
    private  RichGoLink cmi05;
    private RichMenu menu1;
    private RichMenuBar mb2;
    private  RichGoLink cmi00;
    private RichMenuBar mb0;
    private RichActiveImage pt_ai1;
    private UIXGroup pt_g1;
    private RichPanelGroupLayout pt_pgl1;
    
    private String CurrentPath="";
    
    String path="";
     RichGoLink des;
     public void setCurrentPath(){
               }
       public String getCurrentPath()
       {
               Map m1 = new HashMap(); 
                     m1.put("/Portal_Pages/Welcome.jspx", "الرئيسية");
                     m1.put("/Portal_Pages/chairmanword.jspx", "عن المحكمة/ كلمة رئيس المحكمة");
                     m1.put("/Portal_Pages/AboutCourt.jspx", "?? ???????/??????? ????????");
                     m1.put("/Portal_Pages/CourtHistory.jspx", "?? ???????/???? ???????");
                     m1.put("/Portal_Pages/CourtBuilding.jspx", "?? ???????/???? ???????");
                     m1.put("/Portal_Pages/Galary.jspx", "?? ???????/???? ?????");
                     m1.put("/Portal_Pages/Search_pages/judjements_search.jspx", "??????? ?????????/ ????? ?? ???????");
                   ///
                   /////
                   /////
                   //////
                   m1.put("/Portal_Pages/CourtRollMofwadeen.jspx", "???????/ ????? ???? ????????");
                   m1.put("/Portal_Pages/CourtRoll.jspx", "???????/????? ???????");
                   ///////
                   m1.put("/Portal_Pages/Court_Members_Current.jspx", "????? ???????/??????? ??????? ?????????");
                   m1.put("/Portal_Pages/MofwaddeenViewer.jspx", "????? ???????/????? ???? ????????/ ?????");
                   //////////////////////////////
                   m1.put("/Portal_Pages/CourtChairmenPrevious.jspx", "????? ???????/??????? ?????/ ????? ?????????");
                   m1.put("/Portal_Pages/CourtChairmenRepresentativePrevious.jspx", "????? ???????/??????? ?????/???? ????? ????????? ");
                   m1.put("/Portal_Pages/MofwadeenChairmenPrevious.jspx", "????? ???????/??????? ?????/????? ???? ???????? ");
                   m1.put("/Portal_Pages/MofwadeenMembersPrevious.jspx", "????? ???????/??????? ?????/????? ???? ???????? ");
                   /////////////
                   m1.put("/Portal_Pages/Dostors.jspx", "??????? ?????????");
                   m1.put("/Portal_Pages/Magala.jspx", "??????/ ????? ??????");
                   m1.put("/Portal_Pages/Makalat.jspx", "??????/ ???? ???????");
                   //////
                   m1.put("/Portal_Pages/Search_pages/search_case.jspx.jspx", "???????/ ??? ?? ???????");
                   
               FacesContext ctx = FacesContext.getCurrentInstance();
               CurrentPath +=  ctx.getExternalContext().getRequestServletPath();
                 return  m1.get(CurrentPath).toString() ;
           }
       
        public void Menu_RedirectListner(javax.faces.event.ActionEvent actionEvent) {
            // Add event code here...
            des= ( RichGoLink) actionEvent.getSource();
            path= des.getShortDesc();
        }

    public void setPt_copy_right(RichActiveImage pt_copy_right) {
        this.pt_copy_right = pt_copy_right;
    }

    public RichActiveImage getPt_copy_right() {
        return pt_copy_right;
    }

    public void setPt_footer(RichActiveImage pt_footer) {
        this.pt_footer = pt_footer;
    }

    public RichActiveImage getPt_footer() {
        return pt_footer;
    }

    public void setIframe_static_container(RichInlineFrame iframe_static_container) {
        this.iframe_static_container = iframe_static_container;
    }

    public RichInlineFrame getIframe_static_container() {
        return iframe_static_container;
    }

    public void setCmi13( RichGoLink cmi13) {
        this.cmi13 = cmi13;
    }

    public  RichGoLink getCmi13() {
        return cmi13;
    }

    public void setCmi12( RichGoLink cmi12) {
        this.cmi12 = cmi12;
    }

    public  RichGoLink getCmi12() {
        return cmi12;
    }

    public void setCmi11( RichGoLink cmi11) {
        this.cmi11 = cmi11;
    }

    public  RichGoLink getCmi11() {
        return cmi11;
    }

    public void setCmi10( RichGoLink cmi10) {
        this.cmi10 = cmi10;
    }

    public  RichGoLink getCmi10() {
        return cmi10;
    }

    public void setCmi9( RichGoLink cmi9) {
        this.cmi9 = cmi9;
    }

    public  RichGoLink getCmi9() {
        return cmi9;
    }

    public void setMenu4(RichMenu menu4) {
        this.menu4 = menu4;
    }

    public RichMenu getMenu4() {
        return menu4;
    }

    public void setMb5(RichMenuBar mb5) {
        this.mb5 = mb5;
    }

    public RichMenuBar getMb5() {
        return mb5;
    }

    public void setCmi8( RichGoLink cmi8) {
        this.cmi8 = cmi8;
    }

    public  RichGoLink getCmi8() {
        return cmi8;
    }

    public void setCmi425( RichGoLink cmi425) {
        this.cmi425 = cmi425;
    }

    public  RichGoLink getCmi425() {
        return cmi425;
    }

    public void setSubmenu17(RichMenu submenu17) {
        this.submenu17 = submenu17;
    }

    public RichMenu getSubmenu17() {
        return submenu17;
    }

    public void setCmi424( RichGoLink cmi424) {
        this.cmi424 = cmi424;
    }

    public  RichGoLink getCmi424() {
        return cmi424;
    }

    public void setSubmenu16(RichMenu submenu16) {
        this.submenu16 = submenu16;
    }

    public RichMenu getSubmenu16() {
        return submenu16;
    }

    public void setCmi423( RichGoLink cmi423) {
        this.cmi423 = cmi423;
    }

    public  RichGoLink getCmi423() {
        return cmi423;
    }

    public void setSubmenu15(RichMenu submenu15) {
        this.submenu15 = submenu15;
    }

    public RichMenu getSubmenu15() {
        return submenu15;
    }

    public void setCmi422( RichGoLink cmi422) {
        this.cmi422 = cmi422;
    }

    public  RichGoLink getCmi422() {
        return cmi422;
    }

    public void setSubmenu14(RichMenu submenu14) {
        this.submenu14 = submenu14;
    }

    public RichMenu getSubmenu14() {
        return submenu14;
    }

    public void setCmi421( RichGoLink cmi421) {
        this.cmi421 = cmi421;
    }

    public  RichGoLink getCmi421() {
        return cmi421;
    }

    public void setSubmenu13(RichMenu submenu13) {
        this.submenu13 = submenu13;
    }

    public RichMenu getSubmenu13() {
        return submenu13;
    }

    public void setCmi420( RichGoLink cmi420) {
        this.cmi420 = cmi420;
    }

    public  RichGoLink getCmi420() {
        return cmi420;
    }

    public void setSubmenu12(RichMenu submenu12) {
        this.submenu12 = submenu12;
    }

    public RichMenu getSubmenu12() {
        return submenu12;
    }

    public void setCmi419( RichGoLink cmi419) {
        this.cmi419 = cmi419;
    }

    public  RichGoLink getCmi419() {
        return cmi419;
    }

    public void setSubmenu11(RichMenu submenu11) {
        this.submenu11 = submenu11;
    }

    public RichMenu getSubmenu11() {
        return submenu11;
    }

    public void setCmi418( RichGoLink cmi418) {
        this.cmi418 = cmi418;
    }

    public  RichGoLink getCmi418() {
        return cmi418;
    }

    public void setSubmenu10(RichMenu submenu10) {
        this.submenu10 = submenu10;
    }

    public RichMenu getSubmenu10() {
        return submenu10;
    }

    public void setCmi417( RichGoLink cmi417) {
        this.cmi417 = cmi417;
    }

    public  RichGoLink getCmi417() {
        return cmi417;
    }

    public void setSubmenu9(RichMenu submenu9) {
        this.submenu9 = submenu9;
    }

    public RichMenu getSubmenu9() {
        return submenu9;
    }

    public void setCmi416( RichGoLink cmi416) {
        this.cmi416 = cmi416;
    }

    public  RichGoLink getCmi416() {
        return cmi416;
    }

    public void setSubmenu8(RichMenu submenu8) {
        this.submenu8 = submenu8;
    }

    public RichMenu getSubmenu8() {
        return submenu8;
    }

    public void setCmi415( RichGoLink cmi415) {
        this.cmi415 = cmi415;
    }

    public  RichGoLink getCmi415() {
        return cmi415;
    }

    public void setSubmenu7(RichMenu submenu7) {
        this.submenu7 = submenu7;
    }

    public RichMenu getSubmenu7() {
        return submenu7;
    }

    public void setCmi414( RichGoLink cmi414) {
        this.cmi414 = cmi414;
    }

    public  RichGoLink getCmi414() {
        return cmi414;
    }

    public void setSubmenu6(RichMenu submenu6) {
        this.submenu6 = submenu6;
    }

    public RichMenu getSubmenu6() {
        return submenu6;
    }

    public void setCmi413( RichGoLink cmi413) {
        this.cmi413 = cmi413;
    }

    public  RichGoLink getCmi413() {
        return cmi413;
    }

    public void setSubmenu5(RichMenu submenu5) {
        this.submenu5 = submenu5;
    }

    public RichMenu getSubmenu5() {
        return submenu5;
    }

    public void setCmi412( RichGoLink cmi412) {
        this.cmi412 = cmi412;
    }

    public  RichGoLink getCmi412() {
        return cmi412;
    }

    public void setSubmenu4(RichMenu submenu4) {
        this.submenu4 = submenu4;
    }

    public RichMenu getSubmenu4() {
        return submenu4;
    }

    public void setSubmenu00(RichMenu submenu00) {
        this.submenu00 = submenu00;
    }

    public RichMenu getSubmenu00() {
        return submenu00;
    }

    public void setCmi325( RichGoLink cmi325) {
        this.cmi325 = cmi325;
    }

    public  RichGoLink getCmi325() {
        return cmi325;
    }

    public void setCmi324( RichGoLink cmi324) {
        this.cmi324 = cmi324;
    }

    public  RichGoLink getCmi324() {
        return cmi324;
    }

    public void setCmi323( RichGoLink cmi323) {
        this.cmi323 = cmi323;
    }

    public  RichGoLink getCmi323() {
        return cmi323;
    }

    public void setCmi322( RichGoLink cmi322) {
        this.cmi322 = cmi322;
    }

    public  RichGoLink getCmi322() {
        return cmi322;
    }

    public void setCmi321( RichGoLink cmi321) {
        this.cmi321 = cmi321;
    }

    public  RichGoLink getCmi321() {
        return cmi321;
    }

    public void setCmi320( RichGoLink cmi320) {
        this.cmi320 = cmi320;
    }

    public  RichGoLink getCmi320() {
        return cmi320;
    }

    public void setCmi319( RichGoLink cmi319) {
        this.cmi319 = cmi319;
    }

    public  RichGoLink getCmi319() {
        return cmi319;
    }

    public void setCmi318( RichGoLink cmi318) {
        this.cmi318 = cmi318;
    }

    public  RichGoLink getCmi318() {
        return cmi318;
    }

    public void setCmi317( RichGoLink cmi317) {
        this.cmi317 = cmi317;
    }

    public  RichGoLink getCmi317() {
        return cmi317;
    }

    public void setCmi316( RichGoLink cmi316) {
        this.cmi316 = cmi316;
    }

    public  RichGoLink getCmi316() {
        return cmi316;
    }

    public void setCmi315( RichGoLink cmi315) {
        this.cmi315 = cmi315;
    }

    public  RichGoLink getCmi315() {
        return cmi315;
    }

    public void setCmi314( RichGoLink cmi314) {
        this.cmi314 = cmi314;
    }

    public  RichGoLink getCmi314() {
        return cmi314;
    }

    public void setCmi313( RichGoLink cmi313) {
        this.cmi313 = cmi313;
    }

    public  RichGoLink getCmi313() {
        return cmi313;
    }

    public void setSubmenu3(RichMenu submenu3) {
        this.submenu3 = submenu3;
    }

    public RichMenu getSubmenu3() {
        return submenu3;
    }

    public void setMenu3(RichMenu menu3) {
        this.menu3 = menu3;
    }

    public RichMenu getMenu3() {
        return menu3;
    }

    public void setMb4(RichMenuBar mb4) {
        this.mb4 = mb4;
    }

    public RichMenuBar getMb4() {
        return mb4;
    }

    public void setCmi5( RichGoLink cmi5) {
        this.cmi5 = cmi5;
    }

    public  RichGoLink getCmi5() {
        return cmi5;
    }

    public void setCmi4( RichGoLink cmi4) {
        this.cmi4 = cmi4;
    }

    public  RichGoLink getCmi4() {
        return cmi4;
    }

    public void setCmi3( RichGoLink cmi3) {
        this.cmi3 = cmi3;
    }

    public  RichGoLink getCmi3() {
        return cmi3;
    }

    public void setCmi2( RichGoLink cmi2) {
        this.cmi2 = cmi2;
    }

    public  RichGoLink getCmi2() {
        return cmi2;
    }

    public void setCmi1( RichGoLink cmi1) {
        this.cmi1 = cmi1;
    }

    public  RichGoLink getCmi1() {
        return cmi1;
    }

    public void setMenu2(RichMenu menu2) {
        this.menu2 = menu2;
    }

    public RichMenu getMenu2() {
        return menu2;
    }

    public void setMb3(RichMenuBar mb3) {
        this.mb3 = mb3;
    }

    public RichMenuBar getMb3() {
        return mb3;
    }

    public void setCmi30( RichGoLink cmi30) {
        this.cmi30 = cmi30;
    }

    public  RichGoLink getCmi30() {
        return cmi30;
    }

    public void setCmi29( RichGoLink cmi29) {
        this.cmi29 = cmi29;
    }

    public  RichGoLink getCmi29() {
        return cmi29;
    }

    public void setCmi28( RichGoLink cmi28) {
        this.cmi28 = cmi28;
    }

    public  RichGoLink getCmi28() {
        return cmi28;
    }

    public void setCmi27( RichGoLink cmi27) {
        this.cmi27 = cmi27;
    }

    public  RichGoLink getCmi27() {
        return cmi27;
    }

    public void setCmi26( RichGoLink cmi26) {
        this.cmi26 = cmi26;
    }

    public  RichGoLink getCmi26() {
        return cmi26;
    }

    public void setSubMenu3(RichMenu subMenu3) {
        this.subMenu3 = subMenu3;
    }

    public RichMenu getSubMenu3() {
        return subMenu3;
    }

    public void setCmi25( RichGoLink cmi25) {
        this.cmi25 = cmi25;
    }

    public  RichGoLink getCmi25() {
        return cmi25;
    }

    public void setCmi24( RichGoLink cmi24) {
        this.cmi24 = cmi24;
    }

    public  RichGoLink getCmi24() {
        return cmi24;
    }

    public void setSubMenu0(RichMenu subMenu0) {
        this.subMenu0 = subMenu0;
    }

    public RichMenu getSubMenu0() {
        return subMenu0;
    }

    public void setCmi23( RichGoLink cmi23) {
        this.cmi23 = cmi23;
    }

    public  RichGoLink getCmi23() {
        return cmi23;
    }

    public void setMenu0(RichMenu menu0) {
        this.menu0 = menu0;
    }

    public RichMenu getMenu0() {
        return menu0;
    }

    public void setMb1(RichMenuBar mb1) {
        this.mb1 = mb1;
    }

    public RichMenuBar getMb1() {
        return mb1;
    }

    public void setCmi22( RichGoLink cmi22) {
        this.cmi22 = cmi22;
    }

    public  RichGoLink getCmi22() {
        return cmi22;
    }

    public void setMb8(RichMenuBar mb8) {
        this.mb8 = mb8;
    }

    public RichMenuBar getMb8() {
        return mb8;
    }

    public void setCmi21( RichGoLink cmi21) {
        this.cmi21 = cmi21;
    }

    public  RichGoLink getCmi21() {
        return cmi21;
    }

    public void setCmi120( RichGoLink cmi120) {
        this.cmi120 = cmi120;
    }

    public  RichGoLink getCmi120() {
        return cmi120;
    }

    public void setCmi19( RichGoLink cmi19) {
        this.cmi19 = cmi19;
    }

    public  RichGoLink getCmi19() {
        return cmi19;
    }

    public void setMenu6(RichMenu menu6) {
        this.menu6 = menu6;
    }

    public RichMenu getMenu6() {
        return menu6;
    }

    public void setMb7(RichMenuBar mb7) {
        this.mb7 = mb7;
    }

    public RichMenuBar getMb7() {
        return mb7;
    }

    public void setCmi18( RichGoLink cmi18) {
        this.cmi18 = cmi18;
    }

    public  RichGoLink getCmi18() {
        return cmi18;
    }

    public void setCmi17( RichGoLink cmi17) {
        this.cmi17 = cmi17;
    }

    public  RichGoLink getCmi17() {
        return cmi17;
    }

    public void setSubMenu1(RichMenu subMenu1) {
        this.subMenu1 = subMenu1;
    }

    public RichMenu getSubMenu1() {
        return subMenu1;
    }

    public void setCmi16( RichGoLink cmi16) {
        this.cmi16 = cmi16;
    }

    public  RichGoLink getCmi16() {
        return cmi16;
    }

    public void setCmi15( RichGoLink cmi15) {
        this.cmi15 = cmi15;
    }

    public  RichGoLink getCmi15() {
        return cmi15;
    }

    public void setCmi14( RichGoLink cmi14) {
        this.cmi14 = cmi14;
    }

    public  RichGoLink getCmi14() {
        return cmi14;
    }

    public void setMenu5(RichMenu menu5) {
        this.menu5 = menu5;
    }

    public RichMenu getMenu5() {
        return menu5;
    }

    public void setMb6(RichMenuBar mb6) {
        this.mb6 = mb6;
    }

    public RichMenuBar getMb6() {
        return mb6;
    }

    public void setCmi04( RichGoLink cmi04) {
        this.cmi04 = cmi04;
    }

    public  RichGoLink getCmi04() {
        return cmi04;
    }

    public void setCmi03( RichGoLink cmi03) {
        this.cmi03 = cmi03;
    }

    public  RichGoLink getCmi03() {
        return cmi03;
    }

    public void setCmi02( RichGoLink cmi02) {
        this.cmi02 = cmi02;
    }

    public  RichGoLink getCmi02() {
        return cmi02;
    }

    public void setCmi01( RichGoLink cmi01) {
        this.cmi01 = cmi01;
    }

    public  RichGoLink getCmi01() {
        return cmi01;
    }

    public void setCmi05( RichGoLink cmi05) {
        this.cmi05 = cmi05;
    }

    public  RichGoLink getCmi05() {
        return cmi05;
    }

    public void setMenu1(RichMenu menu1) {
        this.menu1 = menu1;
    }

    public RichMenu getMenu1() {
        return menu1;
    }

    public void setMb2(RichMenuBar mb2) {
        this.mb2 = mb2;
    }

    public RichMenuBar getMb2() {
        return mb2;
    }

    public void setCmi00( RichGoLink cmi00) {
        this.cmi00 = cmi00;
    }

    public  RichGoLink getCmi00() {
        return cmi00;
    }

    public void setMb0(RichMenuBar mb0) {
        this.mb0 = mb0;
    }

    public RichMenuBar getMb0() {
        return mb0;
    }

    public void setPt_ai1(RichActiveImage pt_ai1) {
        this.pt_ai1 = pt_ai1;
    }

    public RichActiveImage getPt_ai1() {
        return pt_ai1;
    }

    public void setPt_g1(UIXGroup pt_g1) {
        this.pt_g1 = pt_g1;
    }

    public UIXGroup getPt_g1() {
        return pt_g1;
    }

    public void setPt_pgl1(RichPanelGroupLayout pt_pgl1) {
        this.pt_pgl1 = pt_pgl1;
    }

    public RichPanelGroupLayout getPt_pgl1() {
        return pt_pgl1;
    }
}
