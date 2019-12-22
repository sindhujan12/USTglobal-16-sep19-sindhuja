import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class LibraryserviceService {

  studBean : any[];
  sid;
  isAdmin = false;
  isLibrarian = false;
  isStudent = false;
  books : any;
  constructor(public http: HttpClient, private route: Router) { }

  
  requestReturn(form){
    const issue='return';
    console.log('return request')
    console.log("student id",this.sid)
    return this.http.put<any>(`http://localhost:8080/lms/returnBook/${this.sid}/${form.bid}`,form);
  }

  deleteBook(form){
    return this.http.delete<any>(`http://localhost:8080/lms/removeBook/${form.bid}`);
  }

  editBook(book){
    return this.http.put<any>(`http://localhost:8080/lms/updateBook`,book);

  }

  issueBook(){
    return this.http.get<any>(`http://localhost:8080/lms/issueBook`);

  }

  returnBook(){
    return this.http.get<any>(`http://localhost:8080/lms/returnBook`);

  }

  getAllBooks(){
    // var email=form.value.email;
    // var password=form.value.password;
    return this.http.get<any>(`http://localhost:8080/lms/getAllBook`);
  }

  addBook(book){
    return this.http.put<any>(`http://localhost:8080/lms/addBook`,book.value);
  }

  searchBook(book){
    return this.http.get<any>(`http://localhost:8080/lms/searchBook/${book.bid}`,book);
  }

  getMybooks(student){
    console.log("my book method")
    console.log(this.sid);
    return this.http.get<any>(`http://localhost:8080/lms/getMyBooks/${student.sid}`)
  }

  requestIssue(form){
    const issue='issue';
    console.log('issue request')
    console.log("student id",this.sid)
    return this.http.put<any>(`http://localhost:8080/lms/request/${this.sid}/${form.bid}/${issue}`,form);

  }

  librarianLogin(form){
    var email=form.value.email;
    var password=form.value.password;
    return this.http.post<any>(`http://localhost:8080/lms/librarianlogin/${email}/${password}`, form.value).subscribe(data=>{
      console.log("data is ",data);
      if(data.librarianBeans!=null) {
        this.isLibrarian = true;
        this.route.navigate(['libhome']);

        console.log(this.isAdmin);
      }else{
        this.route.navigate(['librarylogin']);
      }
    }, err=>{
      console.log("data not found");
    }, ()=>{
      console.log("data")
    })
  }
  adminLogout(){
    this.isAdmin=false;
    this.route.navigate(['adminlogin']);
  }
  studentLogout(){
    this.isStudent=false;
    this.route.navigate(['studentlogin']);
  }
  librarianLogut(){
    this.isLibrarian=false;
    this.route.navigate(['librarylogin']);
  }
  studentLogin(form) {
    // var USN=form.value.USN;
    // var password=form.value.password;
    var email=form.value.email;
    var password=form.value.password;
    return this.http.post<any>(`http://localhost:8080/lms/studentLogin/${email}/${password}`, form.value);
  }
  adminLogin(form) {
    
    var id=form.value.id;
    var password=form.value.password;
    return this.http.post<any>(`http://localhost:8080/lms/adminlogin/${id}/${password}`, form.value).subscribe(data=>{
      console.log("data is ",data.adminBeans);
      if(data.adminBeans!=null){
        this.isAdmin = true;
        this.route.navigate(['adminHome'])
        console.log(this.isAdmin);
      }else{
        this.route.navigate(['adminlogin']);
      }
    }, err=>{
      console.log("data not found");
    }, ()=>{
      console.log("data")
    })
  }
  registerStudent(form){
    var response;
    return this.http.post<any>(`http://localhost:8080/lms/registerStudent`,form.value).subscribe(data=>{
      console.log("data is added",data)
      response=data.statusCode;
      console.log(response);
    },err=>{
      console.log("data is not added")
    }, ()=>{
      console.log("data")
    })
  }
  registerLibrarian(form){
    var response;
    return this.http.put<any>(`http://localhost:8080/lms/registerLibrarian`,form).subscribe(data=>{
      console.log("data is added",data)
      console.log(response);
    },err=>{
      console.log("data is not added")
    }, ()=>{
      console.log("data")
    })
  }

  deleteLibrarian(form){
    var lid=form.lid;
    return this.http.delete<any>(`http://localhost:8080/lms/deleteLibrarian/${lid}`);

  }

  deleteStudent(form){
    var response;
    console.log(form.sid)
    const id=form.sid;
    return this.http.delete<any>(`http://localhost:8080/lms/deleteStudent/${id}`).subscribe(data=>{
      console.log("data is added",data)
      console.log(response);
    },err=>{
      console.log("data is not added")
    }, ()=>{
      console.log("data")
    })
  }
}
