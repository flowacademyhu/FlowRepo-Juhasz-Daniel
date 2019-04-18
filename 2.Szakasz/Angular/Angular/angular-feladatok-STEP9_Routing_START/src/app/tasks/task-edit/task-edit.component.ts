import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Task } from '../task.model';

@Component({
  selector: 'app-task-edit',
  templateUrl: './task-edit.component.html',
  styleUrls: ['./task-edit.component.css']
})
export class TaskEditComponent implements OnInit {

  model: Task;

  moveTasdo() {
    this.router.navigate([ 'tasks' ]);
    // this.router.navigate([ this.route.parent.toString() ]);
    // a kommentelt egy próba arra, hogy egyet lépjen vissza a fában
  }

  save() {
    this.getID.save(this.model);
    this.router.navigate(['tasks']);

  }

  constructor(
    private getID: TaskService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {

    this.route.params.subscribe(
      (result: any) => {
        this.model = this.getID.get(result.id);
        console.log(this.model);
      }
    );

  }

}
