import { Component, OnInit, Directive, ElementRef, Renderer2 } from '@angular/core';
import { TaskServiceService } from '../../task-service.service';
import { LogServiceService } from '../../log-service.service';
import { errorHandler } from '@angular/platform-browser/src/browser';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})

export class TaskListComponent implements OnInit {

  tasks: String[] = ['cook', 'learn Angular', 'practice Java', 'watch Got', 'beat Feri in Codewars'];

  checkboxMark: boolean =false;

  num1: number = 3;

  handleTaskClicked(data: any) {
    alert(data.a);
    alert(data.b);
  }

  constructor(
    private getAll: TaskServiceService,
    private log: LogServiceService
    ) { }

  ngOnInit() {

    this.getAll.getAll(this.num1).subscribe(
      (result) => {
        this.log.log(result.toString());
      }, this.errorHandler,
      () => {alert('Kesz vagyok!');
    }
    );
  }

  errorHandler(err) {
      alert(err.statusText);
  }

}
