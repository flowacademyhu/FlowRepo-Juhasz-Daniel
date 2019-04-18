import { Component, OnInit, Input, Output, EventEmitter} from '@angular/core';
import { LogServiceService } from '../../log-service.service';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  @Input()
  name: string;

  @Input()
  lastName: string;

  @Input()
  checkboxValue: boolean;

  @Input()
  statusNumber: number = 0;

  reachedString: String = 'elérted a 100-at';

  @Output() reached100 = new EventEmitter<any>();

  onClick() {
    this.statusNumber += 10;
    if ( this.statusNumber === 100) {
    this.reached100.next( { a: this.reachedString, b: this.name } );
    }
  }

  constructor(private logMessage: LogServiceService) {
  }

  ngOnInit() {
    this.logMessage.log(this.name);
    this.logMessage.log(this.lastName);
  }

}
