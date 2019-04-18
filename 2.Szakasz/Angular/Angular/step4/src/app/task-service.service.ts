import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { take } from 'rxjs/operators';

@Injectable()
export class TaskServiceService {



  getAll(num1: number) {

    console.log(num1);

    console.log('MAJOM');

    return this.http.get('https://jsonplaceholder.typicode.com/todos').pipe(
      take(num1)
    );

  }

  constructor(private http: HttpClient) { }

}
