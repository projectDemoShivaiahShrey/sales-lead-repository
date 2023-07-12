import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { CumstomerWidgetComponent } from './cumstomer-widget/cumstomer-widget.component';

const routes: Routes = [ 
  { path: "", component : HomePageComponent },
  { path: "customers", component : CumstomerWidgetComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
