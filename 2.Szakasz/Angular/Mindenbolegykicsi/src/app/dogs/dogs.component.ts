import { Component, OnInit } from '@angular/core';
import { DogService } from '../dog.service';

@Component({
  selector: 'app-dogs',
  templateUrl: './dogs.component.html',
  styleUrls: ['./dogs.component.css']
})
export class DogsComponent implements OnInit {

  constructor(private dogservice: DogService) { }

  picture: any[];

  ngOnInit() {

    this.dogservice.getDogs().subscribe(
      (result: any[]) => {
        this.picture = result;
      }
    );

  }

}
