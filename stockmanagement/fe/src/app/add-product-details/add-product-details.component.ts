import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-add-product-details',
  templateUrl: './add-product-details.component.html',
  styleUrls: ['./add-product-details.component.css']
})
export class AddProductDetailsComponent implements OnInit {

  constructor(private service: UserService) { }

  addProducts(form : NgForm){
    this.service.add(form.value).subscribe(data => {
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
