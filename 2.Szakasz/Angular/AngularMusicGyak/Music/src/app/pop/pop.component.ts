import { Component, OnInit } from '@angular/core';
import { MusicServiceService } from '../music-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pop',
  templateUrl: './pop.component.html',
  styleUrls: ['./pop.component.css']
})
export class PopComponent implements OnInit {

  constructor(private musicService: MusicServiceService, private router: Router) { }

  pop: object[] = this.musicService.getPopMusic();

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

  clicked: boolean = false;

  clickOnIt() {
    this.clicked === false ? this.clicked = true : this.clicked = false;
  }

  ngOnInit() {

  }

}
