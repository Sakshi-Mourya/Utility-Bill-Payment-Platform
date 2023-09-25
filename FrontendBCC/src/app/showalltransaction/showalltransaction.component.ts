import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';
import { Showtransaction } from '../showtransaction';

@Component({
  selector: 'app-showalltransaction',
  templateUrl: './showalltransaction.component.html',
  styleUrls: ['./showalltransaction.component.css']
})
export class ShowalltransactionComponent implements OnInit {

  transaction : Showtransaction[] | undefined

  constructor(private customerService: CustomerService,private router:Router) { }

  ngOnInit(): void {
    this.customerService.getAllTransaction().subscribe((data: Showtransaction[]) => {
      console.log(data);
      this.transaction = data;
    });
  }

}
