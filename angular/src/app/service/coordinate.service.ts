import { Injectable } from '@angular/core';
import {Observable} from "rxjs/internal/Observable";
import {Coordinate} from "../model/coordinate";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CoordinateService {
  private coordinatesURL = "http://localhost:8080/coordinates";

  getEventCoordinates(): Observable<Coordinate[]> {
    return this.http.get<Coordinate[]>(this.coordinatesURL);
  }

  constructor(
    private http: HttpClient
  ) { }
}
