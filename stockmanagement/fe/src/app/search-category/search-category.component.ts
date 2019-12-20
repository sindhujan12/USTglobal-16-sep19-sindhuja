import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-category',
  templateUrl: './search-category.component.html',
  styleUrls: ['./search-category.component.css']
})
export class SearchCategoryComponent implements OnInit {
  product: any;

  constructor(private service: UserService) { }

  getProduct(form: NgForm){
    console.log(form.value);
    this.service.getCategory(form.value).subscribe(data => {
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
