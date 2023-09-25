import { Injectable } from '@angular/core';
import{HttpClient} from'@angular/common/http'
import { Observable } from 'rxjs';
import { Customer } from './customer';
import { Showbill } from './showbill';
import { Showinvoice } from './showinvoice';
import { Showtransaction } from './showtransaction';
import { Addcustomer } from './addcustomer';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  getAlgetAllTransactionlInvoice() {
    throw new Error('Method not implemented.');
  }

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

  getAllTransaction(): Observable<Showtransaction[]>{
    return this.http.get<Showtransaction[]>(`${this.baseUrl}getAllTransaction`);  
  }

  public save(add: Addcustomer) {
    return this.http.post<Addcustomer>(`${this.baseUrl}AddCustomer`, add);
  }


  addCustomerBillData(obj:any){
    return (this.http.post(`${this.baseUrl}AddCustomer`,obj,{
      responseType:'text'
    }));

  }
}
