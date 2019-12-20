import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  add(addProduct): Observable<any> {
    return this.http.post('http://localhost:8080/add', addProduct);
  }

  update(productUpdate): Observable<any>{
    return this.http.put('http://localhost:8080/modify', productUpdate);
  }
  getName(product): Observable<any>{
    return this.http.get(`http://localhost:8080/search/${product.name}`);
  }

  getCategory(categoryProduct): Observable<any>{
    return this.http.get(`http://localhost:8080/searchcategory/${categoryProduct.category}`);
  }
  getCompany(companyProduct): Observable<any>{
    return this.http.get(`http://localhost:8080/searchcompany/${companyProduct.company}`);
  }
}
