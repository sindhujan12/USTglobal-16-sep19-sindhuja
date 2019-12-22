import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {
books : any;
row = 0;
error:String;
  constructor(private service:LibraryserviceService, private route:Router) {
    if(service.isStudent){

    }else{
      route.navigate(['studentstudentlogin']);
    }
    this.getBooks();
    console.log("my calss",this.books)
   }

   issueBook(book){
     console.log(book);
     this.service.requestIssue(book).subscribe(data=>{
      console.log("requested for issue book");
      console.log(data);
     }, err=>{
       console.log("failed")
     },()=>{
       console.log("data")
     })
   }

   getBooks(){ 
     this.service.getAllBooks().subscribe(data=>{
    console.log("books are",data.bookBeans);
    this.books =data.bookBeans;
    console.log("my book",this.books);
  }, err=>{
    console.log("error");
  }, ()=>{
    console.log("data got")
  })
 
   }
  //  search(form: NgForm){
  //    this.error=null;
  //    this.service.searchBook(form.value).subscribe(data=>{
  //     console.log(data);
  //    form.reset();
  //       }, err=>{
  //     console.log(err);
  //     this.error=err.error.message;
  //   })

  //  }
  ngOnInit() {
  }

}
