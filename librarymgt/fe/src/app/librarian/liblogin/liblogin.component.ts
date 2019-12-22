import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-liblogin',
  templateUrl: './liblogin.component.html',
  styleUrls: ['./liblogin.component.css']
})
export class LibloginComponent implements OnInit {

  constructor(private service: LibraryserviceService) { }

  ngOnInit() {
  }
  loginData(form){
    console.log(form.value);
    this.service.librarianLogin(form);
  }
}
