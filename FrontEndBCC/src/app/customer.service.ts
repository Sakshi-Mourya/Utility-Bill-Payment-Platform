import { Injectable } from '@angular/core';
import{HttpClient} from'@angular/common/http'
import { Observable } from 'rxjs';
import { Customer } from './customer';
import { Showbill } from './showbill';
import { Showinvoice } from './showinvoice';
@Injectable({
  providedIn: 'root'
})
export class CustomerService {

   baseUrl :string = "http://localhost:8080/";

  constructor(private http : HttpClient) { }

  getCustomers(): Observable<Customer[]>{
      return this.http.get<Customer[]>(`${this.baseUrl}GetAllCustomerInfo`);  
  }
  getAllBill(): Observable<Showbill[]>{
    return this.http.get<Showbill[]>(`${this.baseUrl}getAllBill`); 
  }
  getAllInvoice(): Observable<Showinvoice[]>{
    return this.http.get<Showinvoice[]>(`${this.baseUrl}getAllInvoice`);  

  }
}
