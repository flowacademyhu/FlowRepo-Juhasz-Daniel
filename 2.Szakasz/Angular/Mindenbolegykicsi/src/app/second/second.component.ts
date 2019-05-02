import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  constructor() { }

  @Output() addTextArray = new EventEmitter();

  @Input()
  textArray: string[] = [];

  textsecond: string;

  sendOutput() {
    this.addTextArray.next(this.textsecond);
  }

  ngOnInit() {
  }

}
