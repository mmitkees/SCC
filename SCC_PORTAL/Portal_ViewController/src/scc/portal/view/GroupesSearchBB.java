package scc.portal.view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.data.RichTree;

import oracle.javatools.parser.java.v2.classfile.Convert;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.TreeModel;

public class GroupesSearchBB {
    ViewObject vo;

    public GroupesSearchBB() {
    }

    public void NodeSeletionListener(SelectionEvent selectionEvent) {
        //original selection listener set by ADF     //#{bindings.allDepartments.treeModel.makeCurrent}
        String adfSelectionListener =
            "#{bindings.CourtTypes2.treeModel.makeCurrent}";
        //make sure the default selection listener functionality is  //preserved. you don't need to do this for multi select trees            //as the ADF binding only supports single current row selection /* START PRESERVER DEFAULT ADF SELECT BEHAVIOR */
        FacesContext fctx = FacesContext.getCurrentInstance();
        Application application = fctx.getApplication();
        ELContext elCtx = fctx.getELContext();
        ExpressionFactory exprFactory = application.getExpressionFactory();
        MethodExpression me = null;
        me =
 exprFactory.createMethodExpression(elCtx, adfSelectionListener, Object.class,
                                    new Class[] { SelectionEvent.class });
        me.invoke(elCtx, new Object[] { selectionEvent });
        /* END PRESERVER DEFAULT ADF SELECT BEHAVIOR */
        RichTree tree = (RichTree)selectionEvent.getSource();
        TreeModel model = (TreeModel)tree.getValue();
        //get selected nodes
        RowKeySet rowKeySet = selectionEvent.getAddedSet();
        Iterator rksIterator = rowKeySet.iterator();
        //for single select configurations,this only is called once
        while (rksIterator.hasNext()) {
            List key = (List)rksIterator.next();
            JUCtrlHierBinding treeBinding = null;
            CollectionModel collectionModel = (CollectionModel)tree.getValue();
            treeBinding = (JUCtrlHierBinding)collectionModel.getWrappedData();
            JUCtrlHierNodeBinding nodeBinding = null;
            nodeBinding = treeBinding.findNodeByKeyPath(key);
            Row rw = nodeBinding.getRow();
            String[] attribs =
                rw.getAttributeNames(); //print first row attribute. Note that in a tree you have to  //determine the node type if you want to select node attributes
            //by name and not index
            String rowType = rw.getStructureDef().getDefName();
            if (rowType.equalsIgnoreCase("CourtTypesVO_SD")) {
                break;
            } else if (rowType.equalsIgnoreCase("PartsLKPVO_SD")) { //  (Arrays.asList(attribs).contains("Makalurl")?rw.getAttribute("Makalurl").toString():"none");
                System.out.println(rw.getAttribute("PartId").toString());
                FacesContext context = FacesContext.getCurrentInstance();
                BindingContext bindingContext = BindingContext.getCurrent();
                DCDataControl dc =
                    bindingContext.findDataControl("AppModuleAM_SDDataControl");
                // Name of application module in datacontrolBinding.cpx
                ApplicationModule am = (ApplicationModule)dc.getDataProvider();
                //ApplicationModule am = (ApplicationModule)resolvElDC(AppModuleAM_SD);
                //  ApplicationModule am = new App AppModuleAM_SD();
                oracle.jbo.domain.Number num =
                    (oracle.jbo.domain.Number)rw.getAttribute("PartId");
                vo = am.findViewObject("GroupesSearch1");
                vo.setNamedWhereClauseParam("PartNumber", num);
                vo.executeQuery();

            }

        }
    }
   String selectedNode;
   public String setselectedNodeValue() {
        selectedNode= vo.getNamedWhereClauseParam("PartNumber").toString();
         return selectedNode;
    }


}

