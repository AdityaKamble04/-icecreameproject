package com.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class customer {

	 @Id

	    @Column(name = "customername", nullable = false) 
	    private String customername;

	    @Column(name = "customeremail", nullable = false, unique = true) 
	    private String customeremail;

	    @Column(name = "customercontact", nullable = false)
	    private String customercontact;

	    @Column(name = "customeraddress", nullable = true) 
	    private String customeraddress;

	    
	    public customer(String customername, String customeremail, String customercontact, String customeraddress) {
	        this.customername = customername;
	        this.customeremail = customeremail;
	        this.customercontact = customercontact;
	        this.customeraddress = customeraddress;
	    }

	    // -------------------Getters and Setters----------------------------------//
	    
	    public String getCustomername() {
	        return customername;
	    }

	    public void setCustomername(String customername) {
	        this.customername = customername;
	    }

	    public String getCustomeremail() {
	        return customeremail;
	    }

	    public void setCustomeremail(String customeremail) {
	        this.customeremail = customeremail;
	    }

	    public String getCustomercontact() {
	        return customercontact;
	    }

	    public void setCustomercontact(String customercontact) {
	        this.customercontact = customercontact;
	    }

	    public String getCustomeraddress() {
	        return customeraddress;
	    }

	    public void setCustomeraddress(String customeraddress) {
	        this.customeraddress = customeraddress;
	    }

	    @Override
	    public String toString() {
	        return "Customer{ customername='" + customername + '\'' + ", customeremail='" + customeremail + '\'' + ", customercontact='" + customercontact + '\'' +  ", customeraddress='" + customeraddress + '\'' + '}';
	    }
	}


