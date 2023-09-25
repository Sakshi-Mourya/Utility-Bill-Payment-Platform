import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import{HttpClientModule} from'@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { LoginComponent } from './login/login.component';
import {FormsModule} from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { HeaderComponent } from './header/header.component';
import { DetailComponent } from './detail/detail.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './shared/material.module';
import { InvoiceComponent } from './invoice/invoice.component';
import { TransactionComponent } from './transaction/transaction.component';
import { BillComponent } from './bill/bill.component';
import { CommonComponent } from './common/common.component';
import { ShowallbillComponent } from './showallbill/showallbill.component';
import { ShowallinvoiceComponent } from './showallinvoice/showallinvoice.component';
import { ShowalltransactionComponent } from './showalltransaction/showalltransaction.component';



@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    LoginComponent,
    HomeComponent,
    NotfoundComponent,
    HeaderComponent,
    DetailComponent,
    AddCustomerComponent,
    InvoiceComponent,
    TransactionComponent,
    BillComponent,
    CommonComponent,
    ShowallbillComponent,
    ShowallinvoiceComponent,
    ShowalltransactionComponent,
   
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    MaterialModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
