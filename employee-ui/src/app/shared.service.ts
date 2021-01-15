import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SharedService {
  readonly API_URL="http://localhost:8080/api";
  readonly Photo_Url="http://localhost:8080/photos";

  constructor(private http:HttpClient) { }

  //department API
  getDepartment():Observable<any[]>{
    return this.http.get<any>(this.API_URL+"/department");
  }

  addDepartment(val:any){
    return this.http.post(this.API_URL+"/department", val);
  }

  updateDepartment(val:any){
    return this.http.put(this.API_URL+"/department", val);
  }

  deleteDepartment(val:any){
    return this.http.delete(this.API_URL+"/department/"+val)
  }

  // Employee API
  getEmployee():Observable<any[]>{
    return this.http.get<any>(this.API_URL+"/employee");
  }

  addEmployee(val:any){
    return this.http.post(this.API_URL+"/employee", val);
  }

  updateEmployee(val:any){
    return this.http.put(this.API_URL+"/employee", val);
  }

  deleteEmployee(val:any){
    return this.http.delete(this.API_URL+"/employee/"+val)
  }

  uploadPhoto(val:any){
    return this.http.post(this.API_URL+"/employee/saveFile",val);
  }

  getAllDepartmentName():Observable<any[]>{
    return this.http.get<any>(this.API_URL+"/employee/getAllDepartmentName");
  }

}
