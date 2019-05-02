import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-favourites',
  templateUrl: './favourites.component.html',
  styleUrls: ['./favourites.component.css']
})
export class FavouritesComponent implements OnInit {

  constructor(private router: Router) { }

  favourites: string[];

  goAll() {
    this.router.navigate(['all']);
  }

  goPop() {
    this.router.navigate(['pop']);
  }

  goRetro() {
    this.router.navigate(['retro']);
  }

  goFavourites() {
    this.router.navigate(['favourites']);
  }

  ngOnInit() {
  }

}
