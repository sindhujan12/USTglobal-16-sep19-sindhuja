import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-deletestudent',
  templateUrl: './deletestudent.component.html',
  styleUrls: ['./deletestudent.component.css']
})
export class DeletestudentComponent implements OnInit {

  constructor(private service:LibraryserviceService) { }

  ngOnInit() {
  }
  searchStudent(form){
    console.log(form.value);
    this.service.deleteStudent(form.value);
  }
}
