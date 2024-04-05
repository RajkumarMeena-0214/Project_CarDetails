import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import{ DashboardComponent } from './dashboard/dashboard.component';
import { CarlistComponent } from './carlist/carlist.component';
import { CarComponent } from './car/car.component';

const routes: Routes = [

{
  path:'',
  redirectTo:'dashboard',
  pathMatch:'full'
},


{
  path:'dashboard',
  component: DashboardComponent
},

  {
    path:'carlist',
    component: CarlistComponent

  },
  {
    path:'car',
    component: CarComponent

  },{
    path:"car/:id",
    component:CarComponent
  }

  
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
