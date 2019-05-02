import { Component, OnInit } from '@angular/core';
import { MusicServiceService } from '../music-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-all',
  templateUrl: './all.component.html',
  styleUrls: ['./all.component.css']
})
export class AllComponent implements OnInit {

  constructor( private musicService: MusicServiceService, private router: Router) { }

  all: object[] = this.musicService.getAllMusic();

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

    console.log(this.all);
  }

}
