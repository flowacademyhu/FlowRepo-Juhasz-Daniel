import { Component, OnInit } from '@angular/core';
import { BiderService } from '../bider.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-bider',
  templateUrl: './bider.component.html',
  styleUrls: ['./bider.component.css']
})
export class BiderComponent implements OnInit {

  constructor(private biderService: BiderService) { }

  public listProduct: Array<any> = new Array<any>();

  public id: number;

  public product: any;

  public getProductById(){
    this.biderService.getProductById(this.id).subscribe(
      result => this.product = result
    );
  }

  ngOnInit() {

    this.biderService.listAll().subscribe(
      result => this.listProduct = result
    );
  }

}
