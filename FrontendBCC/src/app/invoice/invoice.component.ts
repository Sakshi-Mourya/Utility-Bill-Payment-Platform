import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpService } from '../http.service';
import { Customer } from '../customer';
import { Specinvoice } from '../specinvoice';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.css']
})
export class InvoiceComponent implements OnInit {
  customer:any=<Customer>{};
  invoice:any=<Specinvoice>{};
  constructor(private router:Router,private route:ActivatedRoute,private service:HttpService) { }

  ngOnInit(): void {
    this.getid();
  }

  getid(){
     this.route.paramMap.subscribe((pragma)=>{
         this.service.getcustomerdata(pragma.get('id')).subscribe((response)=>{
          this.customer=response;
          this.service.specificCustomer(pragma.get('id')).subscribe((response)=>{
            this.invoice=response;
          })
         })
         
  })
  }

}
