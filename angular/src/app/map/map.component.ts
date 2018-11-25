import { Component, OnInit } from '@angular/core';
import {Coordinate} from "../model/coordinate";
import {CoordinateService} from "../service/coordinate.service";

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {
  zoom: number = 20;
  lat: number = 51.678418;
  long: number = 7.809007;
  coordinates: Coordinate[] = [{lat: 51.678418, long: 7.809007}, {lat: 51.578418, long: 7.809007}];

  constructor(
    private coordinateService: CoordinateService,
   ){}

  ngOnInit() {
    this.coordinateService.getEventCoordinates().
    subscribe(coordinates => this.coordinates = coordinates );
  }

}
