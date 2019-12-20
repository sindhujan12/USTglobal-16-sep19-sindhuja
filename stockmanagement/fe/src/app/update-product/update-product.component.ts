import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';


@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {

  constructor(private service: UserService) { }

  updateProduct(form : NgForm){
    console.log(form.value);
    this.service.update(form.value).subscribe(data => {
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
