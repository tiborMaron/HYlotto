import {Component, EventEmitter, Input, Output} from '@angular/core';
import {Place} from "../model/place";

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent {
  @Output() markerTriggered = new EventEmitter<Place>();
  @Input() places: Place[];
  zoom: number = 20;
  lat: number = 51.678418;
  long: number = 7.809007;
  name = "here goes the name";

  constructor(){}

  onMarkerClick(place: Place): void {
    this.markerTriggered.emit(place);
  }

}
