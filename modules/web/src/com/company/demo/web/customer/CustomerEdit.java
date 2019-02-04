package com.company.demo.web.customer;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.demo.entity.Customer;

public class CustomerEdit extends AbstractEditor<Customer> {
    @Override
    protected void initNewItem(Customer item) {
        item.setScore(0);
    }
}