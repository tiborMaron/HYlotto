import {Component, EventEmitter, Output} from '@angular/core';
import {Coordinate} from "../model/coordinate";
import {Place} from "../model/place";

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent {
  @Output() markerTriggered = new EventEmitter<Place>();
  zoom: number = 20;
  lat: number = 51.678418;
  long: number = 7.809007;
  name = "here goes the name";
  coordinates: Coordinate[] = [{lat: 51.678418, long: 7.809007}, {lat: 51.578418, long: 7.809007}];

  constructor(){}

  onMarkerClick(place: Place): void {
    this.markerTriggered.emit(place);
  }

}
