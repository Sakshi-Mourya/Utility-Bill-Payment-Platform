import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { HomeComponent } from './home/home.component';
import { CustomerComponent } from './customer/customer.component';
import { DetailComponent } from './detail/detail.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { TransactionComponent } from './transaction/transaction.component';
import { BillComponent } from './bill/bill.component';
import { CommonComponent } from './common/common.component';
import { ShowallbillComponent } from './showallbill/showallbill.component';
import { ShowallinvoiceComponent } from './showallinvoice/showallinvoice.component';
import { ShowalltransactionComponent } from './showalltransaction/showalltransaction.component';


const routes: Routes = [
{
  path:"",redirectTo :"/login",pathMatch:"full"
},
{
  path:"login",component:LoginComponent
},
{
  path:'home', component:HomeComponent//,canActivate:[AuthGuard]
},
{
  path:'customer', component:CustomerComponent//,canActivate:[AuthGuard]
},
{
  path:'detail', component:DetailComponent//,canActivate:[AuthGuard]

},
{
  path:'common', component:CommonComponent//,canActivate:[AuthGuard]

},
{
  path:'add-customer', component:AddCustomerComponent//,canActivate:[AuthGuard]

},
{
  path:'invoice/:id', component:InvoiceComponent//,canActivate:[AuthGuard]

},
{
  path:'bill', component:BillComponent//,canActivate:[AuthGuard]

},
{
  path:'transaction', component:TransactionComponent//,canActivate:[AuthGuard]

},
{
  path:'showallbill', component:ShowallbillComponent//,canActivate:[AuthGuard]

},
{
  path:'showallinvoice', component:ShowallinvoiceComponent//,canActivate:[AuthGuard]

},
{
  path:'showalltransaction', component:ShowalltransactionComponent//,canActivate:[AuthGuard]

},
{
  path:"**",component:NotfoundComponent
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
