import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-regstudent',
  templateUrl: './regstudent.component.html',
  styleUrls: ['./regstudent.component.css']
})
export class RegstudentComponent implements OnInit {
  //  emailPattern:String= '[a-zA-Z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,63}';
  constructor(private service:LibraryserviceService) { }

  ngOnInit() {
  }

  
  get sname(){
    return this.form.get("sname");
  }
  
 
  get password(){
    return this.form.get("password");
  }
 
  get email(){
    return this.form.get("email");
  }
form=new FormGroup({
  sname : new FormControl('',[Validators.required]),
  password : new FormControl('',[Validators.required]),
    email :new FormControl('',[Validators.required,Validators.email])
})

addStudent(form) {
this.service.registerStudent(form);
console.log("data is",form.value);
form.reset();
}
}
