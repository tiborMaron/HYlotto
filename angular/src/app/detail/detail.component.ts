import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Place} from "../model/place";

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {
  @Output() closeDetail = new EventEmitter();
  @Input() place: Place;

  constructor() { }

  ngOnInit() {
  }

  onClose() {
    this.closeDetail.emit();
  }

}
