import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-place',
  templateUrl: './place.component.html',
  styleUrls: ['./place.component.css']
})
export class PlaceComponent implements OnInit {
  hidden = false;

  constructor() { }

  ngOnInit() {
  }

  toggleDetails() {
    this.hidden = !this.hidden;
  }

}
