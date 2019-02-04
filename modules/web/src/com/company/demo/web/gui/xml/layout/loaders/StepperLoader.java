package com.company.demo.web.gui.xml.layout.loaders;

import com.company.demo.web.gui.components.Stepper;
import com.haulmont.cuba.gui.xml.layout.loaders.AbstractComponentLoader;

public class StepperLoader extends AbstractComponentLoader<Stepper> {
    @Override
    public void createComponent() {
        resultComponent = factory.createComponent(Stepper.class);
        loadId(resultComponent, element);
    }

    @Override
    public void loadComponent() {
    }
}
