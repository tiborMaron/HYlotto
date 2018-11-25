import {Component } from '@angular/core';
import {Place} from "./model/place";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  openDetails(place: Place) {
    console.log(place);
  }
}
