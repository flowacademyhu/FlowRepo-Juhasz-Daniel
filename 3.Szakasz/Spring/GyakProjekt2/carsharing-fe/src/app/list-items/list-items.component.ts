import { Component, OnInit } from '@angular/core';
import { ListItemsService } from '../list-items.service';

@Component({
  selector: 'app-list-items',
  templateUrl: './list-items.component.html',
  styleUrls: ['./list-items.component.css']
})
export class ListItemsComponent implements OnInit {

  public listCars: Array<any> = new Array<any>();

  constructor(private listItemService: ListItemsService) { }

  ngOnInit() {

    this.listItemService.getAll().subscribe(
      result => this.listCars = result
      );

  }

}
