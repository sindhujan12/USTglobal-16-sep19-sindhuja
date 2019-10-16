import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  get addMovie() {
    return this.form.get('addMovie');
  }

  get movieTitle() {
    return this.form.get('movieTitle');
  }

  get movieImgUrl() {
    return this.form.get('movieImgUrl');
  }

  get movieDes() {
    return this.form.get('movieDes');
  }

  form = new FormGroup({
    addMovie : new FormControl('', [Validators.required]),
    movieTitle : new FormControl('', [Validators.required]),
    movieImgUrl : new FormControl('', [Validators.required]),
    movieDes : new FormControl('', [Validators.required]),
  });

  constructor() { }

  ngOnInit() {
  }

  loginData(form) {
    console.warn(form.value);
  }

}
