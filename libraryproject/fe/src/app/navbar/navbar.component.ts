import { Component, OnInit, DoCheck } from '@angular/core';
import { LibraryserviceService } from '../libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit, DoCheck {

  isAdmin;
  isLibrarian;
  isStudent;
  notLogin = true;
  constructor(private service: LibraryserviceService, private route: Router) { }

  ngOnInit() {

  }

  studentLogout(){
  this.service.studentLogout();
  }

  librarianLogout(){
    this.service.librarianLogut();
  }


  adminLogout(){
    this.service.adminLogout();
  }

  ngDoCheck(){
    this.isAdmin = this.service.isAdmin;
    this.isLibrarian = this.service.isLibrarian;
    this.isStudent = this.service.isStudent;
    if (this.isAdmin) {
      this.notLogin = false;
    } else {
      this.notLogin = true;
    }
    if (this.isLibrarian) {
      this.notLogin = false;
    } else {
      this.notLogin = true;
    }
    if (this.isStudent) {
      this.notLogin = false;
    } else {
      this.notLogin = true;
    }
  }
}
