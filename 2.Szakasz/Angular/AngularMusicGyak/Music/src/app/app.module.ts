import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FavouritesComponent } from './favourites/favourites.component';
import { RapComponent } from './rap/rap.component';
import { PopComponent } from './pop/pop.component';
import { AllComponent } from './all/all.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { NavigateDirective } from './navigate.directive';

@NgModule({
  declarations: [
    AppComponent,
    FavouritesComponent,
    RapComponent,
    PopComponent,
    AllComponent,
    NavigateDirective
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
