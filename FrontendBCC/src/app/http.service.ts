import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  baseUrl:string='http://localhost:8080/';

  constructor(private http:HttpClient) { }

  login(obj:any){
    return (this.http.post(`${this.baseUrl}login`,obj));
  }

  getRecordById(customerID:any){
    return (this.http.get(`${this.baseUrl}getSpecificCustomer/${customerID}`));
  }

  getcustomerdata(id:any){
    let cid=+id;
      return (this.http.get(`${this.baseUrl}getSpecificCustomer/${cid}`))
  }
  specificCustomer(id:any){
    let cid=+id;
    return (this.http.get(`${this.baseUrl}getInvoiceofSpecificCustomer/${cid}`))
  }

  

}
