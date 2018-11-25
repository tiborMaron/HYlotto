import {Component, OnInit} from '@angular/core';
import {Place} from "./model/place";
import {PlaceService} from "./service/place.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  detailPlace: Place;
  showDetails: boolean = false;
  places: Place[];

  openDetails(place: Place) {
    this.detailPlace = place;
    this.showDetails = true;
  }

  constructor(
    private placeService: PlaceService
  ){}

  ngOnInit() {
    this.placeService.getProducts().subscribe(
      places => this.places = places
    )
  }
}
