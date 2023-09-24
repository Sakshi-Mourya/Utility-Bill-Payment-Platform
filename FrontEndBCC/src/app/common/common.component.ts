import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-common',
  templateUrl: './common.component.html',
  styleUrls: ['./common.component.css']
})
export class CommonComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  Generate(){
    this.router.navigate(['/invoice']);
    }
    ShowBill() {
      this.router.navigate(['/bill']); 
    }
    
    Track() {
      this.router.navigate(['/transaction']); 
    }
    
  }

