import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent {
  news: any;
  news1: any;
  news2: any;
  news3: any;
  constructor(private http: HttpClient) {
      this.getNews();
      this.getNews1();
      this.getNews2();
      this.getNews3();
  }

  getNews() {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=8bfe668e2fcd426e92c8711e0907df76').subscribe(data => {
      this.news = data.articles;
  }, err => {
      console.log(err);
  }, () => {
      console.log("news got successfull");
  });
}
getNews1() {
  this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=8bfe668e2fcd426e92c8711e0907df76').subscribe(data => {
  this.news1 = data.articles;
}, err => {
  console.log(err);
}, () => {
  console.log("news got successfull");
});
}
getNews2() {
  this.http.get<any>('https://newsapi.org/v2/top-headlines?country=gr&apiKey=8bfe668e2fcd426e92c8711e0907df76').subscribe(data => {
  this.news2 = data.articles;
}, err => {
  console.log(err);
}, () => {
  console.log("news got successfull");
});
}
getNews3() {
  this.http.get<any>('https://newsapi.org/v2/top-headlines?country=ma&apiKey=8bfe668e2fcd426e92c8711e0907df76').subscribe(data => {
  this.news3 = data.articles;
}, err => {
  console.log(err);
}, () => {
  console.log("news got successfull");
});
}
}
