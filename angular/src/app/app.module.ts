import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule }    from '@angular/common/http';
import { AppComponent } from './app.component';

import { AgmCoreModule } from '@agm/core';
import { MapComponent } from './map/map.component';
import { PlacesComponent } from './places/places.component';
import { PlaceComponent } from './places/place/place.component';

@NgModule({
  declarations: [
    AppComponent,
    MapComponent,
    PlacesComponent,
    PlaceComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyBej2lq39YJD7QuUbv6OEN_3_7DZ1lXcrM'
    })
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }
