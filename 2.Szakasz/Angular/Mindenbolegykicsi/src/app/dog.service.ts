import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DogService {

  constructor(private http: HttpClient) { }

  getDogs() {
    return this.http.get('https://dog.ceo/api/breeds/image/random');
  }

}
