import { Component, Input, OnInit } from '@angular/core';

import { SharedService } from './../../shared.service';

@Component({
  selector: 'app-add-edit-emp',
  templateUrl: './add-edit-emp.component.html',
  styleUrls: ['./add-edit-emp.component.css']
})
export class AddEditEmpComponent implements OnInit {

  constructor(private service:SharedService) { }

  @Input() emp:any;
  employee_id:string="";
  employee_name:string="";
  department:string="";
  date_of_joining:string="";
  photo_file_name:string="";
  photo_file_path:string="";

  DepartmentList:any=[];

  ngOnInit(): void {
    this.loadAllDepartmentList();
  }

  loadAllDepartmentList(){
    this.service.getAllDepartmentName().subscribe(data=>{
      this.DepartmentList=data;

      this.employee_id=this.emp.employee_id;
      this.employee_name=this.emp.employee_name;
      this.department=this.emp.department;
      this.date_of_joining=this.emp.date_of_joining;
      this.photo_file_name=this.emp.photo_file_name;
      this.photo_file_path=this.service.Photo_Url+this.photo_file_path;
    });
  }

  addEmployee(){
    var val={
      employee_id: this.employee_id,
      employee_name: this.employee_name,
      department: this.department,
      date_of_joining: this.date_of_joining,
      photo_file_name: this.photo_file_name
    };

    this.service.addEmployee(val).subscribe(res=>{
      alert(res.toString());
    });
  }

  updateDepartment(){
    var val={
      employee_id: this.employee_id,
      employee_name: this.employee_name,
      department: this.department,
      date_of_joining: this.date_of_joining,
      photo_file_name: this.photo_file_name
    };

    this.service.updateEmployee(val).subscribe(res=>{
      alert(res.toString());
    });
  }

  uploadPhoto(event:any){
    var file=event.target.files[0];
    const formData:FormData=new FormData();
    formData.append('uploadedFile',file,file.name);

    this.service.uploadPhoto(formData).subscribe((data:any)=>{
      this.photo_file_name=data.toString();
      this.photo_file_path=this.service.Photo_Url+this.photo_file_path;
    })
  }

}
