import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  news: any;
  news1: any;
  news2: any;
  constructor(private http: HttpClient) {
      this.getNews();
      this.getNews1();
      this.getNews2();
  }

  getNews() {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=8bfe668e2fcd426e92c8711e0907df76').subscribe(data => {
      this.news = data.articles;
  }, err => {
      console.log(err);
  }, () => {
      console.log("news got successfull");
  });
}
getNews1() {
  this.http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=sports&apiKey=8bfe668e2fcd426e92c8711e0907df76').subscribe(data => {
  this.news1 = data.articles;
}, err => {
  console.log(err);
}, () => {
  console.log("news got successfull");
});
}

getNews2() {
  this.http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=entertainment&apiKey=8bfe668e2fcd426e92c8711e0907df76').subscribe(data => {
  this.news2 = data.articles;
}, err => {
  console.log(err);
}, () => {
  console.log("news got successfull");
});
}
}