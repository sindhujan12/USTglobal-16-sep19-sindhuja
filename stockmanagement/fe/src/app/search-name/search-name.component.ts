import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-search-name',
  templateUrl: './search-name.component.html',
  styleUrls: ['./search-name.component.css']
})
export class SearchNameComponent implements OnInit {
  product: any;

  constructor(private service: UserService) { }

  getProduct(form: NgForm){
    console.log(form.value);
    this.service.getName(form.value).subscribe(data => {
      this.product = data;
      console.log(data);
    },err => {
      console.log(err);
    },() => {
      console.log('data posted successfully');
    });
  }

  ngOnInit() {
  }

}
