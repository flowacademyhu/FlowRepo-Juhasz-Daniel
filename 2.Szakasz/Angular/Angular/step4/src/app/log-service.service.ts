import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class LogServiceService {

  log(message: string) {
    console.log(message);
  }

  constructor() { }

}
