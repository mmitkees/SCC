package scc.portal.view;

import java.io.IOException;

import scc_search.*;
import javax.el.ELContext;

import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.OperationBinding;

import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.myfaces.trinidad.event.AttributeChangeEvent;

public class TestUntitledBB {
    public TestUntitledBB() {
        
    }

    public void AtrributeChanged(AttributeChangeEvent attributeChangeEvent) {
        FacesContext fc = FacesContext.getCurrentInstance();
        DCBindingContainer bc =
                    (DCBindingContainer)fc.getApplication().evaluateExpressionGet(fc,"#{bindings}",DCBindingContainer.class);    
        OperationBinding operation =bc.getOperationBinding("executeWithParams");
        operation.execute();
        if (!operation.getErrors().isEmpty())
          throw new RuntimeException("Error !"); // or show JSF faces error message
    }

    public void value_changed(ValueChangeEvent valueChangeEvent) {
        
        
        this.setValueToEL("#{bindings.CourtYear.inputValue}", valueChangeEvent.getNewValue()); //Updates the model
        System.out.println("\n******** Selected Value: "+resolveExpression("#{bindings.CourtYear.attributeValue}"));
        //System.out.println("\n******** Display Value: "+resolveExpression("#{bindings.CourtYear.selectedValue ne ' ' ? bindings.CourtYear.selectedValue.attributeValues[1] : ''}"));
        
        FacesContext fc = FacesContext.getCurrentInstance();
        DCBindingContainer bc =
                    (DCBindingContainer)fc.getApplication().evaluateExpressionGet(fc,"#{bindings}",DCBindingContainer.class);    
        OperationBinding operation =bc.getOperationBinding("ExecuteWithParams");
        operation.getParamsMap().put("CourtYear", resolveExpression("#{bindings.CourtYear.attributeValue}"));
        operation.execute();
        if (!operation.getErrors().isEmpty())
          throw new RuntimeException("Error !"); // or show JSF faces error message
        
        /*FacesContext context =  FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        ExpressionFactory ef = context.getApplication().getExpressionFactory();
        DCBindingContainer bc =(DCBindingContainer)ef.createValueExpression(context.getELContext(),"#{bindings}",DCBindingContainer.class).getValue(context.getELContext());
        DCIteratorBinding it=bc.findIteratorBinding("MofwadeenRollYears1Iterator");*/
    }
      
    public Object resolveExpression(String el) {      
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =  facesContext.getApplication().getExpressionFactory();        
        ValueExpression valueExp = expressionFactory.createValueExpression(elContext,el,Object.class);
        return valueExp.getValue(elContext);
    }

    public void setValueToEL(String el, Object val) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =   facesContext.getApplication().getExpressionFactory();
        ValueExpression exp = expressionFactory.createValueExpression(elContext, el, Object.class);
        exp.setValue(elContext, val);
    }
    
        public static void main(String[] args){
        /*String text =  "عبد المنعم حشيش";
        boolean bUseArabicAnalyser = true;
        String index = "idx2";// Index directory        
        if (bUseArabicAnalyser)
            index = "c:\\idx";// Index directory                
            EIS_search EISsearcher;
            try {
                EISsearcher = new EIS_search(index, bUseArabicAnalyser);
               float [][] arr= EISsearcher.SearchAdjudications(text);
                int x=0;
            } 
            catch (Exception e) {
            }*/
        }
    }

