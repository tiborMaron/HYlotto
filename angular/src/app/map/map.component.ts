import { Component, OnInit } from '@angular/core';
import {Coordinate} from "../model/coordinate";

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {
  zoom: number = 20;
  lat: number = 51.678418;
  long: number = 7.809007;
  coordinates: Coordinate[] = [{lat: 51.678418, long: 7.809007}, {lat: 50.678418, long: 7.809007}];

  constructor() { }

  ngOnInit() {
  }

}
