import { Component, OnInit } from '@angular/core';
import { MusicServiceService } from '../music-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-rap',
  templateUrl: './rap.component.html',
  styleUrls: ['./rap.component.css']
})
export class RapComponent implements OnInit {

  constructor(private musicService: MusicServiceService, private router: Router) { }

  retro: object[] = this.musicService.getRetroMusic();

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
