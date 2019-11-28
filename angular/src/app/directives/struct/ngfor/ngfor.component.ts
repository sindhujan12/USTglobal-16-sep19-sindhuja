import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {



   products = [
    {
      img : 'https://pixabay.com/photos/ice-cream-cone-melting-hot-1274894/',
      name : "ice cream",
      price : 50
    },
    {
      img : 'https://pixabay.com/photos/apples-basket-full-set-crop-food-805124/',
      name : "apple",
      price : 200
    },
    {
      img : 'https://pixabay.com/photos/cake-piece-of-cake-confectionery-1971552/',
      name : "cake",
      price : 80
    }
  ]
  constructor() { }
  ngOnInit() {
  }
    
}
