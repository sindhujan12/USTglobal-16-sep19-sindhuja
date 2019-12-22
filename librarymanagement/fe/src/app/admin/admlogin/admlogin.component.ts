import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admlogin',
  templateUrl: './admlogin.component.html',
  styleUrls: ['./admlogin.component.css']
})
export class AdmloginComponent implements OnInit {

  constructor(private service: LibraryserviceService, private route: Router) { }

  ngOnInit() {
  }
  admin;
  adminLogin(form){
    console.log(form.value);
   this.service.adminLogin(form);
  
  }  

}
