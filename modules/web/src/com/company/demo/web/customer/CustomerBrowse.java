package com.company.demo.web.customer;

import com.company.demo.entity.Customer;
import com.haulmont.cuba.gui.screen.*;

@UiController("demo$Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}