import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  constructor(private router: Router) { }

  num1: number;
  num2: number;
  numsum: number;

  check: boolean = false;
  text: string;
  textArray: string[] = [];

  hideit: boolean = false;
  hidedog: boolean = false;

  clickSum() {
      this.numsum = this.num1 + this.num2;
  }

  add() {
    this.textArray.push(this.text);
    console.log(this.textArray);
  }

  addOutput(a) {
    this.textArray.push(a);
  }

  hide() {
    this.hideit === false ? this.hideit = true : this.hideit = false;
  }

  showDog() {
    this.hidedog === false ? this.hidedog = true : this.hidedog = false;
  }

  goPokemon() {
    this.router.navigate(['/pokemon']);
  }

  ngOnInit() {

  }

}
