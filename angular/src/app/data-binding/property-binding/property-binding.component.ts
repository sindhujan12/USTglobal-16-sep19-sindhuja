import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
name = 'sindhu';
imgUrl = 'https://cdn.pixabay.com/photo/2019/09/26/15/46/girl-4506318__340.jpg';
   address = 'kandukur signamanenipalle 523105';
   colorName = 'aqua';
   isActive = false;
   colSpanValue = 2;

  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'blue';
      this.isActive = !this.isActive;
    }, 1000);


}
}
