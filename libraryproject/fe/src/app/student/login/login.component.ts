import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error;
  
  constructor(private service: LibraryserviceService, private route: Router) { }

  ngOnInit() {
  }
  loginData(form) {
    this.error = null;
    console.log(form.value);
    this.service.studentLogin(form).subscribe(data => {
      console.log("data is ", data);
      if (data.studentBeans != null) {
        localStorage.setItem('student', data.studentBeans);
        console.log(data.studentBeans.sid);
        this.service.isStudent = true;
        this.route.navigate(['studenthome']);
      } else {
        this.route.navigate(['studentlogin']);
        this.error = 'please enter valid credential';
      }
    }, err => {
      this.error = 'please enter valid credential';
    }, () => {
      console.log("data")
    })

  }
}
