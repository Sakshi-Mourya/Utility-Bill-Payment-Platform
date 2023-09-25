import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';
import { Router } from '@angular/router';
import { Addcustomer } from '../addcustomer';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customers : Customer[] | undefined;

  constructor(private customerService: CustomerService,private router:Router) { 
  
  }

  ngOnInit(): void {
    this.customerService.getCustomers().subscribe((data: Customer[]) => {
      console.log(data);
      this.customers = data;
    });
  }

  

}
