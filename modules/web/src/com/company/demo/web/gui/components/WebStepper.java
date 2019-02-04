package com.company.demo.web.gui.components;

import com.haulmont.cuba.web.gui.components.WebAbstractComponent;

public class WebStepper extends WebAbstractComponent<org.vaadin.risto.stepper.IntStepper> implements Stepper {
    public WebStepper() {
        this.component = new org.vaadin.risto.stepper.IntStepper();
    }
}