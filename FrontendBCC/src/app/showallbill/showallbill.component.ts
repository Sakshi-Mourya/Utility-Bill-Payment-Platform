import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { Showbill } from '../showbill';

@Component({
  selector: 'app-showallbill',
  templateUrl: './showallbill.component.html',
  styleUrls: ['./showallbill.component.css']
})
export class ShowallbillComponent implements OnInit {
  
  bill : Showbill[] |undefined;
  constructor(private customerService: CustomerService,private router:Router) { }

  ngOnInit(): void {
    
    this.customerService.getAllBill().subscribe((data: Showbill[]) => {
      console.log(data);
      this.bill = data;
    });
  }

  viewBill(id:any){
    this.router.navigate(['/invoice',id])
  }

}
