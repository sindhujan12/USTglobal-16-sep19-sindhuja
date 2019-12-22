import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-reglibrarian',
  templateUrl: './reglibrarian.component.html',
  styleUrls: ['./reglibrarian.component.css']
})
export class ReglibrarianComponent implements OnInit {

  constructor(private service: LibraryserviceService) { }

  ngOnInit() {
  }
  
  get email(){
    return this.form.get("email");
  }
  get password(){
    return this.form.get("password");
  }
  get name(){
    return this.form.get("name");
  }
form=new FormGroup({
  name : new FormControl('',[Validators.required]),
  password : new FormControl('',[Validators.required,Validators.min(6)]),
  email : new FormControl('',[Validators.required,Validators.email])
})
addLibrarian(form){
  this.service.registerLibrarian(form.value);
  console.log(form.value);
  form.reset();
}

}
