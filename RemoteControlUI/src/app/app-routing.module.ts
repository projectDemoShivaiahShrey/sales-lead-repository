import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { CumstomerWidgetComponent } from './cumstomer-widget/cumstomer-widget.component';
import { ViewMoreComponent } from './view-more/view-more.component';

const routes: Routes = [ 
  { path: "", component : HomePageComponent },
  { path: "customers", component : CumstomerWidgetComponent},
  {path: "viewMore/:clientID", component : ViewMoreComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
