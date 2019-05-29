import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BiderComponent } from './bider/bider.component';

const routes: Routes = [
  { path: '', redirectTo: '/bider', pathMatch: 'full' },
  {
    path: 'bider', component: BiderComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
