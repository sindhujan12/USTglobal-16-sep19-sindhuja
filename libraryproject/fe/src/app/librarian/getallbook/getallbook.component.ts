import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';

@Component({
  selector: 'app-getallbook',
  templateUrl: './getallbook.component.html',
  styleUrls: ['./getallbook.component.css']
})
export class GetallbookComponent implements OnInit {

  selectedBook;
  books : any;
  constructor(private service:LibraryserviceService) {
    this.getBooks();
   }
  ngOnInit() {
  }
  updateBook(book){
    
    this.selectedBook=book;
    console.log("selected book",this.selectedBook);
  }
  deleteBooks(book){
    console.log(book)
    this.service.deleteBook(book).subscribe(data=>{
      console.log('book deleted');
    }, err=>{
      console.log('book not deleted error')
    },()=>{
      console.log('success');
    })
  }
  editBook(update){
    console.log("edited book",update.value)
    this.service.editBook(update.value).subscribe(data=>{
      console.log("updated success",data);
    }, err=>{
      console.log("error");
    }, ()=>{
      console.log("updated success")
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
}
