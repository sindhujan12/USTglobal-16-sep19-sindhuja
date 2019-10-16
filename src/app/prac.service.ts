import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PracService {

  fbUrl = 'https://ust-global-aa80d.firebaseio.com/';
  constructor(private http: HttpClient) { }

  postUser(data: NgForm) {
    console.log('Service:', data);
    return this.http.post(`${this.fbUrl}/users.json`, data);
  }

  getUsers() {
    return this.http.get(`${this.fbUrl}/users.json`).pipe(
      map(data => {
        const newArray = [];
        // tslint:disable-next-line: forin
        for (const key in data) {
          newArray.push({...data[key], id : key});
        }
        return newArray;
      })
    );
  }

  deleteUsers(id) {
    return this.http.delete(`${this.fbUrl}/users/${id}.json`);
  }

  updateUser(id, data) {
    return this.http.put(`${this.fbUrl}/users/${id}.json`, data);
  }



}
