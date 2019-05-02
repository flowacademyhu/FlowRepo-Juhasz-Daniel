import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { PopComponent } from './pop/pop.component';
import { RapComponent } from './rap/rap.component';
import { AllComponent } from './all/all.component';
import { FavouritesComponent } from './favourites/favourites.component';

const routes: Routes = [
  { path: '', component: AllComponent },
  { path: 'pop', component: PopComponent},
  { path: 'retro', component: RapComponent},
  { path: 'all', component: AllComponent},
  { path: 'favourites', component: FavouritesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }