import { Component } from "@angular/core";
import { HttpClient } from '@angular/common/http';









@Component (
    {
        selector : 'app-login',
        templateUrl : './login.component.html',
        styleUrls : ['./login.component.css'],
    }
)






export class LoginComponent {
    news: any;
    constructor (private http : HttpClient) {
this.getNews();
    }
    getNews() {
        this.http.get('https://newsapi.org/v2/top-headlines?country=us&apiKey=cc2cc67df2a44d58af793225ad6a922e').subscribe(data => {
            this.news = data.articles;
    },err => {
        console.log(err);
    },() => {
        console.log("news got successfully");
    
    
})
}
}
