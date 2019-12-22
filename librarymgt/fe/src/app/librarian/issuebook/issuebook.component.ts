import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-issuebook',
  templateUrl: './issuebook.component.html',
  styleUrls: ['./issuebook.component.css']
})
export class IssuebookComponent implements OnInit {
  books = new Array();
  students = new Array();
  selectedStudent;
  
  constructor(private service: LibraryserviceService) {
    this.issueBooklist();
   }

   issueBooklist(){
      this.service.issueBook().subscribe(data=>{
        console.log("data success",data);
        for(let val=0;val<data.bookIssueBeans.length;val++){
          this.books.push({...data.bookIssueBeans[val].book, ...data.bookIssueBeans[val].student});
          this.books.push(data.bookIssueBeans[val].student);
        }
        console.log("selected ",this.books)
        console.log("selected students",this.students);
      }, err=>{
        console.log("error");
      }, ()=>{
        console.log('success');
      })
  }
  ngOnInit() {
  }
  issueBook(book,student){
    console.log("book",book);
    console.log('student',student);
  }
  // studentDetail(student){
  //   this.selectedStudent=student;
  // }
}

