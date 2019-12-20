import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-search-company',
  templateUrl: './search-company.component.html',
  styleUrls: ['./search-company.component.css']
})
export class SearchCompanyComponent implements OnInit {
  product: any;

  constructor(private service: UserService) { }

  getProduct(form: NgForm){
    console.log(form.value);
    this.service.getCompany(form.value).subscribe(data => {
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
