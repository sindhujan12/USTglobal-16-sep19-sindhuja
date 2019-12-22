import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
error:String;
  constructor(private service:LibraryserviceService, private route:Router) { }

  search(form: NgForm){
       this.error=null;
       this.service.searchBook(form.value).subscribe(data=>{
        console.log(data);
       form.reset();
          }, err=>{
        console.log(err);
        this.error=err.error.message;
      })
  
     }

  ngOnInit() {
  }

}
