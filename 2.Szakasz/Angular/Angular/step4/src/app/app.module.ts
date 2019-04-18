import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { TaskListComponent } from './tasks/task-list/task-list.component';
import { TaskComponent } from './tasks/task/task.component';
import { LogServiceService } from './log-service.service';
import { TaskServiceService } from './task-service.service';
import { BackgroundColorDirective } from './background-color.directive';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TaskListComponent,
    TaskComponent,
    BackgroundColorDirective
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [LogServiceService, TaskServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
