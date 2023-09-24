import { Component, OnDestroy, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit,OnDestroy{

  isShow:boolean=true;
  
  ID_PATTERN = "^\s*-?[0-9]{1,10}\s*$";

  incorrect:string='';

  constructor(private service:HttpService,private router:Router) { }
  

  ngOnInit(): void {
    document.body.className='bg_background';
  }
  onShow(){
    this.isShow=!this.isShow;
  }

  onSubmit(f:NgForm){
    let obj={
      employeeID:f.value.employeeID,
      otp:f.value.otp
    }

    this.service.login(obj)
    .subscribe((response:any)=>{
      console.log(response);

      this.router.navigate(['/home']);


    /*  if(response.msg==='Valid User'){
        // navigate to dashboard
        sessionStorage.setItem("username",response.user.username);
        this.router.navigate(['/home']);
      }else{
        this.incorrect=response.msg;
      }
      */
  })

}

ngOnDestroy(): void {
  document.body.className='';
}

}
