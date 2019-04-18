import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from '../../../node_modules/rxjs/Observable';
import { Task } from './task.model';
import { LoggerService } from '../shared/logger.service';

@Injectable()
export class TaskService {

  constructor(private httpClient: HttpClient, private loggerService: LoggerService) { }

  getAll(): Observable<any> {
    return this.httpClient.get('https://jsonplaceholder.typicode.com/todos');
  }

  get(id: number) {
    return new Task(id, 'Task with number: {$id}', 0, 'Description for task: {$id}');
  }

  save(a: Task) {
    this.loggerService.log(a);
  }
}
