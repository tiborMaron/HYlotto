import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { AgmCoreModule } from '@agm/core';
import { MapComponent } from './map/map.component';
import { CoordinateService } from "./service/coordinate.service";

@NgModule({
  declarations: [
    AppComponent,
    MapComponent,
    CoordinateService
  ],
  imports: [
    BrowserModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyBej2lq39YJD7QuUbv6OEN_3_7DZ1lXcrM'
    })
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }
