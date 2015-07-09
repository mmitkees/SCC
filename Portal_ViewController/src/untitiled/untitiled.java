package untitiled;

import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichInlineFrame;

public class untitiled {
    private RichInlineFrame iframe_static_container_1;
    
    public untitiled() {
    }
    public void setIframe_static_container_1(RichInlineFrame iframe_static_container_1) {
        this.iframe_static_container_1 = iframe_static_container_1;
    }

    public RichInlineFrame getIframe_static_container_1() {
        return iframe_static_container_1;
    }
    public String ot1_action() {
        // Add event code here...
        iframe_static_container_1.setSource("http://www.adftips.com/2010/10/adf-ui-refreshing-page-or-region.html");
        return null;
    }
    public void link_Click_action_listener(javax.faces.event.ActionEvent actionEvent) {
        // Add event code here...
        RichCommandLink des = (RichCommandLink)actionEvent.getSource();
        String path = des.getShortDesc();
    }
}
