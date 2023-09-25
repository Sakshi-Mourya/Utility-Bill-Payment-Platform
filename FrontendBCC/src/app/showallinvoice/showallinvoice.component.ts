import { Component, OnInit } from '@angular/core';
import { Showinvoice } from '../showinvoice';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showallinvoice',
  templateUrl: './showallinvoice.component.html',
  styleUrls: ['./showallinvoice.component.css']
})
export class ShowallinvoiceComponent implements OnInit {
  
  invoice : Showinvoice[] | undefined
  
  constructor(private customerService: CustomerService,private router:Router) { }

  ngOnInit(): void {

    this.customerService.getAllInvoice().subscribe((data: Showinvoice[]) => {
      console.log(data);
      this.invoice = data;
    });
  }

}
