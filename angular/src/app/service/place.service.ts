import { Injectable } from '@angular/core';
import {Observable} from "rxjs/internal/Observable";
import {Place} from "../model/place";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class PlaceService {
  placesURL = "http://localhost:8080/places";

  getProducts(): Observable<Place[]> {
    return this.http.get<Place[]>(this.placesURL);
  }

  constructor(
    private http: HttpClient
  ) {}
}
