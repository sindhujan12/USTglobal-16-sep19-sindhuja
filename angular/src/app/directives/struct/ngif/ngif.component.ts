import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngif',
  templateUrl: './ngif.component.html',
  styleUrls: ['./ngif.component.css']
})
export class NgifComponent implements OnInit {
showOrHide = false;
  constructor() {
    setTimeout(() =>
    {
      this.showOrHide = true;
    },2000)
   }

  ngOnInit() {
  }

}
