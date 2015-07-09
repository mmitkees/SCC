package Template_Bean;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

public class Template_Bean {
    public Template_Bean() {
    }
    private UIComponent getUIComponent(String id) {  
          return FacesContext.getCurrentInstance().getViewRoot().findComponent(id) ;  
    }
    public void Menu_Redirect(ActionEvent actionEvent) {
        UIComponent c= getUIComponent("iframe_static_container");
    }
}
