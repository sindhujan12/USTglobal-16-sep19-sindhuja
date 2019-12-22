import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-mybooks',
  templateUrl: './mybooks.component.html',
  styleUrls: ['./mybooks.component.css']
})
export class MybooksComponent implements OnInit {
books=new Array();
row=0;
searchedBook;
bookName:String;
bookAuthor : String;
  constructor(private service: LibraryserviceService) {
    this.getMyBooks();
   }

  ngOnInit() {
  }


  returnBook(book){
    this.service.requestReturn(book).subscribe(data=>{
      console.log("book requested to return ")
    }, err=>{
      console.log("error")
    }, ()=>{
      console.log("success");
    })
  }

  // detailBook(book){
  //   console.log(book.book.bid)
  //   this.service.searchBook(book.book).subscribe(data=>{
  //     console.log("searched book is",data.bookBeans);
  //     // this.searchedBook=data.bookBeans;
  //    for(let val=0;val<data.bookIssueBeans.length;val++){
  //         this.searchedBook.push(data.bookIssueBeans[val].book);
  //     }
  //     console.log(this.searchedBook);
  //   }, err=>{
  //     console.log("error")
  //   }, ()=>{
  //     console.log("got book")
  //   })
  // }

  detailBook(book) {
    this.searchedBook = book;
  }

getMyBooks() {
  const student = JSON.parse(localStorage.getItem('student'));

  this.service.getMybooks(student).subscribe( data => {
    console.log('data got');
    for(let val=0; val<data.bookIssueBeans.length; val++ ) {
          this.books.push(data.bookIssueBeans[val].book);
      }
    console.log('my book', this.books);
  }, err => {
    console.log('error');
  }, () => {
    console.log('data got');
  });
}
}
