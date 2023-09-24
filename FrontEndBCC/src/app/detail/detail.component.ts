import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpService } from '../http.service';
import { Customer } from '../customer';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  customer:any=<Customer>{};
  constructor(private route:ActivatedRoute,private service:HttpService) { }

  ngOnInit(): void {
    this.GetDataFromUrl()
  }
  GetDataFromUrl() {
    throw new Error('Method not implemented.');
  }
  GetdataFromUrl(){
    this.route.paramMap
    .subscribe((param:any)=>{
      //  console.log(param.get("id"));
        this.service.getRecordById(param.get("customerID"))
        .subscribe((response:any)=>{
          console.log(response);
          //this.empobj=response;
          // console.log(this.empObj);
        })
    })
}
OnUpdate(){
    
}

}
