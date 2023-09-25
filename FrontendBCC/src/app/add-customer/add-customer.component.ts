import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Addcustomer } from '../addcustomer';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {

  addcustomer : Addcustomer=<Addcustomer>{};
  

  constructor(private customerService: CustomerService,private router:Router) {
  
   }

  ngOnInit(): void {
  }
  // onSubmit(f:NgForm) {
  //   this.customerService.save(this.addcustomer).subscribe(result => this.gotoUserList());
  // }

  // gotoUserList() {
  //   this.router.navigate(['/customer']);
  // }

  submitForm(data:NgForm) {
   
    this.customerService.addCustomerBillData(this.addcustomer)
    .subscribe((response:any)=>{
      console.log(response);
      //this.toaster.success("Customer Data Added Successfully")
      //this.router.navigate(['/customer-bill-data']);
      alert("Data Updated");



    })
  }
  getinfo(data:NgForm){
    let obj={
      customerID:data.value.customerID,
      customerName:data.value.customerName,
      customerEmail:data.value.customerEmail,
      customerContact:data.value.customerContact,
      billID:data.value.billID,
      unitConsumption:data.value.unitConsumption,
      billDueDate:data.value.billDueDate,
      billDuration:data.value.billDuration,

    }
    console.log(data.value.customerID);
    console.log(data.value.customerName);
    console.log(data.value.customerEmail);
    console.log(data.value.customerContact);
    console.log(data.value.billID);
    console.log(data.value.unitConsumption);
    console.log(data.value.billDueDate);
    console.log(data.value.billDuration);

    this.customerService.addCustomerBillData(obj).subscribe((respose)=>{
      alert(respose);
    })
  }
}


