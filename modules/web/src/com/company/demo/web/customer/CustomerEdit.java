package com.company.demo.web.customer;

import com.company.demo.entity.Customer;
import com.haulmont.cuba.gui.screen.*;

@UiController("demo$Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Customer> event) {
        event.getEntity().setScore(0);
    }
}