import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MusicServiceService {

  constructor() { }

  updateFavourites() {
    return 
  }

  getAllMusic() {
    const all = [];
    all.push(this.pop);
    all.push(this.retro);
    return all;
  }

  getRetroMusic() {
    return this.retro;
  }

  getPopMusic() {
    return this.pop;
  }

  getFavourites() {

  }

  pop = [{
    id: 0,
    artist: 'Shawn Mendes & Zedd',
    title: 'Lost In Japan'
  }, {
    id: 1,
  artist: 'Bad Bunny',
  title: 'Mia'
 }, {
  id: 2,
  artist: 'Halsey',
  title: 'Without Me'
 }, {
  id: 3,
  artist: 'Bruno Mars & Cardi B',
  title: 'Finesse'
 }, {
  id: 4,
  artist: 'Ne-Yo',
  title: 'Good man'
  }];

  retro = [{
  id: 5,
  artist: 'Madonna',
  title: 'Into the groove'
 }, {
  id: 6,
 artist: 'Guns & Roses',
 title: 'Paradise city'
 }, {
  id: 7,
 artist: 'Pixies',
 title: 'Where is my mind'
 }, {
  id: 8,
 artist: 'Bryan Adams',
 title: 'Summer of 69'
 }, {
  id: 9,
 artist: 'Billy Idol',
 title: 'Rebel yell'
  }];
}
