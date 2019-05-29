import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BiderService {

  public baseUrl: string = 'http://localhost:8080';

  constructor(private http: HttpClient) {}

  public listAll(): Observable<any> {
    return this.http.get(this.baseUrl + '/product/getAll');
  }

  public getProductById(id): Observable<any> {
    return this.http.get(this.baseUrl + '/product/get/' + id);
  }
}
