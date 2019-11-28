import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
 cars = [
   {
   imgurl :'https://cdn.pixabay.com/photo/2014/10/31/17/41/dancing-dave-minion-510835__340.jpg',
   name : 'minions'
 },
 {
  imgurl :'https://cdn.pixabay.com/photo/2013/11/20/09/36/attacking-213676__340.jpg',
  name : 'dragon'
 },
 {
  imgurl :'https://image.shutterstock.com/image-photo/dark-creepy-joker-face-screaming-260nw-304556045.jpg',
  name : 'joker'
 },
 {
  imgurl :'https://cdn.pixabay.com/photo/2017/07/20/03/52/chicken-2521140__340.png',
  name : 'chicken'
 }
]
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }

}
